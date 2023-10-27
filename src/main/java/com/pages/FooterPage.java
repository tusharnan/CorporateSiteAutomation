package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FooterPage {

	private WebDriver driver;
	private By ft_AboutUs= By.xpath("(//a[contains(text(),'About Us')])[3]");
	private By ft_Awards = By.xpath("(//a[contains(text(),'Awards')])[3]");
	private By ft_Leadership = By.xpath("(//a[contains(text(),'Leadership')])[3]");
	private By ft_ResponsibleBusiness =By.xpath("(//a[contains(text(),'Responsible Business')])[3]");
	private By ft_CeoDesk = By.xpath("(//a[contains(@href, '/about-us/from-ceos-desk')])[3]");
	private By ft_MediaAndAdvertising = By.xpath("(//a[contains(text(),'Media & Advertising')])[3]");
	private By ft_Hitech = By.xpath("(//a[contains(text(),'Hi-Tech')])[3]");
	private By ft_TravelAndHospitality = By.xpath("(//a[contains(text(),'Travel & Hospitality')])[3]");
	private By ft_supplyChainAndLogistic = By.xpath("(//a[contains(text(),'Supply Chain & Logistics')])[3]");
	private By ft_CorporateGovernance = By.xpath("(//a[contains(text(),'Corporate Governance')])[3]");
	
	public FooterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAboutUsLink() {
		 driver.findElement(ft_AboutUs).sendKeys(Keys.ENTER);		 
	}
	
	public void clickOnAwardsLink() {
		driver.findElement(ft_Awards).sendKeys(Keys.ENTER);
	}
	
	public void clickOnLeadershipLink() {
		driver.findElement(ft_Leadership).sendKeys(Keys.ENTER);
	}
	
	public void clickOnResponsibleBussiness() {
		driver.findElement(ft_ResponsibleBusiness).sendKeys(Keys.ENTER);
	}
	
	public void clickOnCeoDeskLink() {
		driver.findElement(ft_CeoDesk).sendKeys(Keys.ENTER);
	}
	
	public void clickOnCorporateGovernanceLink() {
		driver.findElement(ft_CorporateGovernance).sendKeys(Keys.ENTER);
	}
	
	public void clickOnMediaAndAdvertising() {
		driver.findElement(ft_MediaAndAdvertising).sendKeys(Keys.ENTER);
	}
	
	public void clickOnHitech() {
		driver.findElement(ft_Hitech).sendKeys(Keys.ENTER);
	}
	
	public void clickOnTravelAndHospitality() {
		driver.findElement(ft_TravelAndHospitality).sendKeys(Keys.ENTER);
	}
	
	public void clickOnSupplyChainAndLogistic() {
		driver.findElement(ft_supplyChainAndLogistic).sendKeys(Keys.ENTER);
	}
	
	
	
	
	public String getFooterLinkTitle() {
		return driver.getTitle();
	}
	
	

	
}
