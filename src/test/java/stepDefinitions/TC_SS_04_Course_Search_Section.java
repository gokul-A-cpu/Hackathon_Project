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

public class TC_SS_04_Course_Search_Section { 
	HomePage hp=new HomePage(BaseClass.getDriver());
	WebDriver driver;
    WebDevPage wdp;
    LanguageLearn LLP=new LanguageLearn(BaseClass.getDriver());
    CoursesForCampus CFC=new CoursesForCampus(BaseClass.getDriver());
    List<HashMap<String, String>> datamap;
    String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
	
	@When("Invalid data is provided in the search text box String {string}")
	public void invalid_data_is_provided_in_the_search_text_box_string(String row) {
		
		try {
			int index=Integer.parseInt(row)-1;
			String string = ExcelReadWrite.getCellData(filepath,"sheet1",index,7);
			hp.search(string);
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
	}

	@Then("respective results regarding {string} invalid data is displayed in the webpage")
	public void respective_results_regarding_invalid_data_is_displayed_in_the_webpage(String row) {
		
		try {
			int index=Integer.parseInt(row)-1;
			String string = ExcelReadWrite.getCellData(filepath,"sheet1",index,7);
//			System.out.println(string);
			Boolean result=hp.searchResult(string);
		    Assert.assertEquals(result,true);
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
		
	}
}