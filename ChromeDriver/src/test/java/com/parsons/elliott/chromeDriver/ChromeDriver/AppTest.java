package com.parsons.elliott.chromeDriver.ChromeDriver;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppTest {
	WebDriver driver;
	
	 
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After 
	public void teardown() { 
		driver.quit();
	} 
	@Ignore
	@Test
	public void goToSiteAddUserLoginUser() throws InterruptedException {
		String username="Gooch";
		String password="Hello?";
		driver.manage().window().maximize();
		driver.get("http://www.thedemosite.co.uk/index.php");
		driver.findElement(By
				.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"))
				.click();
		driver.findElement(By
				.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"))
				.sendKeys(username);
		driver.findElement(By
				.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"))
				.click();
		driver.findElement(By
				.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"))
				.click();
		driver.findElement(By
				.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"))
				.sendKeys(username);
		driver.findElement(By
				.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"))
				.sendKeys(password);
		driver.findElement(By
				.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"))
				.click();
		WebElement testResult = driver.findElement(By
				.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		
		assertEquals("**Successful Login**", testResult.getText());
		
		Thread.sleep(3000); 
	} 
	
	@Test ///Unfinished//
	public void pickItemAddToCartGoToPurchaseScreen() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By
				.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a")).click();
		WebElement quantityIncrease = driver.findElement(By
				.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i"));
				quantityIncrease.click();
				quantityIncrease.click();   
		driver.findElement(By
				.id("group_1")).click();
		Select droplist = new Select(driver.findElement(By
				.id("group_1")));
		droplist.selectByVisibleText("M");
		driver.findElement(By  
				.xpath("//*[@id=\"add_to_cart\"]/button/span")).click(); 
		Thread.sleep(1500);
		driver.findElement(By
				.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click(); 
		Thread.sleep(1000);
		driver.findElement(By 
				.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();   
		WebElement createEmailAddress = driver.findElement(By
				.xpath("//*[@id=\"email_create\"]"));
		createEmailAddress.sendKeys("test@test.com");
		Thread.sleep(2000); 
		driver.findElement(By 
				.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		Thread.sleep(2000);
		WebElement testResult = driver.findElement(By
				.xpath("//*[@id=\"create_account_error\"]/ol/li")); 
		assertEquals("An account using this email address has already been registered. Please enter a valid password or request a new one. ",testResult.getText());
		Thread.sleep(1000);   
		
		 
		 
	} 
		 
}
  