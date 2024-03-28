package learningpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class baseclass {
	WebDriver driver;
	@BeforeTest
	public void url()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void openBroswer()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
	
	
}
}
