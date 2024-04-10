package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.WebDevPage;

public class TC_LLS_02 {
	
	WebDevPage wdp = new WebDevPage(BaseClass.getDriver());
	
	@Then("Invalid search error message")
	public void invalid_search_error_message() {
		
		Assert.assertEquals(wdp.invalidSearch(), false);
	}
}
