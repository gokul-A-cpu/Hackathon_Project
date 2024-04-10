package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.FirstCoursePage;

public class TC_FTC_02 {
	
	FirstCoursePage fcp = new FirstCoursePage(BaseClass.getDriver());

	@Then("The first course header, rating and learning hours should be displayed")
	public void the_first_course_header_rating_and_learning_hours_should_be_displayed() throws InterruptedException {
		fcp.getWindowHandlesListF();
		Assert.assertEquals(fcp.firstCourse_H_IsDisplayed(), true);
		Assert.assertEquals(fcp.firstCourse_R_IsDisplayed(), true);
		Assert.assertEquals(fcp.firstCourse_T_IsDisplayed(), true);
		

	}
}
