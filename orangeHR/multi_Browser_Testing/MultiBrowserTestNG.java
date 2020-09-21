package multi_Browser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

;

public class MultiBrowserTestNG {
	WebDriver driver=null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("browser name is:"+browserName);
		System.out.println("Thread Id: "+Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","D:\\pavanmulejava\\orangeHR\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}	
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\pavanmulejava\\orangeHR\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver.driver","D:\\pavanmulejava\\orangeHR\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://google.com");
		Thread.sleep(4000);		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Tset is comleted");
	}

}
