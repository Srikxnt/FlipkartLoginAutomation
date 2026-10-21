package com.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.pages.SearchPage;

public class SearchTest extends BaseTest {
	

	@Test
	public void verifySearch() {
		SearchPage searchPage = new SearchPage(driver);
		
		searchPage.openHomePage();		
		searchPage.searchProduct("laptop");
		
		
		   Assert.assertTrue(
	                driver.getCurrentUrl().contains("q=laptop"),
	                "Search results URL should contain the search query");
		
	}
	

}
