package Day44;

import org.testng.annotations.Test;

public class paymenttest {
@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentinRupees()
	{
		System.out.println("payment in ruppes");
	}
@Test(priority=2,groups= {"sanity","regression","functional"})
void paymentindollers()
{
	System.out.println("payment in dollers");
}
}
