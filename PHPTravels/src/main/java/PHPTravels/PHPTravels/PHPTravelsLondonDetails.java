package PHPTravels.PHPTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPTravelsLondonDetails {

	@FindBy(xpath = "//*[@id=\"adults\"]")
	private WebElement adultList;
	
	@FindBy(xpath = "//*[@id=\"adults\"]/option[3]")
	private WebElement adultQuantitySelection;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[1]/div/input")
	private WebElement checkInDate;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[2]/div/input")
	private WebElement checkOutDate;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[5]/input[3]")
	private WebElement modifyButton;
	
	@FindBy(xpath = "//*[@id=\"ROOMS\"]/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/label")
	private WebElement oneBedroomApartment;
	
	@FindBy(xpath = "//*[@id=\"ROOMS\"]/div/button")
	private WebElement bookingButton;
	
	public void checkInDate(String text) { 
		checkInDate.click();
		checkInDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		checkInDate.sendKeys(Keys.BACK_SPACE);
		checkInDate.sendKeys(text);  
	}

	public void checkOutDate(String text) {
		checkOutDate.click(); 
		checkOutDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		checkOutDate.sendKeys(Keys.BACK_SPACE);
		checkOutDate.sendKeys(text);    
	}  
	 
	public void selectAdults(Actions action) {  
		checkOutDate.click(); 
		action.sendKeys(Keys.TAB);  
		action.sendKeys("3").perform();   
	}  
	 
	public void updateChoices() {
		modifyButton.click(); 
	} 
	 
	public void selectRoom(Actions action,WebDriver driver)                                                                            {
		action.moveToElement(bookingButton).perform();
		WebElement oneBedroomApartmentClick = (new WebDriverWait(driver,10))
				.until(ExpectedConditions.elementToBeClickable(oneBedroomApartment));
		oneBedroomApartmentClick.click();       
	} 
	
	public void comfirmBooking() throws InterruptedException {
	bookingButton.click();
	Thread.sleep(3000);
	}
}  