package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	WebDriver driver;
	WebDriverWait wait;
	
	private By searchBox =  By.xpath("//form[@class='lilxh_ header-form-search']//input[@placeholder='Search for Products, Brands and More']");
	
	  //Constructor of SearchPage
	   public SearchPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    }
	
	//product search Method
	public void searchProduct(String product) {
		
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
		search.clear();
		
		search.sendKeys(product);
		search.sendKeys(Keys.ENTER);		
	
	}
	
	//Launch Flipkart
	  public void openHomePage() {
	        driver.get("https://www.flipkart.com/");
	    }
	

	   
	    public String getCurrentUrl() {
	        return driver.getCurrentUrl();
	    }

}
