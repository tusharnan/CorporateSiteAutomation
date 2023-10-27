package com.pages;

import org.openqa.selenium.WebDriver;

public class Coe_EnterpriseMobilityPage {

	private WebDriver driver;
	
	public Coe_EnterpriseMobilityPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getEnterpriseMobilityPageTitles() {
		return driver.getTitle();
	}
	
}
