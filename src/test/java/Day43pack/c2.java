package Day43pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class c2 {
@Test(priority=2)
	void advsearch()
	{
		System.out.println("this is advsearch");
	}
	@AfterTest
	void logout()
	{
		System.out.println("this is logout");
	}
}
