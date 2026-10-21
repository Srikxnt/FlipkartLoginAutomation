package com.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.flipkart.pages.SearchPage;

public class SearchTest extends BaseTest {
	
	
	   @DataProvider(name = "productData")
	    public Object[][] getProductData() {

	        return new Object[][] {
	            {"laptop"},
	            {"mobile"},
	            {"headphones"},
	            {"smartwatch"}
	        };
	    }
	
	
	@Test(dataProvider = "productData")
	public void verifySearch(String product) {
		SearchPage searchPage = new SearchPage(driver);
		
		searchPage.openHomePage();		
		searchPage.searchProduct(product);
		
		
//		   Assert.assertTrue(
//	                driver.getCurrentUrl().contains("q={product}"),
//	                "Search results URL should contain the search query");
		
	}
	

}
