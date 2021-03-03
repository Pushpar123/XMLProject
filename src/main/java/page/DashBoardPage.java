package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class DashBoardPage {
	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Dashboard Element
	
	@FindBy(how= How.XPATH, using ="//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement Dashboard_search_Locator;
	public void validata_Dashboard_Search_Page() {
		//System.out.println(">>>>>>>>>>>>"+Dashboard_search_Locator.getText());
	//Assert.assertEquals(Dashboard_search_Locator.getText(), "Dashboard", "Wrong Page.");
	}
	

}



