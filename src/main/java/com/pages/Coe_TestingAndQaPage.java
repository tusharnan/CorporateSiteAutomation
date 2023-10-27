package com.pages;

import org.openqa.selenium.WebDriver;

public class Coe_TestingAndQaPage {

	private WebDriver driver;
	public Coe_TestingAndQaPage(WebDriver driver) {
		this.driver = driver;
	}
	public String getTestingAndQaPageTitle() {
		return driver.getTitle();
	}

}
