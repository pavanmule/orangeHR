package ignoretest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnore {

	@Test
	public void test1()
	{
		System.out.println("i am inside test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("i am inside test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("i am inside test 3");
	}
}
