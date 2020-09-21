package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataprovider {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\pavanmulejava\\orangeHR\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	}
@Test(dataProvider = "test1data")
	public void test1(String userName,String Password) throws InterruptedException
	
	{
	System.out.println(userName+"  "+Password);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.id("txtUsername")).sendKeys(userName);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	Thread.sleep(2000);
	
	
	}
	
	@DataProvider(name="test1data")
	public Object[][] getData() {
		String excelPath="D:\\pavanmulejava\\orangeHR\\excel\\data.xlsx";
		Object data[][]=testDta(excelPath, "Sheet1");
		return data;
		
	}
	public  Object[][] testDta(String excelPath,String sheetName)
	{
		ExcelUtil excel=new ExcelUtil(excelPath, sheetName);
		int rowCount=excel.getRowCount();
		int colCount=excel.getColCount();
		Object data[][]=new Object[rowCount-1][colCount];
		for(int i=1; i<rowCount;i++) {
			for(int j=0;j<colCount;j++)
			{
				String CellData=excel.getCellDataString(i, j);
				//System.out.print(CellData+"  ");
				data[i-1][j]=CellData;

			}
			//System.out.println();
		}
		return data;

	}

}
