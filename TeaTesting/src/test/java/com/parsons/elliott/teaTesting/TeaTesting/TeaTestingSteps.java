package com.parsons.elliott.teaTesting.TeaTesting;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TeaTestingSteps {
 
	static WebDriver driver;
	static ExtentTest test;
	static ExtentReports extent; 
	
	@Before
	public static void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		extent = new ExtentReports("C:\\Users\\Admin\\Documents\\TeaTesting.html",false); 
		driver = new ChromeDriver();
	}
	  
	@After
	public static void tearDown() {
		extent.flush();
		driver.quit();  
	} 
	
	@Given("^the correct web address$") 
	public void the_correct_web_address() {
		test = extent.startTest("Shopping Test : ");
		test.log(LogStatus.INFO,"Loading browser and homepage");
		driver.get(Constants.URL);
	}
 
	@When("^I navigate to the 'Menu' page$") 
	public void i_navigate_to_the_Menu_page() {
		test.log(LogStatus.INFO,"Navigate to menu page");
		TeaTestingHomepage homepage = PageFactory.initElements(driver, TeaTestingHomepage.class);
		homepage.navigateToMenu();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
		test.log(LogStatus.INFO,"View all menu items");
		TeaTestingMenu menu = PageFactory.initElements(driver, TeaTestingMenu.class);
		extent.endTest(test);
		boolean contentFound = false;
		if (menu.checkGreenTea().equals("Green Tea") && (menu.checkRedTea().equals("Red Tea") && (menu.checkOolongTea().equals("Oolong Tea")))){
			test.log(LogStatus.PASS,"PASS"); 
			contentFound = true;
		}
		assertEquals(true,contentFound); 
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
		test.log(LogStatus.INFO,"Navigate to checkout page");
		TeaTestingHomepage homepage = PageFactory.initElements(driver, TeaTestingHomepage.class);
		homepage.navigateToCheckOut();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
		test.log(LogStatus.INFO,"View checkout page");
		if (driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")) {
			test.log(LogStatus.PASS, "PASS");
		}
		assertEquals("http://www.practiceselenium.com/check-out.html",driver.getCurrentUrl());
	}
}