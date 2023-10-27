package parallel;

import org.testng.Assert;

import com.pages.Coe_MartechPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class Coe_MartechPageStep {
	
	Coe_MartechPage coe_MartechPage = new Coe_MartechPage(DriverFactory.getDriver());


	@Then("page title should be {string} under MarTech vertical")
	public void page_title_should_be_under_mar_tech_vertical(String expected) {
		String actual =coe_MartechPage.getMartechPageTitles();
		Assert.assertEquals(expected, actual);
	}
}
