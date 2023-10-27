package com.pages;

import org.openqa.selenium.WebDriver;

public class Coe_MartechPage {

	private WebDriver driver;
	
	public Coe_MartechPage(WebDriver driver) {
		this.driver=driver;
	}

	public String getMartechPageTitles() {
	  return driver.getTitle();
	}

}
