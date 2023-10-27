package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompanyPage {

	private WebDriver driver;
	private By aboutUs = By.cssSelector(".showsubmenu li:nth-child(1) > a");
	private By awards = By.xpath("(//a[contains(text(),'Awards')])[2]");
	
	private By leadership = By.cssSelector(".showsubmenu li:nth-child(3) > a");
	private By responsibleBussiness = By.xpath("//div[@class='detail-side-menu']//a[normalize-space()='Responsible Business']");
	private By ceosDesk = By.xpath("//a[contains(text(),'CEO’s Desk')]");
	private By corporateGovernance = By.xpath("//div[@class='detail-side-menu']//a[normalize-space()='Corporate Governance']");
	
	
	
	public CompanyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAboutUs() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(aboutUs));
		driver.findElement(aboutUs).click();
		
	}
	
	public String getCompanyPageTitle() {
	  String title = driver.getTitle();
	  return title;
	}
	
	public void clickOnAwards() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(awards));
		driver.findElement(awards).click();
	}
	
	public void clickOnLeadership() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(leadership));
		driver.findElement(leadership).click();
	}
	
	public void clickOnResponsibleBussiness() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(responsibleBussiness));
		driver.findElement(responsibleBussiness).click();
	}
	
	public void clickOnCeosDesk() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ceosDesk));
		driver.findElement(ceosDesk).click();
	}
	
	public void clickOnCorporateGovernance() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(corporateGovernance));
		driver.findElement(corporateGovernance).click();
	}
	

}
