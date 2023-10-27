package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

	private WebDriver driver;
	private By firstName = By.id("edit-first-name");
	private By lastName = By.id("edit-last-name");
	private By company = By.id("edit-company");
	private By jobTitle = By.id("edit-job-title");
	private By email = By.id("edit-email");
	private By phoneNumber = By.id("edit-phone-number");
	private By comment = By.id("edit-comments-message-");
	private By acceptPolicy = By.xpath(
			"//label[@for='edit-terms-of-service']//span[@class='slider round slick-initialized slick-slider slick-dotted']");
	private By subscribeBtn = By.xpath(
			"//label[@for='edit-terms-of-service-01']//span[@class='slider round slick-initialized slick-slider slick-dotted']");
	private By relationWithCybageDropdown = By.id("edit-relationship-with-cybage-");
	private By submitBtn = By.id("edit-submit");
	private By AcceptButton = By.xpath("//button[@class='agree-button eu-cookie-compliance-secondary-button']");

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void fillContactUsForm() {
		driver.findElement(AcceptButton).click();
		Select relationWithCybage = new Select(driver.findElement(relationWithCybageDropdown));
		relationWithCybage.selectByVisibleText("Ex-Cybagian");

		driver.findElement(firstName).sendKeys("tushar");
		driver.findElement(lastName).sendKeys("Nangare-Patil");
		driver.findElement(company).sendKeys("Cybage");
		driver.findElement(jobTitle).sendKeys("Engineer");
		driver.findElement(email).sendKeys("tusharnan@cybage.com");
		driver.findElement(phoneNumber).sendKeys("8380802646");
		driver.findElement(comment).sendKeys("Testing automation screept");

	}

	public void acceptPrivacyPolicy() {
		driver.findElement(acceptPolicy).click();
	}

	public void subscribeToNewUpdate() {
		driver.findElement(subscribeBtn).click();
	}

	public void submitForm() {
		driver.findElement(submitBtn).click();

	}

}
