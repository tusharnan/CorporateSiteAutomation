package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BurgerMenuPage {

	private WebDriver driver;
	private By BurgerMenu_Services = By.xpath("(//a[contains(text(),'Services')])[8]");
	private By BurgerMenu_ServicesOverview = By.xpath("(//a[contains(text(),'Overview')])[8]");
	private By BurgerMenu_ResearchAndDevelopement = By.cssSelector(".showthreelevelmenu li:nth-child(2) > a");
	private By BurgerMenu_IntroductionStage = By.cssSelector(".showthreelevelmenu li:nth-child(3) > a");
	private By BurgerMenu_Growth = By.cssSelector(".showthreelevelmenu li:nth-child(4) > a");
	private By BurgerMenu_Maturity = By.cssSelector(".showthreelevelmenu li:nth-child(5) > a");
	private By BurgerMenu_EndOfLife = By.cssSelector("li[class='first showsubmenu'] li:nth-child(6) a:nth-child(1)");
	private By BurgerMenu_Coe = By.xpath("//a[normalize-space()='Centres of Excellence']");
	private By BurgerMenu_ArchitecturalServices = By.xpath("//a[contains(text(),'Architectural Services')]");
	private By burgerMenu_ArchitecturalServicesOverview = By
			.xpath("//a[@href='/coe/architectural-services'][normalize-space()='Overview']");
	private By burgerMenu_SystemArchitecture = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='System Architecture']");
	private By burgerMenu_TechnologyRoadmap = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Technology Roadmap']");
	private By burgerMenu_NFRConsulting = By.xpath("//div[@class='wrapper']//a[normalize-space()='NFR Consulting']");
	private By burgerMenu_ArchitecturalEvaluation = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Architecture Evaluation']");
	private By burgerMenu_cloud = By.xpath("(//a[contains(text(),'Cloud')])[8]");
	private By burgerMenu_cloudOverview = By.cssSelector(".showsubmenu > .third-level-ul li:nth-child(1) > a");
	private By burgerMenu_cloudTestingServices = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Cloud Testing Services']");
	private By burgerMenu_consultancyServices = By.xpath("//a[normalize-space()='Consultancy Services']");
	private By burgerMenu_cloudNativeDevelopement = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Cloud Native Development']");
	private By burgerMenu_cloudMigration = By.xpath("//div[@class='wrapper']//a[normalize-space()='Cloud Migration']");
	private By burgerMenu_Devops = By.xpath("//div[@class='wrapper']//a[normalize-space()='DevOps']");
	private By burgerMenu_CloudTechOps = By.xpath("//div[@class='wrapper']//a[normalize-space()='Cloud TechOps']");
	private By burgerMenu_EnterpriseMobility = By.xpath("//a[contains(text(),'Enterprise Mobility')]");
	private By burgerMenu_EnterpriseMobilityOverview = By
			.xpath("//a[@href='/coe/enterprise-mobility-solutions'][normalize-space()='Overview']");
	private By burgerMenu_ApplicationInnovation = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Application Innovation and Consulting']");
	private By burgerMenu_MobileApplicationDev = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Mobile Application Development & Maintenance']");
	private By burgerMenu_Bi = By.xpath("(//a[contains(text(),'BI')])[4]");
	private By burgerMenu_BiOverview = By.xpath("(//a[contains(text(),'Overview')])[12]");
	private By burgerMenu_BIDWConsultation = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='BI DW Consultation']");
	private By burgerMenu_BiReportingAndAnalytics = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='BI Reporting and Analytics']");
	private By burgerMenu_DataIntegration = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Data Integration']");
	private By burgerMenu_InnovationEng = By
			.xpath("//a[@href='/coe/business-intelligence-services/innovation-engineering']");

	private By burgerMenu_MarTech = By.xpath("(//a[contains(text(),'MarTech')])[2]");
	private By burgerMenu_MarTechOverview = By.xpath("(//a[contains(text(),'Overview')])[13]");
	private By burgerMenu_MarTechScore = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Elevate Your Customer Experience(SCORE)']");
	private By burgerMenu_MarTechExperianceDesign = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Experience Design']");
	
	private By burgerMenu_MarTechContentProduction = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Content Production']");
	private By burgerMenu_MarTechDigitalMarketingStrategy = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Digital Marketing Strategy and Consulting']");
	private By burgerMenu_MartechMarketingTransformation = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Marketing Transformation']");
	private By burgerMenu_MartechAnalyticsInAction = By
			.xpath("//div[@class='wrapper']//a[normalize-space()='Analytics in Action']");
	private By burgerMenu_Ecm = By.xpath("(//a[contains(text(),'ECM')])[2]");
	private By burgerMenu_EcmOverview = By.xpath("(//a[contains(text(),'Overview')])[14]");
	private By burgerMenu_EcmAEM = By.xpath("//div[@class='wrapper']//a[normalize-space()='AEM']");
	private By burgerMenu_EcmDrupal = By.xpath("//div[@class='wrapper']//a[normalize-space()='Drupal']");
	private By burgerMenu_EcmSharepoint = By.xpath("//div[@class='wrapper']//a[normalize-space()='SharePoint']");
	private By burgerMenu_EcmSitecore = By.xpath("//div[@class='wrapper']//a[normalize-space()='Sitecore']");
	private By burgerMenu_EcmWordpress = By.xpath("//div[@class='wrapper']//a[normalize-space()='Wordpress']");
	private By burgerMenu_EcmSitefinity = By.xpath("//div[@class='wrapper']//a[normalize-space()='Sitefinity']");
	private By burgerMenu_Alliances = By.xpath("(//a[contains(text(),'Alliances')])[2]");
	private By burgerMenu_AlliancesOverview = By.xpath("(//a[contains(text(),'Overview')])[16]");
	private By burgerMenu_AlliancesSalesforce = By.xpath("(//a[contains(text(),'Salesforce')])[3]");
	private By burgerMenu_AlliancesServiceNow = By.xpath("(//a[contains(text(),'ServiceNow')])[3]");
	private By burgerMenu_AlliancesAws = By.xpath("(//a[contains(text(),'AWS')])[2]");
	private By burgerMenu_AlliancesKorber = By.xpath("(//a[contains(text(),'Körber')])[2]");

	private By burgerMenu_TestingAndQa = By.xpath("(//a[contains(text(),'Testing & QA')])[2]");
	private By burgerMenu_TestingAndQaOverview = By.xpath("(//a[contains(text(),'Overview')])[17]");
	private By burgerMenu_TestingAndQaTestArchitecturalConsultancy = By.xpath("(//a[contains(text(),'Test Architectural Consultancy')])[2]");
	private By burgerMenu_TestingAndQaAgileAutomationTesting = By.xpath("(//a[contains(text(),'Agile Automation Testing')])[2]");
	private By burgerMenu_TestingAndQaTestingInConnectedWorld = By.xpath("//a[contains(text(),'Testing in a Connected World(Mobile, OTT, IOT)')]");
	private By burgerMenu_TestingAndQaPerformanceTesting = By.xpath("(//a[contains(text(),'Performance Testing')])[2]");

	private By burgerMenu_supportServices = By.xpath("(//a[contains(text(),'Support Services')])[2]");
	private By burgerMenu_supportServicesOverview = By.xpath("(//a[contains(text(),'Overview')])[18]");
	private By burgerMenu_supportServicesRIM = By.xpath("(//a[contains(text(),'Remote Infrastructure Management (RIM)')])[2]");
	private By burgerMenu_supportServicesTechnicalSupport = By.xpath("(//a[contains(text(),'Technical Support')])[2]");
	private By burgerMenu_supportServicesITeSAndBPO = By.xpath("//div[@class='wrapper']//a[normalize-space()='ITeS & BPO']");

	
	
	
	
	public BurgerMenuPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnServices() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BurgerMenu_Services));
		driver.findElement(BurgerMenu_Services).click();
	}

	public DigitalProductEngineeringPage clickOnServiceOverview() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BurgerMenu_ServicesOverview));
		driver.findElement(BurgerMenu_ServicesOverview).click();
		return new DigitalProductEngineeringPage(driver);
	}

	public DigitalProductEngineeringPage clickOnResearchAndDevelopement() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BurgerMenu_ResearchAndDevelopement));
		driver.findElement(BurgerMenu_ResearchAndDevelopement).click();
		return new DigitalProductEngineeringPage(driver);
	}

	public DigitalProductEngineeringPage clickOnIntroduction() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BurgerMenu_IntroductionStage));
		driver.findElement(BurgerMenu_IntroductionStage).click();
		return new DigitalProductEngineeringPage(driver);
	}

	public DigitalProductEngineeringPage clickOnGrowth() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BurgerMenu_Growth));
		driver.findElement(BurgerMenu_Growth).click();
		return new DigitalProductEngineeringPage(driver);

	}

	public DigitalProductEngineeringPage clickOnMaturity() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BurgerMenu_Maturity));
		driver.findElement(BurgerMenu_Maturity).click();
		return new DigitalProductEngineeringPage(driver);
	}

	public DigitalProductEngineeringPage clickOnEndOfLife() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BurgerMenu_EndOfLife));
		driver.findElement(BurgerMenu_EndOfLife).click();
		return new DigitalProductEngineeringPage(driver);
	}

	public void clickOnCoe() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BurgerMenu_Coe));
		driver.findElement(BurgerMenu_Coe).click();
	}

	public void clickOnArchitecturalServices() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BurgerMenu_ArchitecturalServices));
		driver.findElement(BurgerMenu_ArchitecturalServices).click();
	}

	public ArchitecturalServices clickOnArchitecturalOverview() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_ArchitecturalServicesOverview));
		driver.findElement(burgerMenu_ArchitecturalServicesOverview).click();
		return new ArchitecturalServices(driver);
	}

	public ArchitecturalServices clickOnSystemArchitecture() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_SystemArchitecture));
		driver.findElement(burgerMenu_SystemArchitecture).click();
		return new ArchitecturalServices(driver);
	}

	public ArchitecturalServices clicksOnTechnologyRoadMap() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_TechnologyRoadmap));
		driver.findElement(burgerMenu_TechnologyRoadmap).click();
		return new ArchitecturalServices(driver);
	}

	public ArchitecturalServices clickOnNFRConsulting() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_NFRConsulting));
		driver.findElement(burgerMenu_NFRConsulting).click();
		return new ArchitecturalServices(driver);
	}

	public ArchitecturalServices clickOnArchitecturalEvaluation() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_ArchitecturalEvaluation));
		driver.findElement(burgerMenu_ArchitecturalEvaluation).click();
		return new ArchitecturalServices(driver);
	}

	public Coe_CloudPage clickOnCloud() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_cloud));
		driver.findElement(burgerMenu_cloud).click();
		return new Coe_CloudPage(driver);
	}

	public Coe_CloudPage clickOnOverviewUnderCloudSection() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_cloudOverview));
		driver.findElement(burgerMenu_cloudOverview).click();
		return new Coe_CloudPage(driver);
	}

	public Coe_CloudPage clickOnCloudTesting() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_cloudTestingServices));
		driver.findElement(burgerMenu_cloudTestingServices).click();
		return new Coe_CloudPage(driver);
	}

	public Coe_CloudPage clickOnConsultancyServices() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_consultancyServices));
		driver.findElement(burgerMenu_consultancyServices).click();
		return new Coe_CloudPage(driver);

	}

	public Coe_CloudPage clickOnCloudNative() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_cloudNativeDevelopement));
		driver.findElement(burgerMenu_cloudNativeDevelopement).click();
		return new Coe_CloudPage(driver);
	}

	public Coe_CloudPage clicksOnCloudMigration() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_cloudMigration));
		driver.findElement(burgerMenu_cloudMigration).click();
		return new Coe_CloudPage(driver);

	}

	public Coe_CloudPage clicksOnDevops() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_Devops));
		driver.findElement(burgerMenu_Devops).click();
		return new Coe_CloudPage(driver);

	}

	public Coe_CloudPage clicksOnCloudTechOps() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_CloudTechOps));
		driver.findElement(burgerMenu_CloudTechOps).click();
		return new Coe_CloudPage(driver);

	}

	public Coe_EnterpriseMobilityPage clickOnEnterpriseMobility() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_EnterpriseMobility));
		driver.findElement(burgerMenu_EnterpriseMobility).click();
		return new Coe_EnterpriseMobilityPage(driver);

	}

	public Coe_EnterpriseMobilityPage clickOnEnterpriseMobilityOverview() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_EnterpriseMobilityOverview));
		driver.findElement(burgerMenu_EnterpriseMobilityOverview).click();
		return new Coe_EnterpriseMobilityPage(driver);

	}

	public Coe_EnterpriseMobilityPage clickOnApplicationInnovationAndConsulting() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_ApplicationInnovation));
		driver.findElement(burgerMenu_ApplicationInnovation).click();
		return new Coe_EnterpriseMobilityPage(driver);
	}

	public Coe_EnterpriseMobilityPage clickOnMobileApplicationDevelopementAndMaintainance() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_MobileApplicationDev));
		driver.findElement(burgerMenu_MobileApplicationDev).click();
		return new Coe_EnterpriseMobilityPage(driver);
	}

	public Coe_BiPage clickOnBi() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_Bi));
		driver.findElement(burgerMenu_Bi).click();
		return new Coe_BiPage(driver);

	}

	public Coe_BiPage clickOnBiOverview() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_BiOverview));
		driver.findElement(burgerMenu_BiOverview).click();
		return new Coe_BiPage(driver);
	}

	public Coe_BiPage clickOnBiDwConsultation() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_BIDWConsultation));
		driver.findElement(burgerMenu_BIDWConsultation).click();
		return new Coe_BiPage(driver);
	}

	public Coe_BiPage clickOnBiReporting() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_BiReportingAndAnalytics));
		driver.findElement(burgerMenu_BiReportingAndAnalytics).click();
		return new Coe_BiPage(driver);
	}

	public Coe_BiPage clickOnInnovationEngineering() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_InnovationEng));
		driver.findElement(burgerMenu_InnovationEng).click();
		return new Coe_BiPage(driver);
	}

	public Coe_MartechPage clickOnMartech() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_MarTech));
		driver.findElement(burgerMenu_MarTech).click();
		return new Coe_MartechPage(driver);
	}

	public Coe_MartechPage clickOnMartechOverview() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_MarTechOverview));
		driver.findElement(burgerMenu_MarTechOverview).click();
		return new Coe_MartechPage(driver);
	}

	public Coe_MartechPage clickOnElevateYourCustomer() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_MarTechScore));
		driver.findElement(burgerMenu_MarTechScore).click();
		return new Coe_MartechPage(driver);

	}

	public Coe_MartechPage clickOnContentProduction() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_MarTechContentProduction));
		driver.findElement(burgerMenu_MarTechContentProduction).click();
		return new Coe_MartechPage(driver);
	}

	public Coe_MartechPage clickOnDigitalMarketing() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_MarTechDigitalMarketingStrategy));
		driver.findElement(burgerMenu_MarTechDigitalMarketingStrategy).click();
		return new Coe_MartechPage(driver);
	}

	public Coe_MartechPage clickOnMarketingTransformation() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_MartechMarketingTransformation));
		driver.findElement(burgerMenu_MartechMarketingTransformation).click();
		return new Coe_MartechPage(driver);
	}

	public Coe_MartechPage clickOnExperianceDesign() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_MarTechExperianceDesign));
		driver.findElement(burgerMenu_MarTechExperianceDesign).click();
		return new Coe_MartechPage(driver);
	}

	public Coe_EcmPage clickOnEcm() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_Ecm));
		driver.findElement(burgerMenu_Ecm).click();
		return new Coe_EcmPage(driver);
	}

	public Coe_EcmPage clickOnOverviewUnderEcm() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_EcmOverview));
		driver.findElement(burgerMenu_EcmOverview).click();
		return new Coe_EcmPage(driver);
	}

	public Coe_EcmPage clickOnAEM() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_EcmAEM));
		driver.findElement(burgerMenu_EcmAEM).click();
		return new Coe_EcmPage(driver);
	}

	public Coe_EcmPage clickOnDrupal() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_EcmDrupal));
		driver.findElement(burgerMenu_EcmDrupal).click();
		return new Coe_EcmPage(driver);
	}

	public Coe_EcmPage clickOnSharePoint() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_EcmSharepoint));
		driver.findElement(burgerMenu_EcmSharepoint).click();
		return new Coe_EcmPage(driver);
	}

	public Coe_EcmPage clickOnSitecore() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_EcmSitecore));
		driver.findElement(burgerMenu_EcmSitecore).click();
		return new Coe_EcmPage(driver);
	}

	public Coe_EcmPage clickOnSitefinity() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_EcmSitefinity));
		driver.findElement(burgerMenu_EcmSitefinity).click();
		return new Coe_EcmPage(driver);
	}

	public Coe_AlliancesPage clickOnAlliances() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_Alliances));
		driver.findElement(burgerMenu_Alliances).click();
		return new Coe_AlliancesPage(driver);
	}

	public Coe_AlliancesPage clickOnAlliancesOverview() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_AlliancesOverview));
		driver.findElement(burgerMenu_AlliancesOverview).click();
		return new Coe_AlliancesPage(driver);
	}
	
	public Coe_AlliancesPage clickOnAlliancesSalesforce() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_AlliancesSalesforce));
		driver.findElement(burgerMenu_AlliancesSalesforce).click();
		return new Coe_AlliancesPage(driver);
	}
	
	public Coe_AlliancesPage clickOnAlliancesServiceNow() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_AlliancesServiceNow));
		driver.findElement(burgerMenu_AlliancesServiceNow).click();
		return new Coe_AlliancesPage(driver);
	}
	
	public Coe_AlliancesPage clickOnAlliancesAws() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_AlliancesAws));
		driver.findElement(burgerMenu_AlliancesAws).click();
		return new Coe_AlliancesPage(driver);
	}
	
	public Coe_AlliancesPage clickOnAlliancesKorber() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_AlliancesKorber));
		driver.findElement(burgerMenu_AlliancesKorber).click();
		return new Coe_AlliancesPage(driver);
	}

	public Coe_TestingAndQaPage clickOnTestingAndQa() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_TestingAndQa));
		driver.findElement(burgerMenu_TestingAndQa).click();
		return new Coe_TestingAndQaPage(driver);
	}
	
	public Coe_TestingAndQaPage clickOnTestingAndQaOverview() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_TestingAndQaOverview));
		driver.findElement(burgerMenu_TestingAndQaOverview).click();
		return new Coe_TestingAndQaPage(driver);
	}
	
	public Coe_TestingAndQaPage clickOnTestingAndQaTestArchitecturalConsultancy() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_TestingAndQaTestArchitecturalConsultancy));
		driver.findElement(burgerMenu_TestingAndQaTestArchitecturalConsultancy).click();
		return new Coe_TestingAndQaPage(driver);
	}
	
	public Coe_TestingAndQaPage clickOnTestingAndQaAgileAutomationTesting() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_TestingAndQaAgileAutomationTesting));
		driver.findElement(burgerMenu_TestingAndQaAgileAutomationTesting).click();
		return new Coe_TestingAndQaPage(driver);
	}
	
	public Coe_TestingAndQaPage clickOnTestingAndQaTestingInConnectedWorld() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_TestingAndQaTestingInConnectedWorld));
		driver.findElement(burgerMenu_TestingAndQaTestingInConnectedWorld).click();
		return new Coe_TestingAndQaPage(driver);
	}
	
	public Coe_TestingAndQaPage clickOnTestingAndQaPerformanceTesting() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_TestingAndQaPerformanceTesting));
		driver.findElement(burgerMenu_TestingAndQaPerformanceTesting).click();
		return new Coe_TestingAndQaPage(driver);
	}

	public Coe_SupportServicePage clickOnSupportService() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_supportServices));
		driver.findElement(burgerMenu_supportServices).click();
		return new Coe_SupportServicePage(driver);
	}

	public Coe_SupportServicePage clickOnSupportServiceOverview() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_supportServicesOverview));
		driver.findElement(burgerMenu_supportServicesOverview).click();
		return new Coe_SupportServicePage(driver);
		
	}
	
	public Coe_SupportServicePage clickOnSupportServiceRIM() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_supportServicesRIM));
		driver.findElement(burgerMenu_supportServicesRIM).click();
		return new Coe_SupportServicePage(driver);
		
	}
	
	public Coe_SupportServicePage clickOnSupportServiceITeSAndBPO() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_supportServicesITeSAndBPO));
		driver.findElement(burgerMenu_supportServicesITeSAndBPO).click();
		return new Coe_SupportServicePage(driver);
		
	}
	
	public Coe_SupportServicePage clickOnSupportServiceTechnicalSupport() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		scrollDown();
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgerMenu_supportServicesTechnicalSupport));
		driver.findElement(burgerMenu_supportServicesTechnicalSupport).click();
		return new Coe_SupportServicePage(driver);
		
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
	}
}
