package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;
import utilities.ExcelReadWrite;

public class FirstCoursePage extends BasePage {

	public static String firstCourseWindow;
	public static String secondCourseWindow;
	public WebDevPage wdp;
	
	private static String pid;
	private static String child;
	
	String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
	
	public FirstCoursePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	// Finding Web Elements
	@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[1]/div[1]/section/h1")
	public WebElement firstCourseTitle;

	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/main[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[2]/div[3]/div[1]")
	public WebElement firstCourseHours;

	@FindBy(xpath="/html/body/div[2]/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[1]/div[1]")
	public WebElement firstCourseRating;
	
	
	public boolean firstCourse_T_IsDisplayed()
	{
		
		
		return firstCourseTitle.isDisplayed();
			
	}
	public boolean firstCourse_H_IsDisplayed()
	{
		
		
		return firstCourseHours.isDisplayed();
			
	}
	public boolean firstCourse_R_IsDisplayed()
	{
		
		
		return firstCourseRating.isDisplayed();
			
	}
	
	public void firstCourseDetails() throws IOException
	{
		BaseClass.getLogger().info("Getting the first first course details");
		WebDevPage.courseTitles.add(firstCourseTitle.getText());
		WebDevPage.courseHours.add(firstCourseHours.getText());
		WebDevPage.courseRatings.add(firstCourseRating.getText());
		
		ExcelReadWrite.setCellData(filepath,"Sheet2",2,2,WebDevPage.courseTitles.get(0));
		ExcelReadWrite.setCellData(filepath,"Sheet2",3,2,WebDevPage.courseHours.get(0));
		ExcelReadWrite.setCellData(filepath,"Sheet2",4,2,WebDevPage.courseRatings.get(0));
		
		
//		System.out.println("**********************************************************************************************");
//		System.out.println("First Course");
//		System.out.println("Title : "+WebDevPage.courseTitles.get(0));
//		System.out.println("Hours : "+WebDevPage.courseHours.get(0));
//		System.out.println("Rating : "+WebDevPage.courseRatings.get(0));
//		System.out.println("**********************************************************************************************");		
		
	}
	
	public void backToWindowF() throws InterruptedException
	{
		driver.switchTo().window(pid);	
   }
	
	public void getWindowHandles()
	{
		
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		for(String i: windows)
		{
			
			if(driver.switchTo().window(i).getTitle().equalsIgnoreCase("Python for Data Science, AI & Development | Coursera"))
			{
				firstCourseWindow=i;
			}
			else if(driver.switchTo().window(i).getTitle().equalsIgnoreCase("Meta Front-End Developer Professional Certificate | Coursera"))
			{
				secondCourseWindow=i;
			}
		}
		BaseClass.getLogger().info("Getting windows handles");
   }
	
	public void getWindowHandlesListF() throws InterruptedException
	{
		

		Set<String> windows=driver.getWindowHandles();
		List<String> windlist = new ArrayList<String>(windows);
		child = windlist.get(1);
		driver.switchTo().window(child);	
		if(firstCourse_T_IsDisplayed())
		{
			pid = windlist.get(0);
		}
		else
		{
			pid = windlist.get(1);
			child = windlist.get(0);
			driver.switchTo().window(child);
		}
		BaseClass.getLogger().info("Getting First course window handle");
   }
}
