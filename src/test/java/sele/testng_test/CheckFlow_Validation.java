package sele.testng_test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class CheckFlow_Validation {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(priority = 1)
    public void launchSiteAndClosePopup() {
        driver.get("https://www.ulta.com/");
        driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
        takeScreenshot("homepage");
    }

    @Test(priority = 2)
    public void loginToUlta() {
        driver.findElement(By.xpath("//button[@aria-label='Log in to your Ulta account']")).click();
        driver.findElement(By.id("username")).sendKeys("ntr@gmail.com");
        driver.findElement(By.name("password")).sendKeys("NtR@54321");
        takeScreenshot("login_filled");
        driver.findElement(By.xpath("//button[@class=\"c374f5b8a c1085a438 ccdf87e4e cc02a3617 cbb792e2c\"]")).click();
        takeScreenshot("after_login_click");
    }

    @Test(priority = 3)
    public void addItemToCart() {
        driver.findElement(By.xpath("(//img[@alt=\"Shark Beauty FlexStyle Air Styling & Drying System\"])[1]")).click();
        takeScreenshot("product_page");

        driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default AddToBagButton__AddToBag\"]")).click();
        takeScreenshot("after_add_to_bag");

        driver.findElement(By.xpath("//a[@class=\"pal-c-Link pal-c-Link--buttonPrimary pal-c-Link--compact\"]")).click();
        takeScreenshot("cart_page");

        driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default CartActions__CheckoutButton\"]")).click();
        takeScreenshot("checkout_page");
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }

    // Screenshot utility
    public void takeScreenshot(String fileName) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("./Screenshots/" + fileName + ".jpg");
        try {
            FileUtils.copyFile(src, dest);
            System.out.println("Screenshot saved: " + fileName + ".jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}