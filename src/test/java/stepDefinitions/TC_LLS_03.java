package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.LanguageLearn;

public class TC_LLS_03 {
	
	LanguageLearn ll = new LanguageLearn(BaseClass.getDriver());
	
	@Then("The Language and Level filters section should be present")
	public void the_language_and_level_filters_section_should_be_present() {
		
		Assert.assertEquals(ll.LanguageIsDisplayed(),true);
		
	}
}
