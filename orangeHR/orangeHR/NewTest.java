package orangeHR;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {
	String driverpath="D:\\\\pavanmulejava\\\\orangeHR\\\\Drivers\\\\chromedriver.exe";
	 public WebDriver driver;
	
	 @BeforeTest
	public void lunchBrowser()
	
	{
		 System.setProperty("webdriver.chrome.driver",driverpath);
		driver=new ChromeDriver();
		//Enter the url
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();
	}	
  @Test(priority=0)
 public void login() throws InterruptedException {
	  //To get title
	 String title=driver.getTitle();
	 System.out.println(title);
	 //To get Current URL
	 String currenturl=driver.getCurrentUrl();
	 System.out.println(currenturl);
	 //Login credential
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]\r\n" + 
				"")).click();
		//Thread.sleep(5000);
  }
		@Test(priority=1)
		public void AddEmployee() throws InterruptedException
		{
			
			driver.findElement(By.id("firstName")).sendKeys("pavan");
			Thread.sleep(2000);
			driver.findElement(By.id("lastName")).sendKeys("mule");
			driver.findElement(By.id("chkLogin")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("user_name")).sendKeys("mulepavi");
			Thread.sleep(2000);
			driver.findElement(By.id("user_password")).sendKeys("mule12345");
			Thread.sleep(2000);
			driver.findElement(By.id("re_password")).sendKeys("mule12345");
			Thread.sleep(2000);
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Edit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
			Thread.sleep(2000);
			
			Select selectelement=new Select(driver.findElement(By.id("personal_cmbMarital")));
			selectelement.selectByVisibleText("Single");
			Thread.sleep(2000);
			Select selectcountry=new Select(driver.findElement(By.id("personal_cmbNation")));
			selectcountry.selectByVisibleText("Indian");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("div.box.pimPane:nth-child(1) div.personalDetails:nth-child(2) div.inner form:nth-child(1) fieldset:nth-child(3) ol:nth-child(3) li:nth-child(4) > img.ui-datepicker-trigger:nth-child(3)")).click();
			
			Select selmonth=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
			selmonth.selectByVisibleText("Jun");
			Select selyear=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
			selyear.selectByVisibleText("1990");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[1]//td[5]//a[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		}
		@Test(priority=2)
		public void contactDetails() throws InterruptedException
		{
			//Thread.sleep(2000);
			driver.findElement(By.linkText("Contact Details")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("contact_street1")).sendKeys("sai green house");
			Thread.sleep(2000);
			driver.findElement(By.id("contact_street2")).sendKeys("sridi sai layout");
			Thread.sleep(2000);
			driver.findElement(By.id("contact_city")).sendKeys("Bangalore");
			Thread.sleep(2000);
			driver.findElement(By.id("contact_emp_zipcode")).sendKeys("560043");
			Thread.sleep(2000);
			Select selc=new Select(driver.findElement(By.id("contact_country")));
			Thread.sleep(2000);
			selc.selectByVisibleText("India");
			Thread.sleep(2000);
			driver.findElement(By.id("contact_emp_mobile")).sendKeys("9164869847");
			Thread.sleep(2000);
			driver.findElement(By.id("contact_emp_work_email")).sendKeys("pavan.mule34@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("btnSave")).click();
			//Thread.sleep(5000);

		}
	@Test(priority=3)
	public void EmergencyContact() throws InterruptedException
	{
		//Click on emergencycontact
		driver.findElement(By.linkText("Emergency Contacts")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnAddContact']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("emgcontacts_name")).sendKeys("puneeth");
		Thread.sleep(1000);
		driver.findElement(By.name("emgcontacts[relationship]")).sendKeys("brother");
		Thread.sleep(1000);
		driver.findElement(By.name("emgcontacts[mobilePhone]")).sendKeys("9964623909");
		Thread.sleep(1000);
		driver.findElement(By.id("btnSaveEContact")).click();
	}
	@Test(priority=4)
	public void Dependents() throws InterruptedException
	{
		//Add Dependents
		driver.findElement(By.linkText("Dependents")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnAddDependent")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("dependent_name")).sendKeys("umakant");
		Thread.sleep(1000);
		Select selRelation=new Select(driver.findElement(By.id("dependent_relationshipType")));
		selRelation.selectByVisibleText("Other");
		driver.findElement(By.id("dependent_relationship")).sendKeys("Father");
		//driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.id("btnSaveDependent")).click();
		//Thread.sleep(9000);
		
	}
	@Test(priority=5)
	public void immigration() throws InterruptedException
	{
		driver.findElement(By.linkText("Immigration")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();//input[@id='btnAdd']
		Thread.sleep(1000);
		driver.findElement(By.id("immigration_number")).sendKeys("1234567");
		Thread.sleep(1000);
		driver.findElement(By.id("btnSave")).click();
	}
	@Test(priority=6)
public void job() throws InterruptedException
{
		driver.findElement(By.linkText("Job")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(1000);
		Select seljob=new Select(driver.findElement(By.id("job_job_title")));
		Thread.sleep(1000);
		seljob.selectByValue("7");
		Thread.sleep(1000);
		Select selemp=new Select(driver.findElement(By.id("job_emp_status")));
		Thread.sleep(1000);
		selemp.selectByValue("3");
		Select seljobC=new Select(driver.findElement(By.id("job_eeo_category")));
		seljobC.selectByValue("3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[5]//img[1]")).click();
		Select selm=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		selm.selectByVisibleText("Dec");
		Select sely=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		sely.selectByVisibleText("2018");
		driver.findElement(By.xpath("//a[contains(text(),'27')]")).click();
		Select selsub=new Select(driver.findElement(By.id("job_sub_unit")));
		selsub.selectByValue("6");
		Select selloc=new Select(driver.findElement(By.id("job_location")));
		selloc.selectByValue("3");
		driver.findElement(By.id("btnSave")).click();
		//Thread.sleep(9000);
		
}
	@Test(priority=7)
	public void salary() throws InterruptedException
	{
		driver.findElement(By.linkText("Salary")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("addSalary")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("salary_salary_component")).sendKeys("testing team");
		Thread.sleep(1000);
		Select sal=new Select(driver.findElement(By.xpath("//select[@id='salary_payperiod_code']")));
		Thread.sleep(1000);
		sal.selectByVisibleText("Monthly");
		Thread.sleep(1000);
		Select curr=new Select(driver.findElement(By.xpath("//select[@id='salary_currency_id']")));
		Thread.sleep(1000);
		curr.selectByValue("INR");
		Thread.sleep(1000);
		driver.findElement(By.id("salary_basic_salary")).sendKeys("50000");
		Thread.sleep(1000);
		driver.findElement(By.id("salary_set_direct_debit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("directdeposit_account")).sendKeys("04202010135966");
		Thread.sleep(1000);
		Select acc=new Select(driver.findElement(By.id("directdeposit_account_type")));
		Thread.sleep(1000);
		acc.selectByVisibleText("Savings");
		driver.findElement(By.xpath("//input[@id='directdeposit_routing_num']")).sendKeys("12345");
		Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='directdeposit_amount']")).sendKeys("50000");
	Thread.sleep(1000);
	driver.findElement(By.id("btnSalarySave")).click();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	
	}
	
	  
		
	  
  
  @AfterTest
  public void logout()
  {
	  driver.close();
  }
}
