package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import utill.BrowserFactory;

 
public class LoginTest {
	WebDriver driver;
	
	/*
	 * String username =null; String password = null;
	 */
	
	@Test
	@Parameters({"username", "password"})
	public void validUserShouldBeAbleToLogin(String username, String password ) {
		 driver = BrowserFactory.init();
		 
		 LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		 loginpage.enterUserName(username);
		 loginpage.enterPassword(password);
		 loginpage.ClickSigninButton();
			
			DashBoardPage dashboard =PageFactory.initElements(driver, DashBoardPage.class);
			
		
	}

}
