package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelAndHospitalityPage {
	
	private WebDriver driver;
	
	private By burgerMenu_travelAndHospitality = By.xpath("(//a[contains(text(),'Travel & Hospitality')])[2]");
	private By burgerMenu_travelAndHospitalityOverview = By.cssSelector(".showsubmenu > .third-level-ul li:nth-child(1) > a");
	private By card_Hospitality = By.cssSelector(".pad-0:nth-child(1) > .card a");
    private By menulist_Distribution = By.cssSelector(".standalone:nth-child(1) > .click-me:nth-child(4) > a");
    private By menulist_carRental = By.cssSelector(".standalone:nth-child(1) > .click-me:nth-child(5) > a");
    private By menulist_EventsAndMeeting = By.cssSelector(".standalone:nth-child(1) > .click-me:nth-child(6)");
    private By menulist_Airline =By.cssSelector(".standalone:nth-child(1) > .click-me:nth-child(7)");
    
	public TravelAndHospitalityPage(WebDriver driver) {
		this.driver =driver;
	}

	public void clickOnTravelAndHospitalityVertical() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_travelAndHospitality));
		driver.findElement(burgerMenu_travelAndHospitality).click();
	}
	
	public void clickOnTravelAndHospitalityOverview() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_travelAndHospitalityOverview));
		driver.findElement(burgerMenu_travelAndHospitalityOverview).click();
	}

	public String getTravelAndHospitalityTitles() {
		String title = driver.getTitle();
		return title;
	}

	public void clickOnHospitalityCard() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(card_Hospitality));
		driver.findElement(card_Hospitality).click(); 		
	}

	public void clickOnDistribution() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(menulist_Distribution));
		driver.findElement(menulist_Distribution).click(); 	
		
	}
	
	public void clickOnCarRental() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(menulist_carRental));
		driver.findElement(menulist_carRental).click(); 	
		
	}
	
	public void clickOnAirline() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(menulist_Airline));
		driver.findElement(menulist_Airline).click(); 	
		
	}
	
	public void clickOnEventsAndMeeting() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(menulist_EventsAndMeeting));
		driver.findElement(menulist_EventsAndMeeting).click(); 	
		
	}
	

}
