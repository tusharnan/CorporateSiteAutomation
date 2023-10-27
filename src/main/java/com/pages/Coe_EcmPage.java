package com.pages;

import org.openqa.selenium.WebDriver;

public class Coe_EcmPage {

	private WebDriver driver;
	public Coe_EcmPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getEcmPageTitle() {
		return driver.getTitle();
	}

}
