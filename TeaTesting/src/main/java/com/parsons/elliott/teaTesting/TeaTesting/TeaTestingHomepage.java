package com.parsons.elliott.teaTesting.TeaTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeaTestingHomepage 
{
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	WebElement  menuButton;
	
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")
	WebElement checkOutButton;
	
	public void navigateToMenu() {
		menuButton.click();
	}  
	
	public void navigateToCheckOut() {
		checkOutButton.click();
	}
}
