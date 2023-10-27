package parallel;

import com.pages.Coe_SupportServicePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class Coe_SupportServicePageStep {

	Coe_SupportServicePage coe_SupportServicePage = new Coe_SupportServicePage(DriverFactory.getDriver());
	
	@Then("page title should be {string} for Support Service section")
	public void page_title_should_be_for_support_service_section(String expected) {
		coe_SupportServicePage.getSupportServicePageTitle();
	}
}
