package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
	private WebDriver driver;
    private By searchText=By.cssSelector(".showing-records");
   
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getSearchPageTitle() {
		
		return driver.getTitle();
	}

	public String getSearchText() {
		
		return  driver.findElement(searchText).getText();
		
	}
	
	
		
	

}
