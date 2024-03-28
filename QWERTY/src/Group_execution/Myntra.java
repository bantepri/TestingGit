package Group_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {
@Test(groups= "e-commerce")
public void launch_myntra()
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com");
}
}
