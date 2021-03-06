package com.parsons.elliott.teaTesting.TeaTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeaTestingMenu {
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
	WebElement greenTea;
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")
	WebElement redTea;
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231735\"]/div/p/span/span/strong")
	WebElement oolongTea;
	
	public String checkGreenTea() {
		return greenTea.getText();
	}
	 
	public String checkRedTea() {
		return redTea.getText();
	}
	
	public String checkOolongTea() {
		return oolongTea.getText();
	}
	
}