package com.pages;

import org.openqa.selenium.WebDriver;

public class ArchitecturalServices {

	private WebDriver driver;
	public ArchitecturalServices(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getArchitectrualServicesPageTitle() {		
		return  driver.getTitle();
	}

	
}
