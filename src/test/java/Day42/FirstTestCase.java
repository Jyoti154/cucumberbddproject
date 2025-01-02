package Day42;

import org.testng.annotations.Test;

public class FirstTestCase {
   @Test(priority=1)
	void openapp()
	{
		System.out.println("this is open app");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("this is login");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("this is logout");
	}
}
