package autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {
	public static void main(String[] args) {
		test();
	}
	public static void test() {
		System.setProperty("webdriver.chrome.driver","D:\\pavanmulejava\\orangeHR\\Drivers\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://tinyupload.com/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
	
//		Runtime.getRuntime().exec("D:\\pava\\file122.exe");
//		Thread.sleep(3000);
//		driver.close();
	}

}
