package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.WebDevPage;

public class TC_FTC_03 {
	
	HomePage hp = new HomePage(BaseClass.getDriver());
	WebDevPage wdp = new WebDevPage(BaseClass.getDriver());

	@When("Click the second course")
	public void click_the_second_course() throws InterruptedException {

		wdp.clickSecondCourse();
		
	}
	
	@Then("The second course page should be opened")
	public void the_second_course_page_should_be_opened() {

		Assert.assertEquals(hp.checkSearchPage(), true);
	}
}
