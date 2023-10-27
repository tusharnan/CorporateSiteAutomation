package parallel;

import org.testng.Assert;

import com.pages.TravelAndHospitalityPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TravelAndHospitalityPageStep {

	private TravelAndHospitalityPage travelAndHospitalityPage = new TravelAndHospitalityPage(DriverFactory.getDriver());
	
	@Given("user clicks on Travel and Hospitality")
	public void user_clicks_on_travel_and_hospitality() {
		travelAndHospitalityPage.clickOnTravelAndHospitalityVertical();
	}
	
	@Given("user clicks on overview under Travel and Hospitality vertical")
	public void user_clicks_on_overview_under_travel_and_hospitality_vertical() {
		travelAndHospitalityPage.clickOnTravelAndHospitalityOverview();
	}

	

	@Then("user should be redirected to {string} of travel and hospitality section")
	public void user_should_be_redirected_to_of_travel_and_hospitality_section(String expected) {
		String actual =travelAndHospitalityPage.getTravelAndHospitalityTitles();
		Assert.assertEquals(actual, expected);
	}

	@Given("user click on Hospitality card")
	public void user_click_on_hospitality_card() {
		travelAndHospitalityPage.clickOnHospitalityCard();
	}

	@Then("page title should be {string} for travel and hospitality subpages")
	public void page_title_should_be_for_travel_and_hospitality_subpages(String string) {
		travelAndHospitalityPage.getTravelAndHospitalityTitles();
	}
	
	@Given("user clicks on distribution in menulist")
	public void user_clicks_on_distribution_in_menulist() {
		travelAndHospitalityPage.clickOnDistribution();
	}

	@Given("user clicks on car rental in menulist")
	public void user_clicks_on_car_rental_in_menulist() {
	  travelAndHospitalityPage.clickOnCarRental();
	}

	@Given("user clicks on Events and meetings in menulist")
	public void user_clicks_on_events_and_meetings_in_menulist() {
	   travelAndHospitalityPage.clickOnEventsAndMeeting();
	}

	@Given("user clicks on Airlines in menulist")
	public void user_clicks_on_airlines_in_menulist() {
	  travelAndHospitalityPage.clickOnAirline();
	}
}
