package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.WebDevPage;

public class TC_FTC_01 {
	
	
	HomePage hp = new HomePage(BaseClass.getDriver());
	WebDevPage wdp = new WebDevPage(BaseClass.getDriver());

	@Given("Search for {string}")
	public void search_for(String string){
		try {
			hp.searchCourse(string);
			hp.clickSearchButton();
		}
		catch(Exception e) {
			
		}
		
	}

	@Given("Select the required check box")
	public void select_the_required_check_box() throws InterruptedException {
		
		try {
			wdp.clickEnglishCheckBox();
			wdp.clickBeginnerCheckBox();
		}
		catch(Exception e) {
			
		}
		
		

	}

	@Then("Click the first course")
	public void click_the_first_course() throws InterruptedException {
		try {
			wdp.clickFirstCourse();
		}
		catch(Exception e) {
			
		}
		
		
		
	}

	@Then("The first course page should be opened")
	public void the_first_course_page_should_be_opened() {
		try {
			Assert.assertEquals(hp.checkSearchPage(), true);
		}
		catch(Exception e) {
			
		}
		
		

	}
}
