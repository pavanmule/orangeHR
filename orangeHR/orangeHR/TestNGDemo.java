package orangeHR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNGDemo {
	WebDriver driver=null;
	public static String Browsername=null;
	@BeforeTest
	public void setUp()
	{
		PropertiesFile.getProperties();
		if(Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\pavanmulejava\\orangeHR\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\pavanmulejava\\orangeHR\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	@Test
	public void googleSearche()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("a");
		//driver.findElement(By.id("lga")).sendKeys(Keys.RETURN);


	}
	@Test
	public void googleSearche3()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("a");
		//driver.findElement(By.id("lga")).sendKeys(Keys.RETURN);


	}
		@AfterTest
		public void afterTest()
		{
			driver.close();
			PropertiesFile.setProperties();
			
		}

}
