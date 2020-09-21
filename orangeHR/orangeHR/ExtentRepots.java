package orangeHR;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentRepots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		 ExtentReports extent=new ExtentReports();
		 extent.attachReporter(htmlReporter);

	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test1 = extent.createTest("Google Search Test one","");
	        System.setProperty("webdriver.chrome.driver","D:\\pavanmulejava\\orangeHR\\Drivers\\chromedriver.exe");
	        ChromeDriver driver=new ChromeDriver();
	        test1.log(Status.INFO,"Starting test case");
	        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	        
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        test1.pass("Entered text in searchbox");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        test1.pass("Entered text in searchbox");
	        driver.findElement(By.id("btnLogin")).click();
	        test1.pass("login sucessful");
	        
	        
	        
	        driver.close();
	        driver.quit();
	        test1.pass("closed the browser");
	        
	        test1.info("Test completed");

	        // calling flush writes everything to the log file
	        extent.flush();
	}

}
