package priorityDemo;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(priority=1)
	public void test1()
	{
	System.out.println("I am inside Test 1");	
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("I am inside Test 2");
	}
	@Test(priority=3)
	public void test3()
	{
		System.out.println("I am inside Test 3");
	}

}
