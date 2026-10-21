package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	private By Phonenumber= By.xpath("//input[@class='jwCbxy']");
	private By continueButton= By.xpath("//button[normalize-space()='Continue']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	public void loginpge() {
		driver.get("https://www.flipkart.com/login?ret=/");
		wait.until(ExpectedConditions.urlContains("/login"));
	}
	
	public void enterPhoneNumber(String phoneNumber) {
		WebElement phone= wait.until(ExpectedConditions.visibilityOfElementLocated(Phonenumber));
		phone.click();
		phone.clear();
		phone.sendKeys(phoneNumber);
	}
	
	//Bypassing OTP based Login
//	   public void clickContinue() {
//	        wait.until(
//	                ExpectedConditions.elementToBeClickable(continueButton))
//	                .click();
//	    }

	   public String getPhoneNumber() {
				
		return wait.until(
                ExpectedConditions.visibilityOfElementLocated(Phonenumber))
                .getAttribute("value");
	   }
	   
		public void closeDriver() {
			if(driver!=null) {
				driver.quit();
			}
		}
	   
}


