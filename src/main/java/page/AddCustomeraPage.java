package page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddCustomeraPage extends BasePage {
	WebDriver driver;

	public AddCustomeraPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//i[@class='icon-users']")
	WebElement CUSTOMERS_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]")
	WebElement ADD_CUSTOMER_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement User_name_field;
	@FindBy(how = How.XPATH, using = "//*[@id='cid']")
	WebElement Company_name_field;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement Email_field;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement Phone_number_field;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement Address_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement City_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement State_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement Zip_Field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"group\"]")
	WebElement Group_dropdown_Field;
	// @FindBy(how=How.XPATH, using ="//span[@id='select2-country-container']")
	// WebElement Country_Field;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement Save_Field;
	@FindBy(how = How.XPATH, using = "//a[@id='summary']")
	WebElement SUMMARY_BUTTON_LOCATOR;
	// @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	// WebElement LIST_CUSTOMERS_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[text() ='List Customers']")
	WebElement LIST_CUSTOMERS_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[1]")
	WebElement LIST_CUSTOMERS_ADD_CUSTMOR_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='foo_filter']")
	WebElement SEARCH_ON_LIST_CUSTMOT_PAGE_LOCATOR;
	
	//*[@id="page-wrapper"]/div[3]/div[1]/div/div/div[1]/a[1]
	


//Intractive Methods
	public void clickoncustmorbutton() {
		CUSTOMERS_BUTTON_LOCATOR.click();
	}

	public void clickonAddcostmer() {
		WaitForElement(driver, 3, ADD_CUSTOMER_BUTTON_LOCATOR);
		ADD_CUSTOMER_BUTTON_LOCATOR.click();
	}

	String enterranName;

	public void enterfullname(String username) {
		enterranName = username + RandomGenerator();
		WaitForElement(driver, 3, User_name_field);
		User_name_field.sendKeys(enterranName);
	}

	public void entercompany(String company) {
		SelectDropDown(Company_name_field, company);

	}

	public void enteremaiaddress(String email) {
		String emailrannum = RandomGenerator() + email;
		Email_field.sendKeys(emailrannum);
	}

	public void enterphonenumber(String phonenumber) {
		String phonerannum = RandomGenerator() + phonenumber;
		Phone_number_field.sendKeys(phonerannum);
	}

	public void enteraddress(String address) {
		Address_Field.sendKeys(address);
	}

	public void entercity(String city) {
		City_Field.sendKeys(city);
	}

	public void enterstate(String state) {
		State_Field.sendKeys(state);
	}

	public void enterzip(String zip) {
		Zip_Field.sendKeys(zip);
	}

	public void insertGroup(String group) {
		SelectDropDown(Group_dropdown_Field, group);
		// WaitForElement(driver, 3, Group_dropdown_Field);
	}

	public void ClickOnSavebutton() {
		Save_Field.click();
	}

	public void clickOnListCustomersButton() {
		//WaitForElement(driver, 4, SUMMARY_BUTTON_LOCATOR);
		LIST_CUSTOMERS_BUTTON_LOCATOR.click();
	}
	public void ClickOnaddcustmorbuttononListPage() {
		LIST_CUSTOMERS_ADD_CUSTMOR_LOCATOR.click();
	}
	public void SearchOnListPage() {
		SEARCH_ON_LIST_CUSTMOT_PAGE_LOCATOR.click();
	}
	public void clickOnListCustomersButtonForNew() {
		WaitForElement(driver, 4, SUMMARY_BUTTON_LOCATOR);
		LIST_CUSTOMERS_BUTTON_LOCATOR.click();
	}

//tbody/tr[1]/td[3]
//tbody/tr[2]/td[3]
//tbody/tr[3]/td[3]

	String before_xpath = "//tbody//tr[";
	String after_xpath = "]//td[3]";

	public void verifyEnteredCustomerAndDelete() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(before_xpath + i + after_xpath);
				Thread.sleep(1000);
				String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
				Thread.sleep(1000);
				System.out.println("DAta is :" + name);
				 //Assert.assertEquals(name,"Microsoft Excell670", "Name does not match!!!");

				
				  if(name.contains(enterranName)) { System.out.println("Entered name exists");
				  driver.findElement(By.xpath("//tbody/tr["+ i
				  +"]/td[3]/following-sibling::td[4]/a[2]")).click(); WaitForElement(driver, 3,
				  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")));
				  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")).
				  click(); }
				 

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		public void verifyEnteredCustomerAndClickViewSummary() {

			try {
				for (int i = 1; i <= 5; i++) {
					System.out.println(before_xpath + i + after_xpath);
					Thread.sleep(1000);
					String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
					Thread.sleep(1000);
					System.out.println("DAta is :" + name);
					 //Assert.assertEquals(name,"Microsoft Excell670", "Name does not match!!!");

					
					  if(name.contains(enterranName)) { System.out.println("Entered name exists");
					  driver.findElement(By.xpath("//tbody/tr["+ i
					  +"]/td[3]/following-sibling::td[4]/a[1]")).click(); WaitForElement(driver, 3,
					  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")));
					  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")).
					  click(); 
					  
					 
					  } 
					  
				}
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			 

	}
}
