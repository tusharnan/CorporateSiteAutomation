package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {

	private WebDriver driver;
	
	private By headerLogo = By.xpath("(//img[@alt='Home'])[2]");
	
	public HeaderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickHeaderLogo() {
	   driver.findElement(headerLogo).click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
}
