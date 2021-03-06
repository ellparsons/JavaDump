package PHPTravels.PHPTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPTravelsHome {
	@FindBy(xpath = "//*[@id=\"s2id_autogen8\"]/a/span[1]")
	private WebElement searchBoxClick;
	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
	private WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\"dpd1\"]/div/input")
	private WebElement checkInDate;
	
	@FindBy(xpath="//*[@id=\"dpd2\"]/div/input")
	private WebElement checkOutDate;
	
	@FindBy(xpath="//*[@id=\"travellersInput\"]")
	private WebElement openAttendees;
	
	@FindBy(xpath="//*[@id=\"adultPlusBtn\"]")
	private WebElement increaseAdults;
	 
	@FindBy(xpath="//*[@id=\"hotels\"]/form/div[5]/button")
	private WebElement searchForListings;
	
	@FindBy(xpath="//*[@id=\"body-section\"]/div[5]/div/div[3]/div[2]/ul/li[3]/a")
	private WebElement pageTwoButton;
	
	@FindBy(xpath="//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[6]/td/div[3]/a/button")
	private WebElement openLondonHotelDetails;
	 
	public void searchFor(String text,WebDriver driver) throws InterruptedException { 
		searchBoxClick.click();
		searchBox.sendKeys(text);  
		WebElement dropDownChoice = (new WebDriverWait(driver,10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]")));  
		dropDownChoice.click();   
		Thread.sleep(1000);    
	}     
	public void checkInDate(String text) {   
		checkInDate.click();  
		checkInDate.sendKeys(text);   
	}
	public void checkOutDate(String text) {
		checkOutDate.sendKeys(text);  
	}   
	public void openAttendees() {
		openAttendees.click(); 
	}
	public void increaseAdults() {
		increaseAdults.click(); 
	} 
	public void searchForListings() { 
		searchForListings.click();
	} 
} 	
  
  