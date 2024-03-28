package learningpom;

import org.testng.annotations.Test;

public class TestScript01  extends baseclass{
@Test
public void text() throws InterruptedException
{
	Registerpom rr= new Registerpom(driver);
	rr.getregister().click();
	Thread.sleep(2000);
}
}
