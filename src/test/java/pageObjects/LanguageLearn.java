package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;
import utilities.ExcelReadWrite;

public class LanguageLearn extends BasePage{

	public LanguageLearn(WebDriver driver) {
		super(driver);
	}
	
	
			//Finding Web Elements 
	@FindBy(xpath="(//a[@class='cds-119 cds-113 cds-115 css-ia3qe1 cds-142'])[1]")
	WebElement checkFBS;
			
	//SearchBox:
	@FindBy(xpath="(//input[@placeholder='What do you want to learn?'])[1]")
	WebElement searchBox;
	
	//SearchButton:
	@FindBy(xpath="(//div[@class='magnifier-wrapper'])[2]")
	WebElement searchButton;
	
	//SeeAll:
	@FindBy(xpath="(//span[@class='cds-button-label'][normalize-space()='Show more'])[2]")
	WebElement seeAll;
	
	//Close:
	@FindBy(xpath="(//span[@class='cds-button-label'][normalize-space()='Close'])[2]")
	WebElement closeButton;
	
	//HomeButton:
    @FindBy(xpath="//a[@aria-label='Coursera']")
	WebElement homeButton;
    
    //For Enterprise:
    @FindBy(xpath="//a[normalize-space()='For Enterprise']")
	WebElement enterprise;
    
    
    String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";

    
    public void navigateToForBusiness(){
    	BaseClass.getLogger().info("Navigating to For Business section");
    	checkFBS.click();
    }
    
    public boolean availFBS(){
    	BaseClass.getLogger().info("Checking For Business button is displayed or not");
    	return checkFBS.isDisplayed();
    }
    
    public void clearSearch() {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].value=' '",searchBox);
    	BaseClass.getLogger().info("Clearing search box");
    }
	public void searchBox(String value) {
		searchBox.sendKeys(value);
		BaseClass.getLogger().info("Searching values");
	}
	
	public void clickSearch() {
		BaseClass.getLogger().info("Clicking search button");
		searchButton.click();
		
	}
	
	public void clickSeeAll() {
		BaseClass.getLogger().info("Clicking See All link");
		js.executeScript("arguments[0].click();",seeAll);
	}
	
	public boolean SeeAllisDisplayed() {
		BaseClass.getLogger().info("Checking if See All is displayed or not");
		return seeAll.isDisplayed();
	}
	
	public boolean LanguageIsDisplayed() {
		BaseClass.getLogger().info("Checking if Language is displayed or not");
		return seeAll.isDisplayed();
	}
	
	public void readLanguages() throws IOException {
//		System.out.println("************Languages************");
		List<WebElement> languages = driver.findElements(By.xpath("//*[@class='css-zweepb']/label/div/span/span"));
	     
		int row =3;
		for(WebElement s : languages)
			{
				String a = s.getText().replaceAll("[\\(][\\d][\\)]|[\\(][\\d,]+[\\d][\\)]","");   // extracting only numbers and languages 
				
				String b=s.getText().replaceAll("[\\(][^\\d]+[^\\d][\\)]","");
				String c=b.replaceAll("([\\( A-Za-z\\)])","");
				
				for(int i=0;i<1;i++)
				{
					int col=1;
//					System.out.println(a+"-"+c);
					ExcelReadWrite.setCellData(filepath,"Sheet3",row,col,a);
					col++;
					ExcelReadWrite.setCellData(filepath,"Sheet3",row,col,c);
					row++;
				}
				
			}
	     BaseClass.getLogger().info("Extracting Languages");
	}
	
	public void clickClose() {
		closeButton.click();
		BaseClass.getLogger().info("Closing See All section");
	}
	
	public void scrollTillLevel() {
		JavascriptExecutor js=(JavascriptExecutor)driver; 
	    js.executeScript("window.scrollBy(0,1000)","");
	    BaseClass.getLogger().info("Scrolling");
	}
	
	public void readLevels() throws IOException {
//		System.out.println("************Levels************");
		List<WebElement> levels=driver.findElements(By.xpath("//div[@data-testid='search-filter-group-Level']/div/div/div/label/div/span/span"));
	    List<String> levelname=new ArrayList<String>();
	    List<String> levelcount=new ArrayList<String>();
	    //Extracting levels and count
        for(WebElement l:levels) {
      	    String level=l.getText();
      	    String[] c=level.split(" ");
      	    levelname.add(c[0]);
        }
        for(WebElement l:levels) {
        	String level=l.getText().replaceAll("[^0-9]",""); 
            String[] c=level.split(" ");
        	levelcount.add(c[0]);
        }
        int row =3;
        for(int i=0;i<levelname.size();i++) {
//	    	System.out.println(levelname.get(i)+"-"+levelcount.get(i));
        	int col=1;
        	ExcelReadWrite.setCellData(filepath,"Sheet4",row,col,levelname.get(i));
        	col++;
        	ExcelReadWrite.setCellData(filepath,"Sheet4",row,col,levelcount.get(i));
        	row++;
	    }
        BaseClass.getLogger().info("Extracting Difficulty levels");
	}
	
	public void clickHome() {
		BaseClass.getLogger().info("Clicking Home Button");
		homeButton.click();
	}
	
	public boolean checkSearchPage() {
		
		if((driver.getTitle()).contains("Language Learning"))
		{
			BaseClass.getLogger().info("Checking for Language Learning");
			return true;
			
		}
		else 
		{
			BaseClass.getLogger().info("No Language Learning");
			return false;
		}
		
	}
	

	
	
}
