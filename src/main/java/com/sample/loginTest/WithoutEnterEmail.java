package com.sample.loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WithoutEnterEmail {
	
	public WebDriver driver;
	
	
	public void withoutEnterEmail() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32(V_86)\\chromedriver.exe");
		
	 driver=new ChromeDriver();
		
	 driver.manage().window().maximize();
	 
	 driver.manage().deleteAllCookies();
	 
	 driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Denglish%2Bto%2Btamil%26oq%3De%26aqs%3Dchrome.0.69i59l2j0j69i57j46i131i199i291i433i457j0i131i433j69i60l2.1786j0j4%26sourceid%3Dchrome%26ie%3DUTF-8&ec=GAlAAQ&flowName=GlifWebSignIn&flowEntry=AddSession");
	 
	WebElement nextButton= driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]"));
	
	nextButton.click();
	
	String expectedData=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label");
	
	String actualData="Email or phone";
	
	Assert.assertEquals(actualData, expectedData);
		
		
		
	}

}
