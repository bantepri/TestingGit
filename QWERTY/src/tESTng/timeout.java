package tESTng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeout {
@Test(timeOut=30000)
	
	public void launch()
    {
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://www.facebook.com");
    	driver.quit();
    	
    }
}
