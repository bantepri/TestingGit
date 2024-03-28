package distributedparallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {
 @Test
 public void facebookOpen()
 {
 WebDriver driver= new ChromeDriver();
	driver.get("https://www,flipkart.com");
}
}