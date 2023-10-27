package com.pages;

import org.openqa.selenium.WebDriver;

public class DecisionMinePage {
	
	
	private WebDriver driver;
	public DecisionMinePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getDecisionMinePageTitle() {
		return driver.getTitle();
	}
}
