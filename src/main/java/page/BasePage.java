package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public void WaitForElement(WebDriver driver, int timeInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void SelectDropDown(WebElement element, String visibleString) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleString);
	}
	
	public int RandomGenerator() {
		Random rnd =new Random();
		int rndnum = rnd.nextInt(999);
		return rndnum;
	}


}
