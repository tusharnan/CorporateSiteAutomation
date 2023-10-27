package parallel;

import com.pages.BurgerMenuPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BurgerMenuPageStep {

	BurgerMenuPage burgerMenuPage = new BurgerMenuPage(DriverFactory.getDriver());

	@Given("user clicks on Services")
	public void user_clicks_on_services() {
		burgerMenuPage.clickOnServices();
	}

	@Given("user clicks on overview")
	public void user_clicks_on_overview() {
		burgerMenuPage.clickOnServiceOverview();
	}

	@When("user clicks on Research and Developement stage page")
	public void user_clicks_on_research_and_developement_stage_page() {
		burgerMenuPage.clickOnResearchAndDevelopement();
	}

	@When("user clicks on Introduction stage page")
	public void user_clicks_on_introduction_stage_page() {
		burgerMenuPage.clickOnIntroduction();
	}

	@When("user clicks on Growth stage page")
	public void user_clicks_on_growth_stage_page() {
		burgerMenuPage.clickOnGrowth();
	}

	@When("user clicks on Maturity stage page")
	public void user_clicks_on_maturity_stage_page() {
		burgerMenuPage.clickOnMaturity();
	}

	@When("user clicks on End of life stage page")
	public void user_clicks_on_end_of_life_stage_page() {
		burgerMenuPage.clickOnEndOfLife();
	}

	@Given("user clicks on Coe")
	public void user_clicks_on_coe() {
		burgerMenuPage.clickOnCoe();
	}

	@Given("user clicks on Architecural services")
	public void user_clicks_on_architecural_services() {
		burgerMenuPage.clickOnArchitecturalServices();
	}

	@Given("user clicks on overview under Architectural services section")
	public void user_clicks_on_overview_under_architectural_services_section() {
		burgerMenuPage.clickOnArchitecturalOverview();
	}

	@Given("user clicks on System Architecture under Architectural services section")
	public void user_clicks_on_system_architecture_under_architectural_services_section() {
		burgerMenuPage.clickOnSystemArchitecture();
	}

	@Given("user clicks on Technology roadmap under Architectural services section")
	public void user_clicks_on_technology_roadmap_under_architectural_services_section() {
		burgerMenuPage.clicksOnTechnologyRoadMap();
	}

	@Given("user clicks on NFR Consulting under Architectural services section")
	public void user_clicks_on_nfr_consulting_under_architectural_services_section() {
		burgerMenuPage.clickOnNFRConsulting();
	}

	@Given("user clicks on Architectural Evaluation under Architectural services section")
	public void user_clicks_on_architectural_evaluation_under_architectural_services_section() {
		burgerMenuPage.clickOnArchitecturalEvaluation();
	}

	@Given("user clicks on Cloud")
	public void user_clicks_on_cloud() {
		burgerMenuPage.clickOnCloud();
	}

	@When("user clicks on overview under cloud section")
	public void user_clicks_on_overview_under_cloud_section() {
		burgerMenuPage.clickOnOverviewUnderCloudSection();
	}

	@When("user clicks on Cloud Testing services under cloud section")
	public void user_clicks_on_cloud_testing_services_under_cloud_section() {
		burgerMenuPage.clickOnCloudTesting();
	}

	@When("user clicks on consultancy services under cloud section")
	public void user_clicks_on_consultancy_services_under_cloud_section() {
		burgerMenuPage.clickOnConsultancyServices();
	}

	@When("user clicks on Cloud Native under cloud section")
	public void user_clicks_on_cloud_native_under_cloud_section() {
		burgerMenuPage.clickOnCloudNative();
	}

	@When("user clicks on Cloud Migration under cloud section")
	public void user_clicks_on_cloud_migration_under_cloud_section() {
		burgerMenuPage.clicksOnCloudMigration();
	}

	@When("user clicks on Devops under cloud section")
	public void user_clicks_on_devops_under_cloud_section() {
		burgerMenuPage.clicksOnDevops();
	}

	@When("user clicks on Cloud TechOps under cloud section")
	public void user_clicks_on_cloud_tech_ops_under_cloud_section() {
		burgerMenuPage.clicksOnCloudTechOps();
	}

	@Given("user clicks on Enterprise Mobility")
	public void user_clicks_on_enterprise_mobility() {
		burgerMenuPage.clickOnEnterpriseMobility();
	}

	@When("user clicks on overview under Enterprise mobility")
	public void user_clicks_on_overview_under_enterprise_mobility() {
		burgerMenuPage.clickOnEnterpriseMobilityOverview();
	}

	@When("user clicks on Application innovation and consulting under Enterprise mobility")
	public void user_clicks_on_application_innovation_and_consulting_under_enterprise_mobility() {
		burgerMenuPage.clickOnApplicationInnovationAndConsulting();
	}

	@When("user clicks on Mobile application Developement and Maintainance under Enterprise mobility")
	public void user_clicks_on_mobile_application_developement_and_maintainance_under_enterprise_mobility() {
		burgerMenuPage.clickOnMobileApplicationDevelopementAndMaintainance();
	}

	@Given("user clicks on Bussiness Intelegence")
	public void user_clicks_on_bussiness_intelegence() {
		burgerMenuPage.clickOnBi();
	}

	@When("user clicks on overview under Bi section")
	public void user_clicks_on_overview_under_bi_section() {
		burgerMenuPage.clickOnBiOverview();
	}

	@When("user clicks on Bi DW Consultation page")
	public void user_clicks_on_bi_dw_consultation_page() {
		burgerMenuPage.clickOnBiDwConsultation();
	}

	@When("user clicks on BI Reporting and Analytics")
	public void user_clicks_on_bi_reporting_and_analytics() {
		burgerMenuPage.clickOnBiReporting();
	}

	@When("user clicks on Innovation Engineering")
	public void user_clicks_on_innovation_engineering() {
		burgerMenuPage.clickOnInnovationEngineering();
	}

	@Given("user clicks on Martech")
	public void user_clicks_on_martech() {
		burgerMenuPage.clickOnMartech();
	}

	@When("user clicks on overview under MarTech section")
	public void user_clicks_on_overview_under_mar_tech_section() {
		burgerMenuPage.clickOnMartechOverview();
	}

	@When("user clicks on Elevate your customer Experiance")
	public void user_clicks_on_elevate_your_customer_experiance() {
		burgerMenuPage.clickOnElevateYourCustomer();
	}

	@When("user clicks on Content production")
	public void user_clicks_on_content_production() {
		burgerMenuPage.clickOnContentProduction();
	}

	@When("user clicks on  Digital Marketing")
	public void user_clicks_on_digital_marketing() {
		burgerMenuPage.clickOnDigitalMarketing();
	}

	@When("user clicks on Marketing  Transformation")
	public void user_clicks_on_marketing_transformation() {
		burgerMenuPage.clickOnMarketingTransformation();
	}

	@When("user clicks on Experiance design")
	public void user_clicks_on_experiance_design() {
		burgerMenuPage.clickOnExperianceDesign();
	}

	@Given("user clicks on Ecm")
	public void user_clicks_on_ecm() {
		burgerMenuPage.clickOnEcm();
	}

	@When("user clicks on Ecm overview")
	public void user_clicks_on_ecm_overview() {
		burgerMenuPage.clickOnOverviewUnderEcm();
	}

	@When("user clicks on AEM")
	public void user_clicks_on_aem() {
		burgerMenuPage.clickOnAEM();

	}

	@When("user clicks on Drupal")
	public void user_clicks_on_drupal() {
		burgerMenuPage.clickOnDrupal();
	}

	@When("user clicks on sharepoint")
	public void user_clicks_on_sharepoint() {
		burgerMenuPage.clickOnSharePoint();
	}

	@When("user clicks on sitecore")
	public void user_clicks_on_sitecore() {
		burgerMenuPage.clickOnSitecore();
	}

	@When("user clicks on sitefinity")
	public void user_clicks_on_sitefinity() {
		burgerMenuPage.clickOnSitefinity();
	}

	@Given("user clicks on alliances")
	public void user_clicks_on_alliances() {
		burgerMenuPage.clickOnAlliances();
	}

	@When("user clicks on Alliances overview")
	public void user_clicks_on_alliances_overview() {
		burgerMenuPage.clickOnAlliancesOverview();
	}

	@When("user clicks on Alliances salesforce")
	public void user_clicks_on_alliances_salesforce() {
		burgerMenuPage.clickOnAlliancesSalesforce();
	}

	@When("user clicks on Alliances serviceNow")
	public void user_clicks_on_alliances_service_now() {
		burgerMenuPage.clickOnAlliancesServiceNow();
	}

	@When("user clicks on Alliances Aws")
	public void user_clicks_on_alliances_aws() {
		burgerMenuPage.clickOnAlliancesAws();
	}

	@When("user clicks on Alliances Korber")
	public void user_clicks_on_alliances_korber() {
		burgerMenuPage.clickOnAlliancesKorber();
	}

	@Given("user clicks on Testing and Qa")
	public void user_clicks_on_testing_and_qa() {
		burgerMenuPage.clickOnTestingAndQa();
	}

	@When("user clicks on Testing and QA overview")
	public void user_clicks_on_testing_and_qa_overview() {
		burgerMenuPage.clickOnTestingAndQaOverview();
	}

	@When("user clicks on Test Architectural consultancy")
	public void user_clicks_on_test_architectural_consultancy() {
		burgerMenuPage.clickOnTestingAndQaTestArchitecturalConsultancy();
	}

	@When("user clicks on  Agile automation Testing")
	public void user_clicks_on_agile_automation_testing() {
		burgerMenuPage.clickOnTestingAndQaAgileAutomationTesting();
	}

	@When("user clicks on Testing in connected world")
	public void user_clicks_on_testing_in_connected_world() {
		burgerMenuPage.clickOnTestingAndQaTestingInConnectedWorld();
	}

	@When("user clicks on performance Testing")
	public void user_clicks_on_performance_testing() {
		burgerMenuPage.clickOnTestingAndQaPerformanceTesting();
	}
	
	@Given("user clicks on Support Services")
	public void user_clicks_on_support_services() {
		burgerMenuPage.clickOnSupportService();
	}

	@When("user clicks on Support Service overview")
	public void user_clicks_on_support_service_overview() {
	    burgerMenuPage.clickOnSupportServiceOverview();
	}
	
	@When("user clicks on  RIM Testing")
	public void user_clicks_on_rim_testing() {
		burgerMenuPage.clickOnSupportServiceRIM();
	}

	@When("user clicks on Technical support")
	public void user_clicks_on_technical_support() {
		burgerMenuPage.clickOnSupportServiceTechnicalSupport();
	}

	@When("user clicks on ITeS and BPO Testing")
	public void user_clicks_on_i_te_s_and_bpo_testing() {
		burgerMenuPage.clickOnSupportServiceITeSAndBPO();
	}
	@Given("user scroll down")
	public void user_scroll_down() {
	    burgerMenuPage.scrollDown();
	}
}
