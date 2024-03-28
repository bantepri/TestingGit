package Batch_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nykaa_Browser {
    @Test
    public void Launch_Nykaa()
    {
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.nykaa.com/");
    	driver.quit();
    }
}
