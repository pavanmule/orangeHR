package fluentWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWait {
	public FluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		test();
	}
	
	@SuppressWarnings("unchecked")
	public static void test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\pavanmulejava\\orangeHR\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abc");
		//Thread.sleep(4000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.linkText("After Breast Cancer Diagnosis: Home")).click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait wait= ( (Object) new  FluentWait (driver)
		       .withTimeout(30, TimeUnit.SECONDS))
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   Object element= wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 WebElement linkElement=driver.findElement(By.linkText("After Breast Cancer Diagnosis: Home"));
		    	 
		    	 if(linkElement.isEnabled())
		    	 {
		    		 System.out.println("Element Found");
		    	 }
		       return linkElement;
		     }
		   });
		
		
		Thread.sleep(4000);
		
		driver.close();
		driver.quit();
	

}

	private Object withTimeout(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		return null;
	}
}

