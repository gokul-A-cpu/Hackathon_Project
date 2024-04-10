package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelReadWrite;



public class CoursesForCampus extends BasePage{

	public CoursesForCampus(WebDriver driver) {
		super(driver);
	}                                                          //Finding WebElements 
	//ErrorMsg:
		@FindBy(xpath="//div[@id='ValidMsgEmail']")
		WebElement errormsg;
	
	//By var
	By business=By.xpath("//img[@alt='Coursera for Business']");
	
	//Form
	@FindBy(xpath="(//form[@class='mktoForm mktoHasWidth mktoLayoutLeft'])[1]")
	WebElement checkform;
	
	//To check business section
	@FindBy(xpath="//img[@alt='Coursera for Business']")
	WebElement businessvalid;
	
	
	//Form Element:
	@FindBy(xpath="(//div[@class='cds-9 css-1xdhyk6 cds-10 cds-18'])[2]")
	WebElement form;
	
	//For Enterprise:
	@FindBy(xpath="//a[normalize-space()='For Enterprise']")
	WebElement enterprise;
	
	
	//FirstName:
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstName;
	
	//LastName:
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastName;
	
	//Email:
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	//Phone:
	@FindBy(xpath="//input[@id='Phone']")
	WebElement phone;
	
	//ComapanyName:
	@FindBy(xpath="//input[@id='Company']")
	WebElement companyName;
	
	//ComapanySize:
	@FindBy(xpath="//select[@id='Employee_Range__c']")
	WebElement companySize;
	
	//JobTitle:
	@FindBy(xpath="//input[@id='Title']")
	WebElement jobTitle;
	
	//Learners:
	@FindBy(xpath="//select[@id='Self_reported_employees_to_buy_for__c']")
	WebElement learners;
	
	
	@FindBy(id="mktoCheckbox_92958_0")
	WebElement agreementCB;
	
	//Country:
	@FindBy(xpath="//select[@id='Country']")
	WebElement country;
	
	//State:
	@FindBy(xpath="//select[@id='State']")
	WebElement state;
	
	//Needs:
	@FindBy(id="What_the_lead_asked_for_on_the_website__c")
	WebElement needs;
	
	//Submit:
	@FindBy(xpath="//button[@class='mktoButton']")
	WebElement submit;
	
	//ErrorMsg:
	@FindBy(xpath="//div[@id='ValidMsgEmail']")
	WebElement errormsgemail;
		
	@FindBy(xpath="//div[@id='ValidMsgFirstName']")
	WebElement errormsgfname;
	
	@FindBy(xpath="//div[@id='ValidMsgLastName']")
	WebElement errormsglname;
	
	@FindBy(xpath="//div[@id='ValidMsgPhone']")
	WebElement errormsgphone;
	
	@FindBy(xpath="//div[@id='ValidMsgCompany']")
	WebElement errormsgcompany;
	
	@FindBy(xpath="//div[@id='ValidMsgEmployee_Range_c']")
	WebElement errormsgerange;
	
	@FindBy(xpath="//div[@id='ValidMsgTitle']")
	WebElement errormsgtitle;
	
	@FindBy(xpath="//div[@id='ValidMsgSelf_reported_employees_to_buy_for__c']")
	WebElement errormsgnolearners;
	
	@FindBy(xpath="//div[@id='ValidMsgCountry']")
	WebElement errormsgcountry;
	
	@FindBy(xpath="//div[@id='ValidMsgState']")
	WebElement errormsgstate;
	
	@FindBy(xpath="//div[@id='ValidMsgWhat_the_lead_asked_for_on_the_website__c']")
	WebElement errormsgneed;
	
	
	@FindBy(xpath="//*[@class='cds-119 css-1euneyv cds-121']")
	WebElement successMsg;
	
	
	String filepath =System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
	
	
	
	
	public boolean forBusinessValidate() throws InterruptedException {
		
//		Thread.sleep(000);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(business));
		
		if(businessvalid.isDisplayed()){
			return true;
		}
		else {
			return false;
		}
		
	}
	public void enterprise() {
		js.executeScript("arguments[0].click();",enterprise);
	}
	public boolean checkForm() {
		
		return checkform.isDisplayed();
		
	}
	
	public void form() { 
		js.executeScript("arguments[0].scrollIntoView();",form);
	}
	
	public void firstName(String fName) {
		firstName.sendKeys(fName); 
	}
	public boolean checkFname(String fName) {
		
		String temp=firstName.getAttribute("value");
		return temp.equals(fName);
	}
	
	public boolean getEMfname(String EMfname) {
		
		String temp=errormsgfname.getText();
//		System.out.println(temp);

		return temp.equals(EMfname);
	}
	
	public void lastName(String lname) {
		lastName.sendKeys(lname); 
	}
	public boolean checkLname(String lName) {
		
		String temp=lastName.getAttribute("value");
		return temp.equals(lName);
	}
	
	public boolean getEMlname(String EMlname) {
		
		String temp=errormsglname.getText();
//		System.out.println(temp);

		return temp.equals(EMlname);
	}
	
