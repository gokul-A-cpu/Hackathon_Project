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

public class TC_FBS_27_Validate_the_form_submission {

	WebDriver driver;
    HomePage hp;
    WebDevPage wdp;
    LanguageLearn LLP=new LanguageLearn(BaseClass.getDriver());
    CoursesForCampus CFC=new CoursesForCampus(BaseClass.getDriver());
    List<HashMap<String, String>> datamap;
    String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
    
	@Then("Redirects to a new page and {string} success message is displayed")
	public void redirects_to_a_new_page_and_success_message_is_displayed(String row) {
		try {
			int index=Integer.parseInt(row)-1;
			String exp = ExcelReadWrite.getCellData(filepath,"sheet1",index,7);
//			System.out.println(exp);
			boolean res=CFC.CheckFormSubmit(exp);
			Assert.assertEquals(res,true);
		}
		catch(Exception e){
			e.getMessage();
		}
		
	}
}
