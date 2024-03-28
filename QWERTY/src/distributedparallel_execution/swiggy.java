package distributedparallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class swiggy {
@Test
public void swiggy_open()
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.swiggy.com");
}
}
