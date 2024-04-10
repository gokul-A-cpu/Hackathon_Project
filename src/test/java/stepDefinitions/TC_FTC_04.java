package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.SecondCoursePage;

public class TC_FTC_04 {
	
	SecondCoursePage scp = new SecondCoursePage(BaseClass.getDriver());

	@Then("The second course header, rating and learning hours should be displayed")
	public void the_second_course_header_rating_and_learning_hours_should_be_displayed() throws InterruptedException {
		scp.getWindowHandlesListS();
		Assert.assertEquals(scp.secondCourse_T_IsDisplayed(), true);
		Assert.assertEquals(scp.secondCourse_H_IsDisplayed(), true);
		Assert.assertEquals(scp.secondCourse_R_IsDisplayed(), true);

	}
}
