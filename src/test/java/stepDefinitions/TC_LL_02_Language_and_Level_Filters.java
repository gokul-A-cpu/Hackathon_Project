package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.WebDevPage;

public class TC_LL_02_Language_and_Level_Filters {
	WebDevPage wp=new WebDevPage(BaseClass.getDriver());
	HomePage hp=new HomePage(BaseClass.getDriver()); 

	@Then("Validate whether language checkBox is Clickable")
	public void validate_whether_language_check_box_is_clickable() {
		Boolean result=wp.isLanguageCheckBoxClickable();
	    Assert.assertEquals(true,result);
	}

	@Then("Validate whether level checkBox is Clickable")
	public void validate_whether_level_check_box_is_clickable() {
		Boolean result=wp.isLevelCheckBoxClickable();
	    Assert.assertEquals(true,result);
	}
}
