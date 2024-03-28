package tESTng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class priority_test {
@Test(priority = 1)
public void OpenBrowser()
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.close();
}

 @Test(priority = 2)
 public void enterUser()
 {
	 //driver.get("https://www.facebook.com");
 }
 
}
