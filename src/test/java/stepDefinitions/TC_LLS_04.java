package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.LanguageLearn;

public class TC_LLS_04 {
	
	LanguageLearn ll = new LanguageLearn(BaseClass.getDriver());
	
	@Then("The seeAll hyperlink should be present under language filter section")
	public void the_see_all_hyperlink_should_be_present_under_language_filter_section() {
		
		Assert.assertEquals(ll.SeeAllisDisplayed(),true);
	}
	
	
}
