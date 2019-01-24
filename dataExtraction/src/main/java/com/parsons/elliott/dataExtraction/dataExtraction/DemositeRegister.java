package com.parsons.elliott.dataExtraction.dataExtraction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemositeRegister {

	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
	WebElement inputUsername;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
	WebElement inputPassword;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
	WebElement save;
	
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	WebElement loginButton;
	
	public void inputUsername(String text) {
		inputUsername.sendKeys(text);
	}
	
	public void inputPassword(String text) {
		inputPassword.sendKeys(text);
	}
	
	public void save() {  
		save.click();
	} 
	
	public void changeToLoginPage() {
		loginButton.click();
	}
	
}
