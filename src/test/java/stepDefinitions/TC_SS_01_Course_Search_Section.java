package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;

public class TC_SS_01_Course_Search_Section {
	HomePage hp=new HomePage(BaseClass.getDriver());
	
	@Then("validate whether searchBox is Displayed")
	public void validate_whether_search_box_is_displayed() {
	    Boolean result=hp.isSearchInputBoxPresent();
	    Assert.assertEquals(true,result); 
	}

	@Then("Validate whether searchButton is Displayed")
	public void validate_whether_search_button_is_displayed() {
		Boolean result=hp.isSearchButtonPresent();
	    Assert.assertEquals(true,result); 
	}

}
