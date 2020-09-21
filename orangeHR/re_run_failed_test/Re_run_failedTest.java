package re_run_failed_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Re_run_failedTest {
	
	@Test
	public void test1()
	{
		System.out.println("i am inside test1");
	}
	@Test
	public void test2()
	{
		System.out.println("i am inside test2");
		//int i=1/0;
	}
	@Test(retryAnalyzer = re_run_failed_test.RetryAnalyzer.class)
	public void test3()
	{
		System.out.println("i am inside test3");
		Assert.assertTrue(0>1);
	}

}
