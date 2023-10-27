package parallel;

import org.junit.Assert;

import com.pages.AnalystSpeakPage;
import com.pages.LandingPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageSteps {
	private LandingPage landingPage = new LandingPage(DriverFactory.getDriver());
	public AnalystSpeakPage analystSpeak;
	String socialMediaTitle;
	String title;
	String socialMedia;
	@Given("user is on Landing page")
	public void user_is_on_landing_page() {	  
		DriverFactory.getDriver()
		.get("https://test-cybage-corporate-website.pantheonsite.io/");
	}
	
	@When("user gets the title of the page for landing")
	public void user_gets_the_title_of_the_page_for_landing() {
		title = landingPage.getLandingPageTitle();
		System.out.println("Page title is: " + title);
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}
	
	@When("user clicks on logo in header")
	public void user_clicks_on_logo_in_header() {
	    landingPage.clickHeaderLogo();
	}

	@Then("it should redirect to home page")
	public void it_should_redirect_to_home_page() {
	    Assert.assertEquals("IT Services - Technology & Digital Transformation Consulting | Cybage | Cybage Software Pvt Ltd", landingPage.getLandingPageTitle());;
	    
	}
	
	@When("user clicks on career in header")
	public void user_clicks_on_career_in_header() {
	  landingPage.clickOnCareerLink();
	}
	
	@Then("user should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String expectedPage) {
	  landingPage.getLandingPageTitle();
	}
	

	@Given("user accept cookies")
	public void user_accept_cookies() {
	   landingPage.acceptCookies();
	}

	@When("i scroll down to subscribe section")
	public void i_scroll_down_to_subscribe_section() {
	   landingPage.scrollDownHomepage(3000);
	}

	@And("enter my email {string}")
	public void enter_my_email(String email) {
		email=email+Math.random()+"@gmail.com";
	   landingPage.enterSubscriptionEmail(email);
	}

	@And("click on subscribe button")
	public void click_on_subscribe_button() {
	  landingPage.clickSubscribeBtn();
	}

	@Then("i should be redirected thank you page")
	public void i_should_be_redirected_thank_you_page() {
	  String thankyouMsg =  landingPage.getThankYouMsg();
	 // System.out.println(thankyouMsg);
	  Assert.assertEquals("THANK YOU", thankyouMsg);
	}
	
	@And("enter my valid email {string}")
	public void enter_my_valid_email(String email) {
	   landingPage.enterSubscriptionEmail(email);
	}
	
	@Then("i should get validation msg")
	public void i_should_get_validation_msg() {
	  String validationMsg = landingPage.getValidationMsg();
	  Assert.assertEquals("You have already subscribed to this newsletter", validationMsg);
	}
	
	
	@When("i click on following {string}")
	public void i_click_on_following(String socialMediaName) {
		socialMedia = socialMediaName;
		socialMediaTitle = landingPage.clickSocialMediaIcon(socialMediaName);
	}

	@Then("i should be redirected to social media platform")
	public void i_should_be_redirected_to_social_media_platform() {
	   System.out.println("Successfully clicked social media icon "+ socialMedia +" and landed on "+socialMediaTitle);
	   //ApplicationHooks.scenarioName.log("Successfully clicked social media icon "+ socialMedia +" and landed on "+socialMediaTitle);
	}

	@Given("user clicks on burger Menu")
	public void user_clicks_on_burger_menu() {
	   landingPage.clickOnBurgerMenu();
	}

	@Given("click analyst speak from menulist")
	public void click_analyst_speak_from_menulist() {
	   analystSpeak = landingPage.clickOnAnalystSpeakInMenu();
	}
	
	@Given("user scroll to footer")
	public void user_scroll_to_footer() {
		landingPage.scrollDownToFooter();
			
		
	}
	
	@Given("user clicks on decisionMines in menu")
	public void user_clicks_on_decision_mines_in_menu() {
	   landingPage.clicksOnDecisionMines();
	}
	
	
	@Given("user clicks on industry section")
	public void user_clicks_on_industry_section() {
		landingPage.clicksOnIndustries();
	}
	
	 @And("user clicks on industry section to click on Hitech")
	    public void user_clicks_on_industry_section_to_click_on_hitech() throws Throwable {
	        landingPage.clicksOnIndustriesForHitech();
	    }
	
	 @Given("user clicks on industry section to click on TravelAndHospitality")
	 public void user_clicks_on_industry_section_to_click_on_travel_and_hospitality() {
	         landingPage.clickOnIndustriesForTravelAndHospitality();
	 }
	 
	 @Given("user clicks on Company")
	 public void user_clicks_on_company() {
	     landingPage.clickOnCompany();
	 }
	 
	 @Given("user clicks on Cybage Times")
	 public void user_clicks_on_cybage_times() {
	  landingPage.clickOnCybageTimes();
	 }
	 
	 @Given("user clicks on Newsroom")
	 public void user_clicks_on_newsroom() {
	    landingPage.clickOnNewsroom();
	 }
	 
	 @Given("user clicks on Career")
	 public void user_clicks_on_career() {
	  //  landingPage.clickOnCareerInBurgerMenu();
	 }

	 @Given("user clicks on burger Menu inside header section")
	 public void user_clicks_on_burger_menu_inside_header_section() {
	    landingPage.clickOnBurgerMenuPage();
	 }
}
