package dependencies;

import org.testng.annotations.Test;

public class TestNGDependency {
	@Test(dependsOnGroups = {"sanity1.*"})
	public void test1()
	{
		System.out.println("I am in side test1");
	}
	@Test(groups = {"sanity1"})
public void test2()
	{
		System.out.println("I am in side test2");
	}
	@Test(groups = {"sanity2"})
	public void test3()
	{
		System.out.println("I am in side test3");
	}

}
