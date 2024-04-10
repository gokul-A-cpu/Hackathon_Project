package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	  
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//Finding WebElements 
	@FindBy(xpath="//*[@placeholder='What do you want to learn?']") 
	WebElement searchInputBox;
//	@FindBy(xpath="//input[@class='react-autosuggest__input']") 
//	WebElement searchInputBox;
	
	@FindBy(xpath="//button[@class='nostyle search-button']") 
	WebElement searchButton;
	
	public String getTitle() {
		String title=driver.getTitle();
		return title;
	}
	
	public boolean isSearchInputBoxPresent() {
		Boolean result=searchInputBox.isDisplayed();
		return result;
	}
	
	public boolean isSearchButtonPresent() {
		Boolean result=searchButton.isDisplayed();
		return result; 
	}
	
	public boolean isSearchInputBoxEnabled() {
		Boolean result=searchInputBox.isEnabled();
		return result;
	}
	
	public boolean isSearchButtonClickable() {
		Boolean result=searchButton.isEnabled();
		return result; 
	}
	
	public void search(String value) {
		searchInputBox.sendKeys(value);
		js.executeScript("arguments[0].click()",searchButton);
	}
	
	public Boolean searchResult(String exp) {
		String result=BaseClass.getDriver().findElement(By.xpath("//div[@class='rc-SearchResultsHeader']//span")).getText();
	    if(result.contains(exp)) {
	    	return true;
	    }else
	    {
	    	return false;
	    }
	}
	
	public void clickSearchInputBox()
	{
		
		searchInputBox.click();
	}
	
	public void searchCourse(String string) throws InterruptedException
	{	Thread.sleep(5000);
		searchInputBox.sendKeys(string);
	}
	
	public void clickSearchButton()
	{
		BaseClass.getLogger().info("Clicking search button");
		js.executeScript("arguments[0].click();",searchButton);

	}
	
	public boolean checkSearchPage() {
		
		if((driver.getTitle()).contains("Coursera"))
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
	
	public void PageClose() {
	      driver.close();
	   }
}
