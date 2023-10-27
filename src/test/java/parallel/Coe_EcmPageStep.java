package parallel;

import org.testng.Assert;

import com.pages.Coe_EcmPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class Coe_EcmPageStep {

	Coe_EcmPage coe_EcmPage = new Coe_EcmPage(DriverFactory.getDriver());
	
	@Then("page title should be {string} for Ecm vertical")
	public void page_title_should_be_for_ecm_vertical(String expected) {
	String actual =	coe_EcmPage.getEcmPageTitle();
	Assert.assertEquals(actual, expected);
	}
	
	

}
