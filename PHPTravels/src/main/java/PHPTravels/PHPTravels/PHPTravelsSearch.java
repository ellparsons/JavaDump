package PHPTravels.PHPTravels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PHPTravelsSearch { 
	
	@FindBy(xpath="//*[@id=\"body-section\"]/div[5]/div/div[3]/div[2]/ul/li[3]/a")
	private WebElement pageTwoButton; 
	
	@FindBy(xpath="//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[2]/td/div[3]/a/button")
	private WebElement openLondonHotelDetails;
	
	public void changeToPageTwo() { 
		pageTwoButton.click(); 
	}  
	public void openLondonHotelDetails() { 
		openLondonHotelDetails.click();
	}	  
}
  