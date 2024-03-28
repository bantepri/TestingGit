package Group_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class zomato {
   @Test
   public void Laumch_zomato()
   {
	 WebDriver driver=new ChromeDriver();  
	 driver.manage().window().maximize();
	 driver.get("https://www.zomato.com");
	 driver.quit();
   }
}
