package tESTng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class thread_size {
	 @Test(invocationCount= 3, threadPoolSize=3) // threadPoolSize will launch browser parallerly by using invocationCount which will launch 3 times
	 public void browser()
	 {
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 //driver.quit();
	 }

}
