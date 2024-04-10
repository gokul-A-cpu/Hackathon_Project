package stepDefinitions;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CoursesForCampus;
import pageObjects.HomePage;
import pageObjects.LanguageLearn;
import pageObjects.WebDevPage;
import utilities.ExcelReadWrite;

public class TC_FBS_01_Availability_of_For_Businesses_section {
	
	WebDriver driver;
    HomePage hp=new HomePage(BaseClass.getDriver());;
    WebDevPage wdp=new WebDevPage(BaseClass.getDriver());;
    LanguageLearn LLP=new LanguageLearn(BaseClass.getDriver());;
    CoursesForCampus CFC;
    List<HashMap<String, String>> datamap;
    String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
    
	@Given("Enter {string} data in the search text box")
	public void enter_data_in_the_search_text_box(String row) {
		
		try {
			int index=Integer.parseInt(row)-1;
			String FirstSearch = ExcelReadWrite.getCellData(filepath,"sheet1",index,7);
					
	        
		    hp.search(FirstSearch);
		}
		catch(Exception e){
			e.getMessage();
		}
		
	}

	@When("Enter {string} into the search box")
	public void enter_into_the_search_box(String row) {
		
		try {
			int index=Integer.parseInt(row)-1;
			String SecondSearch = ExcelReadWrite.getCellData(filepath,"sheet1",index,7);
					
		    wdp.search(SecondSearch);
		}
		catch(Exception e){
			e.getMessage();
		}
	    
		
	}

	@Then("The For Businesses Section should be present")
	public void the_for_businesses_section_should_be_present() {
	    
		try {
			
			boolean exp=LLP.availFBS();
			Assert.assertEquals(exp, true);
		}
		catch(Exception e) {
			e.getMessage();
		}
		
	}
}
