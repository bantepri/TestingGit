package allAnnotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseclass {
	WebDriver driver;

@BeforeSuite
public void Before()
{
	Reporter.log("database method beforesuite", true);
}

@BeforeTest
public void Befortest()
{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
}

@BeforeClass
public void openBroswer()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com");

}
 @BeforeMethod
 public void login()
 {
	 Reporter.log("Before method");
 }
 
@AfterMethod
public void beforeclass()
{
	
	driver.close();
	
	
}


}
