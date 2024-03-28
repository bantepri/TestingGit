package tESTng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocationcount {
@Test(invocationCount = 3)
public void multipletimelaunch()
{
	WebDriver driver=new ChromeDriver();
	driver.quit();
	
}
	
}
