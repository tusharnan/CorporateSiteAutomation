package parallel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.LandingPage;
import com.pages.SearchPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageSteps {
	String title;
	LandingPage landingPage = new LandingPage(DriverFactory.getDriver());
	SearchPage searchPage ;
     
	@When("user clicks on search icon")
	public void user_clicks_on_search_icon() {
		DriverFactory.getDriver()
		.get("https://test-cybage-corporate-website.pantheonsite.io/");
		landingPage.acceptCookies();
	    landingPage.clickOnSearchIcon();
	}

	@When("enter {string}")
	public void enter(String input) {
	  searchPage= landingPage.enterValueInSearchInput(input);
	}
	
	@Then("user should land on search page")
	public void user_should_land_on_search_page() {
		 title = searchPage.getSearchPageTitle();
		System.out.println("Search page title is "+ title);
		
	}

	@Then("search result should show {string}")
	public void search_result_should_show(String expectedSearchResult) {
	   String expected ="SHOWING RECORDS";
	  String actual = searchPage.getSearchText();
	  Assert.assertTrue(actual.contains(expected));
	}
}
