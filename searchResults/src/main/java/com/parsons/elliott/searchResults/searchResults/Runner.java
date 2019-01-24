package com.parsons.elliott.searchResults.searchResults;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:")
public class Runner {
	
	public static ExtentReports extent;
	
	@BeforeClass
	public static void start() {
		extent = new ExtentReports("C:\\Users\\Admin\\Documents\\searchResultsTest.html");
	}
	
	@AfterClass
	public static void tearDown() {
		extent.flush();
	}
	  
}
  