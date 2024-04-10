package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.CoursesForCampus;
import pageObjects.FirstCoursePage;
import pageObjects.HomePage;
import pageObjects.LanguageLearn;
import pageObjects.SecondCoursePage;
import pageObjects.WebDevPage;

public class TC_ETE_01 {
	
	WebDevPage wdp = new WebDevPage(BaseClass.getDriver());
	HomePage hp = new HomePage(BaseClass.getDriver());
	FirstCoursePage fcp = new FirstCoursePage(BaseClass.getDriver());
	SecondCoursePage scp = new SecondCoursePage(BaseClass.getDriver());
	LanguageLearn ll = new LanguageLearn(BaseClass.getDriver());
	CoursesForCampus cfc = new CoursesForCampus(BaseClass.getDriver());
	
	
	@Then("Click Beginners level checkbox")
	public void click_beginners_level_checkbox() throws InterruptedException {
		BaseClass.getLogger().info("Clicking Beginner checkbox");
		wdp.clickBeginnerCheckBox();
		
	}

	@Then("Click English Language checkbox")
	public void click_english_language_checkbox() throws InterruptedException {
		BaseClass.getLogger().info("Clicking English checkbox");
		wdp.clickEnglishCheckBox();
		
	}

	@Then("Extract the First course name, total learning hours and rating")
	public void extract_the_first_course_name_total_learning_hours_and_rating() throws InterruptedException, IOException {
		
		fcp.getWindowHandlesListF();
		fcp.firstCourseDetails();
		hp.PageClose();
		Thread.sleep(2000);
		fcp.backToWindowF();
		
	}

	@Then("Extract the Second course names, total learning hours and rating")
	public void extract_the_second_course_names_total_learning_hours_and_rating() throws InterruptedException, IOException {
		scp.getWindowHandlesListS();
		scp.secondCourseDetails();
		hp.PageClose();
		Thread.sleep(2000);
		scp.backToWindowS();
		
	}

	@Then("Click seeAll in language tag")
	public void click_see_all_in_language_tag() {
		ll.clickSeeAll();
		
	}

	@Then("Extract all the languages with count")
	public void extract_all_the_languages_with_count() throws IOException {
		ll.readLanguages();
		
	}

	@Then("Close the seeAll")
	public void close_the_see_all() {
		ll.clickClose();
		
	}

	@Then("Extract Different levels with count")
	public void extract_different_levels_with_count() throws IOException {
		ll.readLevels();
		
	}

	@Then("Return to Home Page")
	public void return_to_home_page() {
		ll.clickHome();
		
	}

	@Then("Go to For Enterprise")
	public void go_to_for_enterprise() {
		cfc.enterprise();
		
	}

	@Then("Look for Ready to transform form")
	public void look_for_ready_to_transform_form() {
		cfc.form();
		
	}

	@Then("Fill the form with credentials with invalid email")
	public void fill_the_form_with_credentials_with_invalid_email() throws InterruptedException {
		cfc.firstName("Jaya");
		cfc.lastName("Govindhan");
		cfc.email("123abc");
		cfc.phone("1234567890");
		cfc.jobTitle("Engineer");
		cfc.learners("1-4");
		cfc.country("India");
		cfc.state("Tamil Nadu");
		cfc.needs("Learner support");
		
		
	}

	@Then("Click Register sbutton")
	public void click_register_sbutton() {
		cfc.clickSubmit();
		
	}

	@Then("Capture the error message and display")
	public void capture_the_error_message_and_display() throws IOException {
		Assert.assertEquals(cfc.getErrorMsg(),true);
		
	}
	
	
}
