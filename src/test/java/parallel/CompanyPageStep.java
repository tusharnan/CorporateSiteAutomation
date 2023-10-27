package parallel;

import com.pages.CompanyPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanyPageStep {

	CompanyPage companyPage = new CompanyPage(DriverFactory.getDriver());
	String title;

	@When("user clicks on about us")
	public void user_clicks_on_about_us() {
		companyPage.clickOnAboutUs();
	}

	@Then("user should land on about us page")
	public void user_should_land_on_about_us_page() {
		title = companyPage.getCompanyPageTitle();
		System.out.println("title is "+title);
	}

	@When("user clicks on Awards")
	public void user_clicks_on_awards() {
		companyPage.clickOnAwards();
	}

	@Then("user should land on {string}")
	public void user_should_land_on(String string) {
		title = companyPage.getCompanyPageTitle();
	}

	@When("user clicks on Leadership")
	public void user_clicks_on_leadership() {
		companyPage.clickOnLeadership();
	}

	@When("user clicks on Responsible business")
	public void user_clicks_on_responsible_business() {
		companyPage.clickOnResponsibleBussiness();
	}

	@When("user clicks on Ceos Desk")
	public void user_clicks_on_ceos_desk() {
		companyPage.clickOnCeosDesk();
	}

	@When("user clicks on corporate governance")
	public void user_clicks_on_corporate_governance() {
		companyPage.clickOnCorporateGovernance();
	}

}
