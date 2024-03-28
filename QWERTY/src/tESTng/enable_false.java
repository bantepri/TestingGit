package tESTng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class enable_false {
    @Test(enabled= false)
    public void launch()
    {
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://www.facebook.com");
    	
    }
    
    @Test
    public void dontlaunch()
    {
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://www.youtube.com");
    	driver.close();
    	
    }
}
