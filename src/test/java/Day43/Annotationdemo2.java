package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotationdemo2 {
//Before class and After class with test
	@BeforeClass
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
	@AfterClass
	public void logout()
	{
		System.out.println("this is logout");
	}
}
