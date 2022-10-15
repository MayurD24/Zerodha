package fundModule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.Base1;
import pomClasses.LoginPage;

public class verifyUserCanAddFunds {

	WebDriver driver;
	
	LoginPage lp;
	
	@BeforeClass
	public void beforeClass() {
		driver = Base1.getDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		lp = new LoginPage(driver);
	}
	
	@Test
	public void verifyUserCanLogin() throws IOException {
		lp.enterUserID();
		lp.enterPassword();
		lp.clickOnLoginBtn();
	}
	
	@AfterMethod
	public void afterMethod() {
		
	}
	
	@AfterClass
	public void afterClass() {
		
	}
}
