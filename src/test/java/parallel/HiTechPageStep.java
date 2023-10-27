package parallel;

import org.testng.Assert;

import com.pages.HiTechPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HiTechPageStep {
	
	private HiTechPage hiTechPage = new HiTechPage(DriverFactory.getDriver());

	@Given("user clicks on hitech vertical")
	public void user_clicks_on_hitech_vertical() {
	  hiTechPage.clickOnHitechVertical();
	}
	
	@Given("user clicks on overview under hitech vertical")
	public void user_clicks_on_overview_under_hitech_vertical() {
		hiTechPage.clickOnHitechOverview();
	}

	@Then("title of the page needs to be {string} for hitech page")
	public void title_of_the_page_needs_to_be_for_hitech_page(String string) {
		hiTechPage.getHitechPageTitle();
	}
	
	@Given("user clicks on automotive retail card")
	public void user_clicks_on_automotive_retail_card() {
	   hiTechPage.clickOnAutomotiveRetailCard();
	}

	@Then("user should be redirected to {string}")
	public void user_should_be_redirected_to(String expectedTitle) {
	  String actualTitle = hiTechPage.getHitechPageTitle(); 
	  Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Given("user clicks on  card Human resource management")
	public void user_clicks_on_card_human_resource_management() {
	   hiTechPage.clickOnHumanResourceManagement();
	}

	@Given("user clicks on customer experiace and market research card")
	public void user_clicks_on_customer_experiace_and_market_research_card() {
	    hiTechPage.clickOnCustomerExperianceAndMarketResearchCard();
	}
	
	@Given("user clicks on enterprise workflow engine card")
	public void user_clicks_on_enterprise_workflow_engine_card() {
	  hiTechPage.clickOnEnterpriseWorkFlowEngine();
	}

	@Given("user clicks on Social & Collaboration Platform card")
	public void user_clicks_on_social_collaboration_platform_card() {
	    hiTechPage.clickOnSocialAndCollaborationPlatform();
	}

	
}
