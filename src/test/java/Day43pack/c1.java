package Day43pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
@Test(priority=1)
	void login()
	{
	System.out.println("this is login");
		
	}
	
@BeforeTest
	void search()
	{
		System.out.println("this is search");
	}
}
