package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnalystSpeakPage {

	private WebDriver driver;
    private By title = By.cssSelector(".block-title");
	
	
	public AnalystSpeakPage(WebDriver driver) {
		this.driver =driver;
	}

	public String getAnalystSpeakPageTitle() {
	 return  driver.getTitle();	
	}
	
	public String getAnalystPageHeading() {
		return driver.findElement(title).getText();
	}
	
}
