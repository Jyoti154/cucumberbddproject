package Day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo {
	//before and after method with test
	@BeforeMethod
	public void login()
	{
		System.out.println("this is login");
	}
	@Test(priority=1)
	public void search()
	{
		System.out.println("this is search");
	}
	@Test(priority=2)
	public void advsearch()
	{
		System.out.println("this is advsearch");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("this is logout");
	}

}


