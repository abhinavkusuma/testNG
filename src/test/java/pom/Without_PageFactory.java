package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Without_PageFactory {
	WebDriver driver;

//	Constructor
	public Without_PageFactory(WebDriver driver) {
		this.driver=driver;
	}
	
//	Locators
	By txt_username=(By.xpath("//input[@placeholder='Username']"));
	By txt_password=(By.xpath("//input[@placeholder='Password']"));
	By btn_login=(By.xpath("//button[normalize-space()='Login']"));
	
//	Action Methods
	public void setUserName(String user) {
		driver.findElement(txt_username).sendKeys("Admin");
	}
	public void setPassword(String pass) {
		driver.findElement(txt_password).sendKeys("admin123");
	}
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
}