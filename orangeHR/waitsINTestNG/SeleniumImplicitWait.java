package waitsINTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumImplicitWait {
	public static void main(String[] args) {
		seleniumwaits();
	}
	public static void seleniumwaits()
	{
		System.setProperty("webdriver.chrome.driver","D:\\pavanmulejava\\orangeHR\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		WebDriverWait wait1=new WebDriverWait(driver,20);
		WebElement element1= wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.close();
		driver.quit();
	}

}
