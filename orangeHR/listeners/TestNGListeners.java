package listeners;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{
	public  void OnTestStart(ITestResult result)
	{
	System.out.println("******Test Started:"+result.getName());	
	}
	public  void OnTestSuccess(ITestResult result)
	{
		System.out.println("******Test Successfull:"+result.getName());	
	}
	public  void OnTestFailure(ITestResult result)
	{
		System.out.println("******Test Failed:"+result.getName());	
	}
	public void OnTestSkiped(ITestResult result)
	{
		System.out.println("******Test Skiped:"+result.getName());	
	}
//	public void OnTestFailedButwithinSuccessPercentage(ITestResult result)
//	{
//		
//	}
//	public void OnStart(ITestContext context)
//	{
//		
//	}
//	public void OnFinish(ITestContext context)
//	{
//	System.out.println("**** Test compledted:"+context.getName());	
//	}

}
