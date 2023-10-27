package parallel;

import org.testng.Assert;

import com.pages.FooterPage;
import com.pages.LandingPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterPageSteps {
	
	FooterPage footerPage = new FooterPage(DriverFactory.getDriver());
	String awardPageTitle;
	
//	@When("User click about us link")
//	public void user_click_about_us_link() {
//		footerPage.clickOnAboutUsLink();
//
//	}
//
//
//	@Then("user should redirected to {string} to about us page")
//	public void user_should_redirected_to_about_us_page(String expectedTitle) {
//	  String actualTitle =  footerPage.getAboutUsPageTitle();	 
//	  Assert.assertEquals(expectedTitle, actualTitle);
//	}

	
//	@When("user clicks on awards link in footer")
//	public void user_clicks_on_awards_link_in_footer() {
//	  footerPage.clickOnAwardLinkInFooter();
//	}

//	@Then("user should redirected to {string}")
//	public void user_should_redirected_to(String expected) {
//	   String awardPageTitle= footerPage.getAwardsPageTitle();
//	   Assert.assertEquals(awardPageTitle, expected);
//	}
//	
	
	
	
	
	@When("user clicks on {string} in footer")
	public void user_clicks_on_in_footer(String link) {
		if(link.equals("About Us")) {
			footerPage.clickOnAboutUsLink();
		}else if(link.equals("Awards")) {
			footerPage.clickOnAwardsLink();
		}else if(link.equals("Leadership")) {
			footerPage.clickOnLeadershipLink();
		}else if(link.equals("CeoDesk")) {
			footerPage.clickOnCeoDeskLink();
		}else if(link.equals("Corporate Governance")) {
			footerPage.clickOnCorporateGovernanceLink();
		}else if (link.equals("Media & Advertising")) {
			footerPage.clickOnMediaAndAdvertising();
		}else if(link.equals("Hi-Tech")) {
			footerPage.clickOnHitech();
		}
	    
	}

	@Then("user should redirected to {string} in footer")
	public void user_should_redirected_to_in_footer(String expectedTitle ) {
	    String actualTitle = footerPage.getFooterLinkTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	}


}
