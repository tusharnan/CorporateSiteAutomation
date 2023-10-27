package parallel;

import org.testng.Assert;

import com.pages.ArchitecturalServices;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class ArchitecturalPageStep {
	
	ArchitecturalServices architecturalServices = new ArchitecturalServices(DriverFactory.getDriver());
	
	@Then("user should land on {string} inside Architectural services")
	public void user_should_land_on_inside_architectural_services(String expected) {
		String actual = architecturalServices.getArchitectrualServicesPageTitle();
		Assert.assertEquals(expected, actual);
	}
	

}
