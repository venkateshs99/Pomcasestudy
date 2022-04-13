package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin{
	@Test
	public void TestUser() {
			WebDriver driver = BrowserFactory.BrowserOptions("Chrome", "https://opensource-demo.orangehrmlive.com/");
			LoginPage loginOrgHRM = PageFactory.initElements(driver,LoginPage.class);
			loginOrgHRM.LoginOrgHRM("Admin", "admin123");
	}
}

