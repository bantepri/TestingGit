package tESTng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class imp_test extends annotations {

	@Test
	public void one()
	{
		Reporter.log("Test anotation", true);
	}
}
