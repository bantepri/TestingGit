package softAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import tESTng.timeout;

public class asserts_soft {
@Test
	public void demo()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		SoftAssert a=new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println(title);
a.assertEquals("Demo Web Shop", title, "It is not on demo page");		
	driver.findElement(By.linkText("Register")).click();
	
	String url=driver.getCurrentUrl();
System.out.print(url);
	a.assertEquals(url, url, "user is not on registered page");
	driver.findElement(By.id("gender-female"));
a.assertFalse(true, "it is  clicked");
	//assertTrue(true, "it is not clicked");
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
