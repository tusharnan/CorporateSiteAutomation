package parallel;

import org.testng.Assert;

import com.pages.MediaAndAdvertisingPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MediaAndAdvertisingPageSteps {
	
	private MediaAndAdvertisingPage mediaAndAdvertisingPage = new MediaAndAdvertisingPage(DriverFactory.getDriver());

	@Given("user clicks on Media and Advertising vertical")
	public void user_clicks_on_media_and_advertising_vertical() {
		mediaAndAdvertisingPage.clickOnMediaAndAdvertising();
	}

	@Given("user clicks on overview under media and advertising section")
	public void user_clicks_on_overview_under_media_and_advertising_section() {
		mediaAndAdvertisingPage.clickOnMediaAndAdvertisingOverview();  
	}

	
	@Given("user clicks on Ad Tech subvertical under MandA page")
	public void user_clicks_on_ad_tech_subvertical_under_mand_a_page() {
		mediaAndAdvertisingPage.clickOnAdTechSubvertical();
	}
	
	@Then("title of the page needs to be {string}")
	public void title_of_the_page_needs_to_be(String expected) {
		String actual =mediaAndAdvertisingPage.getMediaAndAdvetisingPageTitle();
        Assert.assertEquals(actual, expected);
	}


	@Given("user clicks on advertising and marketing page")
	public void user_clicks_on_advertising_and_marketing_page() {
		mediaAndAdvertisingPage.clickOnAdvertisingAndMarketingSubvertical();
	}

	@Given("user clicks on publishing subverical page")
	public void user_clicks_on_publishing_subverical_page() {
		mediaAndAdvertisingPage.clickOnPublishingSubvertical();
	}
	
	@Given("user clicks on video Streaming and ott  subverical page")
	public void user_clicks_on_video_streaming_and_ott_subverical_page() {
		mediaAndAdvertisingPage.clickOnVideoStreamingSubvertical();
	}

	@Given("user clicks on entertainment production subverical page")
	public void user_clicks_on_entertainment_production_subverical_page() {
	    mediaAndAdvertisingPage.clickOnEntertainmentProductionSubvertical();
	}
}
