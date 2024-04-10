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

public class TC_FBS_20_Check_box {

	WebDriver driver;
    HomePage hp;
    WebDevPage wdp;
    LanguageLearn LLP=new LanguageLearn(BaseClass.getDriver());
    CoursesForCampus CFC=new CoursesForCampus(BaseClass.getDriver());
    List<HashMap<String, String>> datamap;
    String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
    
	@When("Fill the checkbox field of the form")
	public void fill_the_checkbox_field_of_the_form() {
	   CFC.ClickCB();
	}

	@Then("The field should be selected")
	public void the_field_should_be_selected() {
	    
		try {

			
			boolean exp=CFC.checkCB();
			Assert.assertEquals(exp, true);
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
	}
}
