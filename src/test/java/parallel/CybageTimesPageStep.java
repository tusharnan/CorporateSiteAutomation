package parallel;

import com.pages.ContactUsPage;
import com.pages.CybageTimesPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class CybageTimesPageStep {

	CybageTimesPage cybageTimesPage = new CybageTimesPage(DriverFactory.getDriver());

	
	@Then("user should be redirected to {string} on cybage site")
	public void user_should_be_redirected_to_on_cybage_site(String expected) {
	    String actual = cybageTimesPage.getCybageTimesPageTitle();
	}
	
}
