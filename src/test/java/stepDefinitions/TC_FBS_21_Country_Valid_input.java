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
import utilities.ExcelReadWrite;

public class TC_FBS_21_Country_Valid_input {

	WebDriver driver;
    HomePage hp;
    WebDevPage wdp;
    LanguageLearn LLP=new LanguageLearn(BaseClass.getDriver());
    CoursesForCampus CFC=new CoursesForCampus(BaseClass.getDriver());
    List<HashMap<String, String>> datamap;
    String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
    
	@When("Fill the Country field of the form by {string}")
	public void fill_the_country_field_of_the_form_by(String row) {
		try {
			int index=Integer.parseInt(row)-1;
			String countryname= ExcelReadWrite.getCellData(filepath,"sheet1",index,7);
			CFC.country(countryname);
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
	}

	@Then("The country field should be present and accept the {string} input value")
	public void the_country_field_should_be_present_and_accept_the_input_value(String row) {
		try {
			int index=Integer.parseInt(row)-1;
			String countryname= ExcelReadWrite.getCellData(filepath,"sheet1",index,7);
//			System.out.println(countryname);
			boolean exp=CFC.checkCountry(countryname);
			Assert.assertEquals(exp, true);
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
	}
}
