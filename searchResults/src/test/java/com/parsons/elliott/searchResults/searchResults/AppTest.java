package com.parsons.elliott.searchResults.searchResults;

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

public class AppTest {
	
	String currentSearch = "";
	static WebDriver driver;
	static ExtentTest test;
	static ExtentReports extent;
	
	@Before 
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		extent = Runner.extent;
		driver = new ChromeDriver();
	}
	
	@After  
	public void teardown() {  
		driver.quit(); 
	}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String text) {
		test = extent.startTest("SearchResultTest");
		currentSearch = text.replace(" ","+");
		driver.manage().window().maximize();
		driver.get(text);
	} 
 
	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String text) {
		test.log(LogStatus.INFO,"Searching for "+currentSearch);
		BingHomePage homepage = PageFactory.initElements(driver, BingHomePage.class);
		homepage.inputText(text);
		homepage.submitSearch();
	}
 
	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search()  { 
		test.log(LogStatus.INFO,"Checking the correct page has returned");
		SearchResult searchResult = PageFactory.initElements(driver, SearchResult.class);	
		boolean passResult = false;
		if (driver.getCurrentUrl().contains(currentSearch)){
				passResult = true;
				test.log(LogStatus.PASS, "PASS");
		}
		else {
			test.log(LogStatus.FAIL, "FAIL");
		}
		assertEquals(true, passResult); 
	} 
}