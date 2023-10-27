package parallel;

import org.testng.Assert;

import com.pages.Coe_EnterpriseMobilityPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class EnterpriseMobilityPageStep {

	Coe_EnterpriseMobilityPage coe_EnterpriseMobilityPage = new Coe_EnterpriseMobilityPage(DriverFactory.getDriver());

	
	@Then("title of the page should be {string}")
	public void title_of_the_page_should_be(String expected) {
		String actual = coe_EnterpriseMobilityPage.getEnterpriseMobilityPageTitles();
		Assert.assertEquals(expected, actual);
	}
}
