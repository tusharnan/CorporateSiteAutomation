package parallel;

import org.testng.Assert;

import com.pages.Coe_CloudPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class Coe_CloudPageStep {

	Coe_CloudPage coe_CloudPage = new Coe_CloudPage(DriverFactory.getDriver());

	
	@Then("page title should be {string} under cloud vertical")
	public void page_title_should_be_under_cloud_vertical(String expected) {
		String actual = coe_CloudPage.getCloudPageTitle();
		Assert.assertEquals(expected, actual);
	}
}
