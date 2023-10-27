package parallel;

import org.testng.Assert;

import com.pages.AnalystSpeakPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class AnalystSpeakPageStep {
	String title;
	AnalystSpeakPage analystSpeak = new AnalystSpeakPage(DriverFactory.getDriver());

	
	@Then("user should land on analyst speak page")
	public void user_should_land_on_analyst_speak_page() {
	   title = analystSpeak.getAnalystSpeakPageTitle();
	  System.out.println("title of anlyst page is" + title);
	}
	
	
	@Then("title of the  page should be {string}")
	public void title_of_the_page_should_be(String expectedTitle) {
		 //String heading = analystSpeak.getAnalystPageHeading();
		   Assert.assertEquals(title,expectedTitle);
	}

}
