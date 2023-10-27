package com.pages;

import org.openqa.selenium.WebDriver;

public class CybageTimesPage {

	private WebDriver driver;
	
	public CybageTimesPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getCybageTimesPageTitle() {
		return driver.getTitle();
	}
	
	

}
