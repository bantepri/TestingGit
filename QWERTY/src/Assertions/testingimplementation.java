package Assertions;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class testingimplementation implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		Reporter.log("Test case exucution isstarted",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Test case exucution is failed",true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Test case exucution is successful",true);
	}
}



