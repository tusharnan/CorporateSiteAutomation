package com.pages;

import org.openqa.selenium.WebDriver;

public class Coe_CloudPage {

	private WebDriver driver;
	public Coe_CloudPage(WebDriver driver) {
		this.driver = driver;
	}
	public String getCloudPageTitle() {
        return driver.getTitle();		
	}

	
}
