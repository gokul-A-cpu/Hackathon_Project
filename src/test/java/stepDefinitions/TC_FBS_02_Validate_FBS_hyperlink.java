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

public class TC_FBS_02_Validate_FBS_hyperlink {

	WebDriver driver;
    HomePage hp;
    WebDevPage wdp;
    LanguageLearn LLP=new LanguageLearn(BaseClass.getDriver());
    CoursesForCampus CFC=new CoursesForCampus(BaseClass.getDriver());
    List<HashMap<String, String>> datamap;
    String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
    
	
	@When("Click the hyperlink of for business")
	public void click_the_hyperlink_of_for_business() {
		
		try {
			LLP.navigateToForBusiness();
		}
		catch(Exception e) {
			e.getMessage();
		}
		
	}

	@Then("Navigates to the business page")
	public void navigates_to_the_business_page() {
	    
		try {
			
			boolean exp= CFC.forBusinessValidate();
			
			Assert.assertEquals(exp, true);
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}
