package Assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(testingimplementation.class)
public class hardAsserts {
	WebDriver driver= new ChromeDriver();
@Test
public void DemoPage()
{
	
	driver.get("https://demowebshop.tricentis.com");
	
assertEquals(driver.getTitle(),"Demo Web Shop", "User is navigated to write website");
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	String registertitle= driver.getCurrentUrl();
	assertEquals(registertitle,"https://demowebshop.tricentis.com/register","User is on registred page");
	
	WebElement gender=driver.findElement(By.id("gender-male"));
			gender.click();
assertTrue(gender.isSelected(), "It is not clicked");

WebElement name=driver.findElement(By.id("FirstName"));
name.sendKeys("Alinaa");
assertEquals(name.getAttribute("value"), "Alinaaa", "user give wrong name nam");


WebElement lastname=driver.findElement(By.name("LastName"));
lastname.sendKeys("Joseph");
assertEquals(lastname.getAttribute("value"), "Joseph", "User passed wrong lastname");

driver.findElement(By.id("Email")).sendKeys("cxvg12345@gmail.com");
driver.findElement(By.id("Password")).sendKeys("Abc@123");

driver.findElement(By.id("ConfirmPassword")).sendKeys("Abc@123");

driver.findElement(By.name("register-button")).click();
driver.findElement(By.xpath("//input[@value='Continue']")).click();



}}
