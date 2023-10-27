package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiTechPage {
	private WebDriver driver;
	private By burgerMenu_hitech= By.xpath("(//a[contains(text(),'Hi-Tech')])[2]");
    private By burgerMenu_Hitech_overview = By.xpath("//a[@href='/hi-tech'][normalize-space()='Overview']");
    private By automotiveRetailCard = By.cssSelector(".pad-0:nth-child(1) > .card a");
	private By card_HumanResourceManagement = By.cssSelector(".pad-0:nth-child(2) a");
	private By card_CustomerExperianceAndMarketResearch = By.cssSelector(".pad-0:nth-child(3) > .card a");
	private By card_EnterpriseWorkflowEngine = By.cssSelector(".pad-0:nth-child(4) a");
	private By card_socialAndCollaborationPlatform = By.cssSelector(".pad-0:nth-child(5) a");
	
	
	public HiTechPage(WebDriver driver) {
		this.driver =driver;
	}
	
	public void clickOnHitechVertical() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_hitech));
		driver.findElement(burgerMenu_hitech).click();
	}
	
	public void clickOnHitechOverview() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_Hitech_overview));
		driver.findElement(burgerMenu_Hitech_overview).click();
	}

	public String getHitechPageTitle() {
	  String title =	driver.getTitle();
		return title;
	}

	public void clickOnAutomotiveRetailCard() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(automotiveRetailCard));
		driver.findElement(automotiveRetailCard).click();
		
	}

	public void clickOnHumanResourceManagement() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(card_HumanResourceManagement));
		driver.findElement(card_HumanResourceManagement).click();
		
	}

	public void clickOnCustomerExperianceAndMarketResearchCard() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(card_CustomerExperianceAndMarketResearch));
		driver.findElement(card_CustomerExperianceAndMarketResearch).click();
	}

	public void clickOnEnterpriseWorkFlowEngine() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(card_EnterpriseWorkflowEngine));
		driver.findElement(card_EnterpriseWorkflowEngine).click();
	}
	
	public void clickOnSocialAndCollaborationPlatform() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(card_socialAndCollaborationPlatform));
		driver.findElement(card_socialAndCollaborationPlatform).click();
	}

}
