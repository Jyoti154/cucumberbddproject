package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertiondemo {
	@Test
void testtitle()
{
	String ext_title="jyoti";
	String act_title="jyoti";
	Assert.assertEquals(ext_title, act_title);
}
}
