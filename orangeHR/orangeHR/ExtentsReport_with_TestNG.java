package orangeHR;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentsReport_with_TestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ChromeDriver driver;

	@BeforeSuite
	public void setUp()
	{
		// start reporters
		htmlReporter = new ExtentHtmlReporter("extent.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	
		System.setProperty("webdriver.chrome.driver","D:\\pavanmulejava\\orangeHR\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void test1() 
	
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("MyFirstTest1", "Sample description");

		test1.log(Status.INFO,"Starting test case");
		
	

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		test1.pass("Entered text in searchbox");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		test1.pass("Entered text in searchbox");
		driver.findElement(By.id("btnLogin")).click();
		test1.pass("login sucessful");

	}
	@Test
	public void test2() throws IOException
	{
		ExtentTest test1 = extent.createTest("MyFirstTest", "Sample description");

		 // log(Status, details)
        test1.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test1.info("This step shows usage of info(details)");
        
        // log with snapshot
        test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test1.addScreenCaptureFromPath("screenshot.png");
	}
	
//	@AfterTest
//	public void afterTest()
//	{
//		 driver.close();
//	       //driver.quit();
//	     System.out.println("test completed");
//
//	}
	@AfterSuite
	public void tearDown()
	{

		// calling flush writes everything to the log file
		extent.flush();

	}

}
