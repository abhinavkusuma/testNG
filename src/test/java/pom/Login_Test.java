package pom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	void testLogin() {
//		Without_PageFactory login = new Without_PageFactory(driver);
		With_PageFactory login = new With_PageFactory(driver);
		login.setUserName("Admin");
		login.setPassword("admin123");
		login.clickLogin();
	}
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}