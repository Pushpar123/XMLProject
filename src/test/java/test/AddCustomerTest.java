package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomeraPage;
import page.DashBoardPage;
import page.LoginPage;
import utill.BrowserFactory;



public class AddCustomerTest {
	WebDriver driver;
	
	
	String username = null;
	String password = null;
	String fullname = null;
	String Companyname = null;
	String Emailaddres = null;
	String Phonenumber = null;
	String Address = null;
	String city = null;
	String State = null;
	String Zip = null;
	String GropName = null;
	
	
	
	//@Test
	@Parameters({"username", "password", "FullName", "Company Name", "Email", "Phone", "Address", "City", "State", "Zip"  })
	public void ValidUserShouldBeAbleToAddCustomer(String username, String password, String fullname, String Companyname, String Emailaddres, String Phonenumber, String Address, String city, String State, String Zip  ) {
		driver = BrowserFactory.init();
	

	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	
	loginPage.enterUserName(username);
	loginPage.enterPassword(password);
	loginPage.ClickSigninButton();
	
	DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);
	dashboardpage.validata_Dashboard_Search_Page();
	
	  
	AddCustomeraPage addcustomer = PageFactory.initElements(driver, AddCustomeraPage.class);
	addcustomer.clickoncustmorbutton();
	addcustomer.clickonAddcostmer();
	addcustomer.enterfullname(fullname);
	addcustomer.entercompany(Companyname);
	addcustomer.enteremaiaddress(Emailaddres);
	addcustomer.enterphonenumber(Phonenumber);
	addcustomer.enteraddress(Address);
	addcustomer.entercity(city);
	addcustomer.enterstate(State);
	addcustomer.enterzip(Zip);
	//addcustomer.insertGroup(GropName);
	addcustomer.ClickOnSavebutton();
	
	//addcustomer.clickoncustmorbutton();
	
	addcustomer.clickOnListCustomersButton();
	addcustomer.verifyEnteredCustomerAndDelete();
	
	
	
	
	
	
	
	}
	@Test
	@Parameters({"username", "password", "FullName", "Company Name", "Email", "Phone", "Address", "City", "State", "Zip"  })
	public void ValidUserShouldBeAbleToAndViewSummary(String username, String password, String fullname, String Companyname, String Emailaddres, String Phonenumber, String Address, String city, String State, String Zip  ) {
		driver = BrowserFactory.init();
	

	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	
	loginPage.enterUserName(username);
	loginPage.enterPassword(password);
	loginPage.ClickSigninButton();
	
	DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);
	dashboardpage.validata_Dashboard_Search_Page();
	
	  
	AddCustomeraPage addcustomer = PageFactory.initElements(driver, AddCustomeraPage.class);
	addcustomer.clickoncustmorbutton();
	addcustomer.clickOnListCustomersButton();
	addcustomer.ClickOnaddcustmorbuttononListPage();
	addcustomer.enterfullname(fullname);
	addcustomer.entercompany(Companyname);
	addcustomer.enteremaiaddress(Emailaddres);
	addcustomer.enterphonenumber(Phonenumber);
	addcustomer.enteraddress(Address);
	addcustomer.entercity(city);
	addcustomer.enterstate(State);
	addcustomer.enterzip(Zip);
	//addcustomer.insertGroup(GropName);
	addcustomer.ClickOnSavebutton();
	
	
	//addcustomer.clickoncustmorbutton();
	
	addcustomer.clickOnListCustomersButtonForNew();
	addcustomer.SearchOnListPage();
	addcustomer.verifyEnteredCustomerAndClickViewSummary();
	
	
	
	
	
	
	
	}



}
