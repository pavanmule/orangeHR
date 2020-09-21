package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListeners.class)
public class TestNGListenerDemo 
{
@Test(priority=1)
	public  void test1() {
		System.out.println("I am Inside test 1");
		
	}
@Test(priority=2)
	public  void test2() {
		System.out.println("I am Inside test 2");
	}
@Test(priority=3)
	public  void test3() {
		System.out.println("I am Inside test 3");
	}

}
