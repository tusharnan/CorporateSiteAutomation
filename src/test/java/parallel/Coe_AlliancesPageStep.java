package parallel;

import org.testng.Assert;

import com.pages.Coe_AlliancesPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class Coe_AlliancesPageStep {
	
	Coe_AlliancesPage coe_AlliancesPage = new Coe_AlliancesPage(DriverFactory.getDriver());

	@Then("page title should be {string} for alliances section")
	public void page_title_should_be_for_alliances_section(String expected) {
	String actual =	coe_AlliancesPage.getAlliancesPageTitle();
	Assert.assertEquals(actual, expected);
	}
}
