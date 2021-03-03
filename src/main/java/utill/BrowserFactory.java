package utill;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver   driver;
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC31\\eclipse-workspace\\DataDrivenXML\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("http://www.techfios.com/billing/?ng=admin/");
		return driver;
	}
 public void teardown() throws InterruptedException {
	 driver.close();
	 Thread.sleep(2000);
 }
}
