package com.parsons.elliott.dataExtraction.dataExtraction;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemositeTest {
	static WebDriver driver;
	static ExtentTest test;
	static ExtentReports extent;

	@BeforeClass
	public static void instanceSetup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
	extent = new ExtentReports("C:\\Users\\Admin\\Documents\\Report.html");
	driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@AfterClass 
	public static void reportGen() {
		extent.flush();
	}
	
	@Test
	public void createUserLoginUser() throws IOException, FileNotFoundException {
		
		FileInputStream file = new FileInputStream(Constants.pathTestData + (Constants.fileTestData));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
	
			Cell username = sheet.getRow(i).getCell(0);
			Cell password = sheet.getRow(i).getCell(1);
			
			String user = username.getStringCellValue();
			String pass = password.getStringCellValue();
			
			test = extent.startTest("Verify application booking : " + user);
			
			DemositeHomepage homepage = PageFactory.initElements(driver, DemositeHomepage.class);
			DemositeRegister registerpage = PageFactory.initElements(driver, DemositeRegister.class);
			DemositeLogin loginpage = PageFactory.initElements(driver, DemositeLogin.class);
		
			test.log(LogStatus.INFO,"Load browser and Demosite homepage");
			driver.manage().window().maximize();
			driver.get(Constants.websiteURL);
			homepage.changeToRegisterPage();
			test.log(LogStatus.INFO,"Creating user");
			registerpage.inputUsername(user);
			registerpage.inputPassword(pass);
			registerpage.save();
			registerpage.changeToLoginPage();
			test.log(LogStatus.INFO,"Login as user");
			loginpage.loginUsername(user);
			loginpage.loginPassword(pass);
			loginpage.submitLogin();
			ExcelUtils.setExcelFile(Constants.pathTestData+Constants.fileTestData, 0);
			extent.endTest(test);			
				if (loginpage.getResult().equals("**Successful Login**")) {
					test.log(LogStatus.PASS,"Pass");	
					ExcelUtils.setCellData("Pass",i,2);
				}else {
					test.log(LogStatus.FAIL,"Fail");
					ExcelUtils.setCellData("Fail",i,2);
				}
			assertEquals("**Successful Login**",(loginpage.getResult()));
		}
	}
}
