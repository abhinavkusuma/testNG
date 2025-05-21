package sele.testng_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class Data_Providers {
    WebDriver driver;
    @BeforeClass
    void setup() {
        driver = new ChromeDriver();  
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
    }
    @DataProvider(name = "countryProvider")
    Object[][] countryData() {
        return new Object[][] {
            {"India"},
            {"Australia"},
            {"Brazil"},
            {"China"},
            {"Denmark"}
        };
    }
    @Test(dataProvider = "countryProvider")
    void testSelectCountry(String country) {
        WebElement dropdown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(country);
        System.out.println("Selected Countries : "+country);
    }
    @AfterClass
    void tearDown() {
            driver.quit();
    }
}