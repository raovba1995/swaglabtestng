package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testcases.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	
	// ==================== Locators ======================
	@FindBy(id = "user-name")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id = "login-button")
	WebElement loginbtn;
	
	@FindBy(xpath = "//h3")
	WebElement Error;
	
	@FindBy(xpath = "//div[text()='Products']")
	WebElement success;
	
	// ====================== Functions =====================
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunction(String UserNameVal, String PwdVal) {
		
		UserName.sendKeys(UserNameVal);

		Password.sendKeys(PwdVal);
		
		loginbtn.click();
		
	}
	
	public void ValidateErrorMsg(String ExpMsg) {

		String ActMsg = Error.getText();
		Assert.assertEquals(ExpMsg, ActMsg);
	}
	
	public void ValidateSucess(String msg) {
		
		String ActMsg1 = success.getText();
		Assert.assertEquals(msg, ActMsg1);
		
	}

}
