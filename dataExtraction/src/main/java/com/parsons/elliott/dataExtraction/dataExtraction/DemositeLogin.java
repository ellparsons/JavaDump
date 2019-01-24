package com.parsons.elliott.dataExtraction.dataExtraction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemositeLogin {

	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	WebElement loginUsername;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	WebElement loginPassword;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	WebElement submitLogin;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	static WebElement testResult;
	
	public void loginUsername(String text) {
		loginUsername.sendKeys(text);
	} 
	
	public void loginPassword(String text) {
		loginPassword.sendKeys(text);
	}
	
	public void submitLogin() {
		submitLogin.click();
	}
	
	public  String getResult() {
		return testResult.getText();
	}
}
