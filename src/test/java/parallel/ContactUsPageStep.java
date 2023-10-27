package parallel;

import com.pages.ContactUsPage;
import com.pages.LandingPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsPageStep {
	
	ContactUsPage contactUsPage = new ContactUsPage(DriverFactory.getDriver());
	
	
	@Given("user is on contact us page")
	public void user_is_on_contact_us_page() {
		DriverFactory.getDriver().get("https://test-cybage-corporate-website.pantheonsite.io/contactus");
	  
	}

	@When("user fills the form")
	public void user_fills_the_form() {
	    contactUsPage.fillContactUsForm();
	}

	@And("accept privacy policy")
	public void accept_privacy_policy() {
	   contactUsPage.acceptPrivacyPolicy();
	}

	@And("subscribe to email")
	public void subscribe_to_email() {
	    contactUsPage.subscribeToNewUpdate();
	}

	@And("click login button")
	public void click_login_button() {
	   contactUsPage.submitForm();
	}

	@Then("user should get success msg")
	public void user_should_get_success_msg() {
	    
	}

}
