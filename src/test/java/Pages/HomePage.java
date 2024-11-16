package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testcases.BaseClass;

public class HomePage {

	WebDriver driver = BaseClass.driver;

	// ==================== Locators ======================

	@FindBy(xpath = "//*[@id='inventory_container']/div/div[1]/div[3]/button")
	WebElement addtocart;

	@FindBy(xpath = "//*[@id='shopping_cart_container']/a")
	WebElement addtocartlink;

	@FindBy(xpath = "//*[@id='item_4_title_link']/div")
	WebElement success;

	// ====================== Functions =====================

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public void AddtocartFun() {

		addtocart.click();
		addtocartlink.click();
	}

	public void ValidateSucess(String msg) {

		String ActMsg1 = success.getText();
		Assert.assertEquals(msg, ActMsg1);

	}

}
