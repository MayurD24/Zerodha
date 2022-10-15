package pomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilClasses.Util1;

public class LoginPage extends Util1{

	WebDriver driver;
	
	@FindBy(id = "userid")
	private WebElement userID;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void enterUserID() throws IOException {
		userID.sendKeys(getConfigData("userId"));
	}
	
	public void enterPassword() throws IOException {
		password.sendKeys(getConfigData("password"));
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();;
	}
}
