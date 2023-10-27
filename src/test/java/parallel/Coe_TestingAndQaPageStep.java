package parallel;

import org.testng.Assert;

import com.pages.Coe_TestingAndQaPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class Coe_TestingAndQaPageStep {
	Coe_TestingAndQaPage coe_TestingAndQaPage = new Coe_TestingAndQaPage(DriverFactory.getDriver());

	
	@Then("page title should be {string} for Testing and Qa section")
	public void page_title_should_be_for_testing_and_qa_section(String expected) {
		String actual =coe_TestingAndQaPage.getTestingAndQaPageTitle();
		Assert.assertEquals(actual, expected);
	}
}
