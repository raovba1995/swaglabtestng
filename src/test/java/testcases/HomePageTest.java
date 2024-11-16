package testcases;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends BaseClass{
	
	@Test
	public void TC01_AddToCartTest() {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");
		HomePage hp = new HomePage();
		hp.ValidateSucess("Sauce Labs Backpack");
		
	}


}
