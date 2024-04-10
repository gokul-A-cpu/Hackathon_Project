package stepDefinitions;

import org.junit.Assert;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;


public class TC_HP_01_Home_Page {
	HomePage hp=new HomePage(BaseClass.getDriver());
	@Then("Navigate to the homepage")
	public void Navigate_to_the_homepage() {
		String title=hp.getTitle();
	    Assert.assertEquals(title,"Coursera | Degrees, Certificates, & Free Online Courses");
	}
}