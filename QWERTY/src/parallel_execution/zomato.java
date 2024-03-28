package parallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class zomato {

	@Test
	public void zomato_open()
	{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com");
	driver.quit();
}
}