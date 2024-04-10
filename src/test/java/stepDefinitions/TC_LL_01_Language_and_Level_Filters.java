package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.WebDevPage;
import utilities.ExcelReadWrite;

public class TC_LL_01_Language_and_Level_Filters {
	WebDevPage wp=new WebDevPage(BaseClass.getDriver());
	HomePage hp=new HomePage(BaseClass.getDriver()); 
	String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
	
	@Given("the URL navigates to the homePage")
	public void the_url_navigates_to_the_home_page() {
		String title=hp.getTitle();
	    Assert.assertEquals(title,"Coursera | Degrees, Certificates, & Free Online Courses");
	}

	@Given("search for {string}")
	public void search_for(String row) {
		try {
			int index=Integer.parseInt(row)-1;
			String string = ExcelReadWrite.getCellData(filepath,"sheet1",index,7);
			hp.search(string); 
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
		
	}

	@Then("Validate whether language checkBox is displayed")
	public void validate_whether_language_check_box_is_displayed() {
	     
	    
	    try {
	    	Boolean result=wp.isLanguageCheckBoxDisplayed();
		    Assert.assertEquals(true,result); 
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
	}

	@Then("Validate whether level checkBox is displayed")
	public void validate_whether_level_check_box_is_displayed() {
		try {
			Boolean result=wp.isLevelCheckBoxDisplayed();
		    Assert.assertEquals(true,result); 
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
		
	}

}
