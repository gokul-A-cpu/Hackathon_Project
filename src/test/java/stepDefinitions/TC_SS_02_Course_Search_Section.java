package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;

public class TC_SS_02_Course_Search_Section {
	HomePage hp=new HomePage(BaseClass.getDriver());
	
	@Then("validate the working of the search box")
	public void validate_the_working_of_the_search_box() {
		Boolean result=hp.isSearchInputBoxEnabled();
	    Assert.assertEquals(true,result);
	}

	@Then("validate the working of search button")
	public void validate_the_working_of_search_button() {
		Boolean result=hp.isSearchButtonClickable();
	    Assert.assertEquals(true,result);
	}
}