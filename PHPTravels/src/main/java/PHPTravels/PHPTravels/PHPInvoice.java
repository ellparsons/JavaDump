package PHPTravels.PHPTravels;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPInvoice {

	@FindBy(xpath = "//*[@id=\"countdown\"]")
	WebElement timeAnchor;
	
	@FindBy(xpath = "//*[@id=\"21\"]")
	WebElement payOnArrival;
	
	public void payOnArrival(Actions action,WebDriver driver) throws InterruptedException {
		WebElement timeAnchorClick = (new WebDriverWait(driver,10))
				.until(ExpectedConditions.elementToBeClickable(timeAnchor));  
		timeAnchorClick.click();  
		action.sendKeys(Keys.TAB);
		action.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}  
} 
     