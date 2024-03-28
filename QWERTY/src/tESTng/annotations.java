package tESTng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class annotations {

	@BeforeSuite
	 public void first()
	 {
		Reporter.log("before suit thiscase", true);
	 }
	
	@BeforeTest
	
	 public void second()
	 {
		Reporter.log("beforeTest thiscase", true);
	 }
	
	@BeforeClass
	 public void third()
	 {
		Reporter.log("beforeclass thiscase", true);
	 }
	
	@BeforeMethod
	 public void fourth()
	 {
		Reporter.log("beforemethod thiscase", true);
	 }
	
	@AfterMethod
	 public void fifth()
	 {
		Reporter.log("aftermethod thiscase", true);
	 }
	
	@AfterClass
	 public void sixth()
	 {
		Reporter.log("afterclass thiscase", true);
	 }
	
	@AfterTest
	 public void seventh()
	 {
		Reporter.log("afterTest thiscase", true);
	 }
	
	
	@AfterSuite
	 public void eight()
	 {
		Reporter.log("aftersuite thiscase", true);
	 }
	
	
	
}
