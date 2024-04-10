package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;
import utilities.ExcelReadWrite;

public class SecondCoursePage extends BasePage{

	public WebDevPage wdp;
	public int secondCourseHours;
	public List<Integer> listOfSecondCourseHoursInInt=new ArrayList<Integer>();
	
	private static String pid;
	private static String child;
	
	String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";

	public SecondCoursePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Finding web elements 
	@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[1]/div[1]/section//h1")
	public WebElement secondCourseTitle;
				   
	@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/section/div/div[3]/div/div/div[1]")
	public WebElement hours2;
	
	@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/section/div/div[3]/div/div[1]")
	public WebElement hours1; 
	
	@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[3]/div[1]")
	public WebElement hours; 
	
	@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[1]/div[1]")
	public WebElement secondCourseRating;
	
	@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/section/div/div[1]/div/div[1]")
	public WebElement secondCourseRating1;
	

	public boolean secondCourse_T_IsDisplayed()
	{
		BaseClass.getLogger().info("Checking Second Course Title");
		return secondCourseTitle.isDisplayed();
		
			
	}
	public boolean secondCourse_H_IsDisplayed()
	{
		
		try {
			BaseClass.getLogger().info("Checking Second course hours");
			return hours.isDisplayed();
		}
		catch(Exception e)
		{
			BaseClass.getLogger().info("No second course hours displayed");
			return hours1.isDisplayed();
		}
			
	}
	public boolean secondCourse_R_IsDisplayed()
	{
		try {
			BaseClass.getLogger().info("Checking Second course rating");
			return secondCourseRating.isDisplayed();
		}
		catch(Exception e)
		{
			BaseClass.getLogger().info("No Second course rating displayed");
			return secondCourseRating1.isDisplayed();
			
		}
		
	}
	
	public void secondCourseDetails() throws IOException
	{
		BaseClass.getLogger().info("Extracting Second course details");
		secondCourseHours=0;
		WebDevPage.courseTitles.add(secondCourseTitle.getText());
//		for(WebElement e: hours)
//		{
//			listOfSecondCourseHoursInInt.add(Integer.parseInt(e.getText().substring(0,2)));
//		}
//		for(int i: listOfSecondCourseHoursInInt)
//		{
//			secondCourseHours=secondCourseHours+i;
//		}
//		listOfSecondCourseHoursInInt.add(Integer.parseInt(hours.getText().substring(0,2)));
//		WebDevPage.courseHours.add(Integer.toString(secondCourseHours));
		try {
			WebDevPage.courseHours.add(hours.getText());
		}
		catch(Exception e){
			WebDevPage.courseHours.add(hours1.getText());
		}
		
		try {
			WebDevPage.courseRatings.add(secondCourseRating.getText());
		}
		catch(Exception e){
			WebDevPage.courseRatings.add(secondCourseRating1.getText());
		}
//		System.out.println("**********************************************************************************************");
//		System.out.println("Second Course");
//		System.out.println("Title : "+WebDevPage.courseTitles.get(1));
//		System.out.println("Hours : "+WebDevPage.courseHours.get(1));
//		System.out.println("Rating : "+WebDevPage.courseRatings.get(1));
//		System.out.println("**********************************************************************************************");
		
		ExcelReadWrite.setCellData(filepath,"Sheet2",8,2,WebDevPage.courseTitles.get(1));
		ExcelReadWrite.setCellData(filepath,"Sheet2",9,2,WebDevPage.courseHours.get(1));
		ExcelReadWrite.setCellData(filepath,"Sheet2",10,2,WebDevPage.courseRatings.get(1));
	
	
	}
	
	public void getWindowHandlesListS()
	{
		BaseClass.getLogger().info("Getting window handles");
		Set<String> windows=driver.getWindowHandles();
		List<String> windlist = new ArrayList<String>(windows);
		child = windlist.get(1);
		driver.switchTo().window(child);	
		if(secondCourse_T_IsDisplayed())
		{
			pid = windlist.get(0);
		}
		else
		{
			pid = windlist.get(1);
			child = windlist.get(0);
			driver.switchTo().window(child);
		}
	}
	
	
	public void backToWindowS() throws InterruptedException
	{
		BaseClass.getLogger().info("Returning to Parent Window");
		driver.switchTo().window(pid);	
   }
}
