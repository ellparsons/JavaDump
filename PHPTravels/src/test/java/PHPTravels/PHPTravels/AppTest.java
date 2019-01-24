package PHPTravels.PHPTravels;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AppTest {
	static WebDriver driver;
	static Actions action;
	static ExtentTest test;
	static ExtentReports extent;
	
	@BeforeClass 
	public static void instanceSetup() { 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
	extent = new ExtentReports("C:\\Users\\Admin\\Documents\\Report.html");
	test = extent.startTest("Verify application booking");
	driver = new ChromeDriver();
	action = new Actions(driver);
	} 
	 
	@Before
	public void setup() {
		
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
	public void searchBookLondonHotel() throws InterruptedException {
		WebElement testResult=driver.findElement(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[1]/td/div"));
		driver.manage().window().maximize(); 
		driver.get("https://www.phptravels.net/"); 
		test.log(LogStatus.INFO,"Browser and website loaded");
		PHPTravelsHome page = PageFactory.initElements(driver, PHPTravelsHome.class); 
		PHPTravelsSearch page1 = PageFactory.initElements(driver, PHPTravelsSearch.class);
		PHPTravelsLondonDetails page2 = PageFactory.initElements(driver, PHPTravelsLondonDetails.class);
		PHPBooking page3 = PageFactory.initElements(driver, PHPBooking.class);
		PHPInvoice page4 = PageFactory.initElements(driver, PHPInvoice.class);
		test.log(LogStatus.INFO,"Input navigation bar parameters");
		page.searchFor("London",driver);
		page.checkInDate("25/07/2019");    
		page.checkOutDate("27/07/2019");     
		page.openAttendees(); 
		page.increaseAdults(); 
		page.searchForListings();
		test.log(LogStatus.INFO,"Navigating through pages to London");
		page1.changeToPageTwo();    
		page1.openLondonHotelDetails();  
		test.log(LogStatus.INFO,"Input check in, check out dates and amount of attendees");
		page2.checkInDate("25/07/2020");;  
		page2.checkOutDate("27/07/2020");   
		page2.selectAdults(action);  
		page2.updateChoices();  
		page2.selectRoom(action,driver);   
		page2.comfirmBooking(); 
		page3.enterForename("Bob"); 
		page3.enterSurname("Smith");
		page3.enterEmail("bob@gmail.com"); 
		page3.confirmEmail("bob@gmail.com");  
		page3.confirmBooking(action,driver);  
		page4.payOnArrival(action,driver); 
		test.log(LogStatus.PASS,"Verify booking ability");
//		test.pass
//			if (testResult.getText() == "                    Unpaid                ")
//		  
//		extent.endTest(test);
//		assertEquals("                    Unpaid                ", testResult.getText());
//		
	}     
	     
}
 