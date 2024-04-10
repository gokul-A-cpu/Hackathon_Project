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

public class TC_FBS_18_Learner_Valid_Input {

	WebDriver driver;
    HomePage hp;
    WebDevPage wdp;
    LanguageLearn LLP=new LanguageLearn(BaseClass.getDriver());
    CoursesForCampus CFC=new CoursesForCampus(BaseClass.getDriver());
    List<HashMap<String, String>> datamap;
    String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
    
	@When("Fill the No of Learners field of the form by {string}")
	public void fill_the_no_of_learners_field_of_the_form_by(String learner) {
		try {
//			int index=Integer.parseInt(row)-1;
//			String learner= ExcelReadWrite.getCellData(filepath,"sheet1",index,7);
			CFC.learners(learner);
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
	}

	@Then("The NoOf Learners field should be present and accept the {string} input value")
	public void the_no_of_learners_field_should_be_present_and_accept_the_input_value(String learners) {
	    
		try {
//			int index=Integer.parseInt(row)-1;
//			String learners= ExcelReadWrite.getCellDataS(filepath,"sheet1",index,7);
			System.out.println(learners);
			boolean exp=CFC.checklearn(learners);
			Assert.assertEquals(exp, true);
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
	}
}
