package stepDefinitions;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.CoursesForCampus;
import pageObjects.HomePage;
import pageObjects.LanguageLearn;
import pageObjects.WebDevPage;

public class TC_FBS_03_Availability_of_the_Form {

	WebDriver driver;
    HomePage hp;
    WebDevPage wdp;
    LanguageLearn LLP=new LanguageLearn(BaseClass.getDriver());
    CoursesForCampus CFC=new CoursesForCampus(BaseClass.getDriver());
    List<HashMap<String, String>> datamap;
    String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
	
	@When("Navigate to the For Business Section")
	public void navigate_to_the_for_business_section() {
		try {
			LLP.navigateToForBusiness();
		}
		catch(Exception e) {
			e.getMessage();
		}
		
	}

	@Then("The required form should be present")
	public void the_required_form_should_be_present() {
	    
	    try {
	    	CFC.form();
		    boolean exp=CFC.checkForm();
		    Assert.assertEquals(exp,true);
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}
