package sele.testng_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.AssertJUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Parallel_Execution {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException {
		switch (br.toLowerCase()) {
		case "chrome":driver = new ChromeDriver();break;
		case "edge":driver = new EdgeDriver();break;
		case "firefox":driver = new FirefoxDriver();break;
		default:System.out.println("Invalid Browser");return;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		AssertJUnit.assertEquals(status, true);
	}
	@Test(priority=2)
	void testTitle() {
		AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@Test(priority=3)
	void testURL() {
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}