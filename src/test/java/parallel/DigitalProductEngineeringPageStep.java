package parallel;

import org.testng.Assert;

import com.pages.DigitalProductEngineeringPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class DigitalProductEngineeringPageStep {
	
	DigitalProductEngineeringPage digitalProductEngineeringPage = new DigitalProductEngineeringPage(DriverFactory.getDriver());
	
	@Then("user should land on {string} inside digital product")
	public void user_should_land_on_inside_digital_product(String expected) {
	String actual =	digitalProductEngineeringPage.getDigitalProjectEngineeringPageTitle();	
	Assert.assertEquals(actual, expected);
	}
	
	

}
