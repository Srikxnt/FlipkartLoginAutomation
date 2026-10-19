package com.flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class Logintest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();		
	}
	
	@Test
	public void verifylogin() {
		driver.get("https://www.flipkart.com/login?ret=/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		
		wait.until(ExpectedConditions.urlContains("https://www.flipkart.com/login?ret=/"));
		

		
	WebElement phoneNumber=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='jwCbxy']")));
	phoneNumber.click();
	phoneNumber.sendKeys("0000000000");
	
	String phone=phoneNumber.getAttribute("value");
	
	System.out.println("Phone field value: [" + phone + "]");
	System.out.println("Phone field length: " + phone.length());
//	int size=phone.length();	
	
	Assert.assertTrue(phone.matches("\\d{10}"));
	
	WebElement button =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Continue']")));
		
	
	Assert.assertTrue(button.isEnabled());
	button.click();
//	if(size==10) {
//		System.out.println("phoneVerified");
//	}

		
	}
	
	@AfterMethod
	public void closeDriver() {
//		if(driver!=null) {
//			driver.quit();
//		}
	}

}
