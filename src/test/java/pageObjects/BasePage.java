package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	   public WebDriver driver;
	   public WebDriverWait mywait;
	   public JavascriptExecutor js;
    
	   public BasePage(WebDriver driver){    //Initializing driver,wait,JS,PageFactory
		   
		     this.driver=driver;
		     mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			 js=(JavascriptExecutor) driver;
		     PageFactory.initElements(driver,this);
	   }
}
