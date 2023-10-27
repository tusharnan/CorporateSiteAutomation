package com.pages;

import org.openqa.selenium.WebDriver;

public class Coe_BiPage {
	
	private WebDriver driver;

	public Coe_BiPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String Coe_BiPage() {
		return driver.getTitle();
	}

	public String getBiPageTitle() {
       return driver.getTitle();		
	}

}
