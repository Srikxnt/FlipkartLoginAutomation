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

import com.flipkart.pages.LoginPage;

public class Logintest extends BaseTest {
	
	
	@Test
	public void verifylogin() {
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.loginpge();
		String phonenumber="1234567890";
		
		loginpage.enterPhoneNumber(phonenumber); 
		
		

	String actualPhone= loginpage.getPhoneNumber();	
	
	  Assert.assertTrue(
              actualPhone.matches("\\d{10}"),
              "Phone number must contain exactly 10 digits");
	  	
	
	  //Bypassing the OTP based login
//	  loginpage.clickContinue();

		
	}

}
