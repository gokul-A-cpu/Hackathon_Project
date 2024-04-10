package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LanguageLearn;
import pageObjects.WebDevPage;

public class TC_LLS_01 {
	
	WebDevPage wdp = new WebDevPage(BaseClass.getDriver());
	LanguageLearn ll = new LanguageLearn(BaseClass.getDriver());
	
	
	@Given("Clear Search")
	public void clear_search() {
		ll.clearSearch();
		
	}

	@When("Enter {string} data to the search box")
	public void enter_data_to_the_search_box(String string) {
		ll.searchBox(string);
		
	}

	@When("Click Search sButton")
	public void click_search_s_button() {
		ll.clickSearch();
		
	}

	@Then("Getting the courses based on the search")
	public void getting_the_courses_based_on_the_search() {
		Assert.assertEquals(ll.checkSearchPage(), true);
		
	}
	
}
