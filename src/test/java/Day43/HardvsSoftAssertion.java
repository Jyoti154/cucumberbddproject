package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertion {
	@Test
	void test_hardassertion()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		Assert.assertEquals(1, 2);//fail
		System.out.println("testing...");
		System.out.println("testing...");
	}
	@Test
void test()
{
		System.out.println("test...");
		System.out.println("test...");
		Assert.assertEquals(1, 1);//pass
		System.out.println("test...");
		System.out.println("test...");
	
}
	@Test
	void softassertion()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 1);
		
		System.out.println("testing...");
		System.out.println("testing...");
		sa.assertAll();
	}
}
