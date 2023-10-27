package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MediaAndAdvertisingPage {
	
	private WebDriver driver;
	private By burgerMenu_MediaAndAdvertising = By.xpath("(//a[contains(text(),'Media & Advertising')])[2]");
	private By burgerMenu_MediaAndAdvertising_overview = By.xpath("//a[@href='/industries/media-advertising'][normalize-space()='Overview']");
    private By burgerMenu_AdTech = By.xpath("//div[@class='wrapper']//a[normalize-space()='Ad Tech']");
    private By burgerMenu_AdvertisingAndMarketing = By.xpath("(//a[contains(text(),'Advertising and Marketing')])[2]");
    private By burgerMenu_Publishing = By.xpath("(//a[contains(text(),'Publishing')])[2]");
    private By burgerMenu_videoStreaming = By.xpath("//div[@class='wrapper']//a[normalize-space()='Video Streaming & OTT']");
    private By burgerMenu_EntertainmentProduction = By.xpath("//div[@class='wrapper']//a[normalize-space()='Entertainment Production']");
    
    
    
	public MediaAndAdvertisingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnMediaAndAdvertising() {		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_MediaAndAdvertising));
		driver.findElement(burgerMenu_MediaAndAdvertising).click();
	}
	
	public void clickOnMediaAndAdvertisingOverview() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_MediaAndAdvertising_overview));
		driver.findElement(burgerMenu_MediaAndAdvertising_overview).click();
	}
	
	public String getMediaAndAdvetisingPageTitle() {
	   String title = driver.getTitle();
	   return title;
		
	}

	public void clickOnAdTechSubvertical() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_AdTech));
		driver.findElement(burgerMenu_AdTech).click();
		
	}
	
	public void clickOnAdvertisingAndMarketingSubvertical() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_AdvertisingAndMarketing));
		driver.findElement(burgerMenu_AdvertisingAndMarketing).click();
	}
	
	public void clickOnPublishingSubvertical() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_Publishing));
		driver.findElement(burgerMenu_Publishing).click();
	}
	
	public void clickOnVideoStreamingSubvertical() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_videoStreaming));
		driver.findElement(burgerMenu_videoStreaming).click();
	}
	
	public void clickOnEntertainmentProductionSubvertical() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_EntertainmentProduction));
		driver.findElement(burgerMenu_EntertainmentProduction).click();
	}
	
}
