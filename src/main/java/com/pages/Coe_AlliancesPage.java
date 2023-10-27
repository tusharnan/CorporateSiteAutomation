package com.pages;

import org.openqa.selenium.WebDriver;

public class Coe_AlliancesPage {

	private WebDriver driver;
	
	public Coe_AlliancesPage(WebDriver driver) {
	this.driver=driver;
	}
	
	public String getAlliancesPageTitle() {
		return driver.getTitle();
	}

}
