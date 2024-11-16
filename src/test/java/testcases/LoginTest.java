package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BaseClass  {
	
	@Test
	public void  TC01_LoginSuccessTest() {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");
		lp.ValidateSucess("Products");
	}
	
	@Test
	public void TC02_LoginFailureTest() {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("abc@xyz.com", "Abc@1234");
		lp.ValidateErrorMsg("Epic sadface: Username and password do not match any user in this service");
		
	}
	
	@Test
	public void TC03_LockedUserTest() {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("locked_out_user", "secret_sauce");
		lp.ValidateErrorMsg("Epic sadface: Sorry, this user has been locked out.");
		
	}


}