	public void email(String email1) {
		email.sendKeys(email1); 
	}
	
	public boolean checkEmail(String email1) {
		
		String temp=email.getAttribute("value");
		return temp.equals(email1);
	}
	
	public boolean getEMemail(String email) {
		
		String temp=errormsgemail.getText();
//		System.out.println(temp);

		return temp.equals(email);
	}
	
	public void phone(String phone1){
		phone.sendKeys(phone1);  
	}
	public boolean checkPhone(String phone1) {
		
		String temp=phone.getAttribute("value");
		return temp.equals(phone1);
	}
	
	
	public boolean getEMphone(String phone1) {
		
		String temp=errormsgphone.getText();
//		System.out.println(temp);

		return temp.contains(phone1);
	}
	
	public void companyName(String cname) {
		companyName.sendKeys(cname); 
	}
	
	public boolean checkCname(String cname) {
		
		String temp=companyName.getAttribute("value");
		return temp.equals(cname);
	}
	
	
	public boolean getEMcname(String cname) {
		
		String temp=errormsgcompany.getText();
//		System.out.println(temp);

		return temp.equals(cname);
	}
	
	public void companySize(String csize) {
		Select size=new Select(companySize);
		size.selectByVisibleText(csize);
	}
	
	public boolean checkCsize(String csize) {
		
		String temp=companySize.getAttribute("value");
		return temp.equals(csize);
	
	}
	
	public boolean getEMcsize(String csize) {
		
		String temp=errormsgerange.getText();
//		System.out.println(temp);

		return temp.equals(csize);
	}

	public void jobTitle(String jtitle) throws InterruptedException {
		Thread.sleep(2000);
//		js.executeScript("arguments[0].value='"+jtitle+"';",jobTitle);
		jobTitle.sendKeys(jtitle); 
	}
	
	public boolean checkjtitle(String jtitle) {
		
		String temp=jobTitle.getAttribute("value");
		return temp.equals(jtitle);
	
	}
	
	public boolean getEMjtitle(String jtitle) {
		
		String temp=errormsgtitle.getText();
//		System.out.println(temp);

		return temp.equals(jtitle);
	}
	
	public void learners(String lcount) throws InterruptedException{
		Select learner=new Select(learners); 
		learner.selectByVisibleText(lcount);
	}
	
	public boolean checklearn(String learn) {
		
		String temp=learners.getAttribute("value");
		return temp.equals(learn);
	
	}
	
	public boolean getEMlearn(String learn) {
		
		String temp=errormsgnolearners.getText();
//		System.out.println(temp);

		return temp.equals(learn);
	}
	public void ClickCB() {
		agreementCB.click();
	}
	
	public boolean checkCB() {
		
		return agreementCB.isSelected();
	}
	
	public void country(String countryName) throws InterruptedException{
		Select country1=new Select(country); 
		country1.selectByVisibleText(countryName);
	}
	
	public boolean checkCountry(String country1) {
		
		String temp=country.getAttribute("value");
//		System.out.println(temp);
		return temp.equalsIgnoreCase(country1);
	
	}
	
	public boolean getEMcountry(String country){
		
		String temp=errormsgcountry.getText();
//		System.out.println(temp);

		return temp.equals(country);
	}
	
	public void state(String stateName) throws InterruptedException {
		Select state1=new Select(state);  
		state1.selectByVisibleText(stateName);
	}
	
	public boolean checkState(String state1) {
		
		String temp=state.getAttribute("value");
		return temp.equals(state1);
	
	}
	
	public boolean getEMstate(String state1) {
		
		String temp=errormsgstate.getText();
//		System.out.println(temp);

		return temp.equals(state1);
	}
	
	public void needs(String need) {
		Select needs1=new Select(needs);  
		needs1.selectByVisibleText(need); 
	}
	
	public boolean checkNeeds(String need) {
		
		String temp=needs.getAttribute("value");
//		System.out.println(temp);
		return temp.equals(need);
	
	}
	
	public boolean getEMneed(String need) {
		
		String temp=errormsgneed.getText();
//		System.out.println(temp);

		return temp.equals(need);
	}
	
	public void clickSubmit() {
		js.executeScript("arguments[0].click();",submit);
	}
	
	
	
	public String getEMemail() {
		return errormsgemail.getText(); 
	}
	public boolean getErrorMsg() throws IOException {

//			System.out.println("************The Error is************");
//			System.out.println(errormsg.getText()); 
			ExcelReadWrite.setCellData(filepath,"Sheet5",2,2,errormsg.getText());
			
			
			if(errormsg.getText().contains("Must be valid email."))
			{
				ExcelReadWrite.setCellData(filepath,"Sheet5",3,2,"message matched");
				return true;
			}
			else 
			{
				ExcelReadWrite.setCellData(filepath,"Sheet5",3,2,"message not matched");
				return false;
			}
	}
	
	public boolean CheckFormSubmit(String exp) {
		return exp.equals(successMsg.getText());
	}
	
}
