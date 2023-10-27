package com.pages;

import org.openqa.selenium.WebDriver;

public class NewsroomPage {

	private WebDriver driver;

	public NewsroomPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getNewsroomPageTitle() {
		return driver.getTitle();
	}

	
}
