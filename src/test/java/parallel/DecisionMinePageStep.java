package parallel;

import org.testng.Assert;

import com.pages.DecisionMinePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class DecisionMinePageStep {
	DecisionMinePage decisionMinePage = new DecisionMinePage(DriverFactory.getDriver());
	String actualTitle;
	@Then("user should land on decisionMine")
	public void user_should_land_on_decision_mine() {
	actualTitle =   decisionMinePage.getDecisionMinePageTitle();
	}

	@Then("title of the  page should be {string} on decisionmines")
	public void title_of_the_page_should_be_on_decisionmines(String expectedTitle) {
	   Assert.assertEquals(actualTitle, expectedTitle);
	}

}
