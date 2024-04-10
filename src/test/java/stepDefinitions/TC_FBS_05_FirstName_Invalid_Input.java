package stepDefinitions;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.CoursesForCampus;
import pageObjects.HomePage;
import pageObjects.LanguageLearn;
import pageObjects.WebDevPage;
import utilities.ExcelReadWrite;

public class TC_FBS_05_FirstName_Invalid_Input {

	WebDriver driver;
    HomePage hp;
    WebDevPage wdp;
    LanguageLearn LLP=new LanguageLearn(BaseClass.getDriver());
    CoursesForCampus CFC=new CoursesForCampus(BaseClass.getDriver());
    List<HashMap<String, String>> datamap;
    String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
    
	@Then("The respective {string} error message should be displayed")
	public void the_respective_error_message_should_be_displayed(String row){
	    try {
	    	int index=Integer.parseInt(row)-1;
			String errMsg = ExcelReadWrite.getCellData(filepath,"sheet1",index,7);
			boolean exp=CFC.getEMfname(errMsg);
			Assert.assertEquals(exp,true);
	    }
	    catch(Exception e) {
	    	e.getMessage();
	    }
		
	}
}
