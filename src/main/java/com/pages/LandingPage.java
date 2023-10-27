package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	String title;
	private WebDriver driver;
	private By headerLogo = By
			.xpath("//div[@class='col-xs-9 col-sm-10 col-md-10 nav-cont-wrapper pad-0']//a[@title='Home']");
	private By career = By.xpath("//a[@href='/careers/current-openings'][normalize-space()='Careers']");

	private By searchIcon = By.xpath("//input[@class='search-toggler']");
	private By searchInput = By.xpath("//input[@id='edit-keys']");
	private By AcceptButton = By.xpath("//button[@class='agree-button eu-cookie-compliance-secondary-button']");
	private By email = By.id("edit-subscribe-newsletter-email");
	private By subscribeBtn = By.id("edit-actions-submit");
	private By thankYouMsg = By.xpath("//div[@id='mm-0']/div/div/div/section/div/article/div/div/div/div/div/h2/span");
	private By validationMsg = By.xpath("//p[normalize-space()='You have already subscribed to this newsletter']");
	private By linkedInIcon = By.xpath("//a[@href='https://www.linkedin.com/company/cybage/']//img");
	private By twitterIcon = By.xpath("//a[@href='https://twitter.com/cybage']//img");
	private By facebookIcon = By.xpath("//a[@href='https://www.facebook.com/cybage/']//img");
    private By burgerMenu =By.xpath("//input[@class='toggler']");
    private By burgerMenu_ContactUs = By.xpath("//li[@class='click-me']//a[normalize-space()='Contact Us']");
	private By burgerMenu_AnalystSpeak = By.xpath("//li[@class='click-me']//a[normalize-space()='Analyst Speak']");
	private By burgerMenu_DecisionMine = By.xpath("//li[contains(@class,'first')]//a[contains(text(),'DecisionMines™')]");
	private By burgerMenu_Industries = By.xpath("(//a[contains(text(),'Industries')])[2] ");
	private By bergerMenu_Company = By.xpath("(//a[contains(text(),'Company')])[2]");
	private By bergerMenu_CybageTimes =By.xpath("//li[@class='click-me']//a[normalize-space()='Cybage Times']");
	private By bergerMenu_Newsroom =By.xpath("//li[@class='click-me']//a[normalize-space()='Newsroom']");

	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLandingPageTitle() {
		return driver.getTitle();
	}

	public void clickHeaderLogo() {
		driver.findElement(headerLogo).click();
	}

	public void clickOnCareerLink() {
		driver.findElement(career).click();
	}

	public void clickOnSearchIcon() {
		driver.findElement(searchIcon).click();
	}

	public SearchPage enterValueInSearchInput(String input) {

		driver.findElement(searchInput).sendKeys(input);
		driver.findElement(searchInput).sendKeys(Keys.ENTER);
		return new SearchPage(driver);
	}

	public void acceptCookies() {
		driver.findElement(AcceptButton).click();

	}

	public FooterPage scrollDownHomepage(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")", "");
		return new FooterPage(driver);

	}

	public void enterSubscriptionEmail(String emailId) {
		driver.findElement(email).sendKeys(emailId);
	}

	public void clickSubscribeBtn() {
		driver.findElement(subscribeBtn).click();
	}

	public String getThankYouMsg() {
		return driver.findElement(thankYouMsg).getText();
	}

	public String getValidationMsg() {
		return driver.findElement(validationMsg).getText();
	}

	public String clickSocialMediaIcon(String socialMediaName) {
		
		if (socialMediaName.equals("LinkedIn")) {
			driver.findElement(linkedInIcon).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			 title = driver.getTitle();
			System.out.println("Title of the Page is " + driver.getTitle());
			driver.close();
			driver.switchTo().window(tabs2.get(0));
			

		} else if (socialMediaName.equals("Twitter")) {
			driver.findElement(twitterIcon).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			 title = driver.getTitle();
			System.out.println("Title of the Page is " + driver.getTitle());
			driver.close();
			driver.switchTo().window(tabs2.get(0));
		} else if (socialMediaName.equals("facebook")) {
			driver.findElement(facebookIcon).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			 title = driver.getTitle();
			System.out.println("Title of the Page is " + driver.getTitle());
			driver.close();
			driver.switchTo().window(tabs2.get(0));
		} else {
			System.out.println("Entered invalid social Media Name");
		}
		return title;
	}
	
	public void clickOnBurgerMenu() {
		driver.findElement(burgerMenu).click();
	}
	
	public AnalystSpeakPage clickOnAnalystSpeakInMenu() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_AnalystSpeak));
		driver.findElement(burgerMenu_AnalystSpeak).click();
		return new AnalystSpeakPage(driver);
	}

	public FooterPage scrollDownToFooter() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3500)", "");
		return new FooterPage(driver);
		
	}

	public DecisionMinePage clicksOnDecisionMines() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_DecisionMine));
		driver.findElement(burgerMenu_DecisionMine).click();
		return new DecisionMinePage(driver);
		
	}
	
	public MediaAndAdvertisingPage clicksOnIndustries() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_Industries));
		driver.findElement(burgerMenu_Industries).click();
		return new MediaAndAdvertisingPage(driver);
	}
	
	public HiTechPage clicksOnIndustriesForHitech() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_Industries));
		driver.findElement(burgerMenu_Industries).click();
		return new HiTechPage(driver);
	}

	public TravelAndHospitalityPage clickOnIndustriesForTravelAndHospitality() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_Industries));
		driver.findElement(burgerMenu_Industries).click();
		return new TravelAndHospitalityPage(driver);
	}

	public CompanyPage clickOnCompany() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(bergerMenu_Company));
		driver.findElement(bergerMenu_Company).click();
		return new CompanyPage(driver);
		
	}

	public CybageTimesPage clickOnCybageTimes() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(bergerMenu_CybageTimes));
		driver.findElement(bergerMenu_CybageTimes).click();
		return new CybageTimesPage(driver);
		
	}

	public CybageTimesPage clickOnNewsroom() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(bergerMenu_Newsroom));
		driver.findElement(bergerMenu_Newsroom).click();
		return new CybageTimesPage(driver);
		
	}

	public CybageTimesPage clickOnCareerInBurgerMenu() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(bergerMenu_Newsroom));
		driver.findElement(bergerMenu_Newsroom).click();
		return new CybageTimesPage(driver);
	}

	public BurgerMenuPage clickOnBurgerMenuPage() {
		driver.findElement(burgerMenu).click();
		return new BurgerMenuPage(driver);
		
	}

	
}
