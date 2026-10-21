package com.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.pages.SearchPage;

public class SearchTest 
{
	
	WebDriver driver;
	WebDriverWait wait;
	SearchPage searchpage ;
	
	@BeforeMethod
	public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		searchpage = new SearchPage(driver);
	}
	
	@Test
	public void verifySearch() {
		searchpage.openHomePage();		
		searchpage.searchProduct("laptop");
		
		
		   Assert.assertTrue(
	                driver.getCurrentUrl().contains("q=laptop"),
	                "Search results URL should contain the search query");
		
	}
	

}
