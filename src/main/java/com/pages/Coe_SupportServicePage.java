package com.pages;

import org.openqa.selenium.WebDriver;

public class Coe_SupportServicePage {

	private WebDriver driver;
	
	public Coe_SupportServicePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getSupportServicePageTitle() {
		 return driver.getTitle();
	}
	
	

}
