package orangeHR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		 // start reporters
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extent.html");
		
		 // create ExtentReports and attach reporter(s)
       ExtentReports extent = new ExtentReports();
      extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
      ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\pavanmulejava\\orangeHR\\Drivers\\chromedriver.exe");
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		test.log(Status.INFO,"Starting Test");
		//enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		test.pass("navigate to OrangeHRM page");
		driver.manage().window().maximize();
		//To get the title of page
		String title=driver.getTitle();
		System.out.println(title);
		//To get the url of current webpage
		String Currenturl=driver.getCurrentUrl();
		System.out.println(Currenturl);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		test.pass("username");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		test.pass("password");
		driver.findElement(By.id("btnLogin")).click();
		test.pass("Login succesful");
		test.info("completed");
		
		
		
//		
//		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
//		Thread.sleep(9000);
//		driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]\r\n" + 
//				"")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("firstName")).sendKeys("pavan");
//		Thread.sleep(5000);
//		driver.findElement(By.id("lastName")).sendKeys("mule");
//		driver.findElement(By.id("chkLogin")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("user_name")).sendKeys("mulepavi");
//		Thread.sleep(2000);
//		driver.findElement(By.id("user_password")).sendKeys("mule12345");
//		Thread.sleep(2000);
//		driver.findElement(By.id("re_password")).sendKeys("mule12345");
//		Thread.sleep(2000);
//		driver.findElement(By.id("btnSave")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@value='Edit']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
//		Thread.sleep(2000);
//		//driver.findElement(By.id("personal_cmbMarital"));
//		Select selectelement=new Select(driver.findElement(By.id("personal_cmbMarital")));
//		selectelement.selectByVisibleText("Single");
//		Thread.sleep(2000);
//		Select selectcountry=new Select(driver.findElement(By.id("personal_cmbNation")));
//		selectcountry.selectByVisibleText("Indian");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("div.box.pimPane:nth-child(1) div.personalDetails:nth-child(2) div.inner form:nth-child(1) fieldset:nth-child(3) ol:nth-child(3) li:nth-child(4) > img.ui-datepicker-trigger:nth-child(3)")).click();
//		//dateBox.sendKeys("19900601");
//		Select selmonth=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
//		selmonth.selectByVisibleText("Jun");
//		Select selyear=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
//		selyear.selectByVisibleText("1990");
//		Thread.sleep(9000);
//		driver.findElement(By.xpath("//tr[1]//td[5]//a[1]")).click();
//		Thread.sleep(9000);
//		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
//		Thread.sleep(9000);
//		driver.findElement(By.linkText("Contact Details")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("contact_street1")).sendKeys("sai green house");
//		Thread.sleep(5000);
//		driver.findElement(By.id("contact_street2")).sendKeys("sridi sai layout");
//		Thread.sleep(5000);
//		driver.findElement(By.id("contact_city")).sendKeys("Bangalore");
//		Thread.sleep(5000);
//		driver.findElement(By.id("contact_emp_zipcode")).sendKeys("560043");
//		Thread.sleep(9000);
//		Select selc=new Select(driver.findElement(By.id("contact_country")));
//		Thread.sleep(5000);
//		selc.selectByVisibleText("India");
//		Thread.sleep(5000);
//		driver.findElement(By.id("contact_emp_mobile")).sendKeys("9164869847");
//		Thread.sleep(5000);
//		driver.findElement(By.id("contact_emp_work_email")).sendKeys("pavan.mule34@gmail.com");
//		Thread.sleep(5000);
//		driver.findElement(By.id("btnSave")).click();
		
		
		  // calling flush writes everything to the log file
		
		extent.flush();


	}

}
