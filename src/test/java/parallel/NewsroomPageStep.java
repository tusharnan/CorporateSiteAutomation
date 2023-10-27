package parallel;

import org.testng.Assert;

import com.pages.NewsroomPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class NewsroomPageStep {

	private NewsroomPage newsroomPage = new NewsroomPage(DriverFactory.getDriver());

	
	
	@Then("page title should be {string} under newsroom vertical")
	public void page_title_should_be_under_newsroom_vertical(String expected) {
		String actual = newsroomPage.getNewsroomPageTitle();
		Assert.assertEquals(expected, actual);
	}
}
