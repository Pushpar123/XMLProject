package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement User_Name_Locator;
	@FindBy(how= How.XPATH, using ="//input[@id='password']") WebElement Password_Locator;
	@FindBy(how=How.NAME, using ="login") WebElement Signing_Button_Locator;


//Interactive Methods

		public void enterUserName(String username) {
			User_Name_Locator.sendKeys(username);
			
			
		}
		public void enterPassword(String password) {
			Password_Locator.sendKeys(password);
		
		}
		
		public void ClickSigninButton() {
			Signing_Button_Locator.click();
			
		}
}
