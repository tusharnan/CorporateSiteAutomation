package parallel;

import com.pages.Coe_BiPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class Coe_BIPageStep {
	
	Coe_BiPage coe_BiPage = new Coe_BiPage(DriverFactory.getDriver());
	
	@Then("title of the page should be {string} under Bi section")
	public void title_of_the_page_should_be_under_bi_section(String string) {
		coe_BiPage.getBiPageTitle();
	}

}
