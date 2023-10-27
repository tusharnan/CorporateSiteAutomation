package com.pages;

import org.openqa.selenium.WebDriver;

public class DigitalProductEngineeringPage {

	private WebDriver driver;
	public DigitalProductEngineeringPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getDigitalProjectEngineeringPageTitle() {
		return driver.getTitle();
	}

	
}
