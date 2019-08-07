package com.Features.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//We Define in Class Level and Testng.xml in Suite Level
/*<listeners> Testng.xml in Suite Level
<listener class-name="Selenium.TestNGListener"></listener>
</listeners>*/

//@Listeners(Selenium.TestNGListener.class)
//public class ListenersProgram - Class Level
public class TestNGListener implements ITestListener
{
	public void onTestStart(ITestResult result) 
	{
		System.out.println("TestCase Started and Details are : " +result.getName());
	}

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("TestCase Success and Details are : " +result.getName());
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("TestCase Failed and Details are : " +result.getName());
	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("TestCase Skipped and Details are : " +result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	
	}

	public void onStart(ITestContext context)
	{

	}

	public void onFinish(ITestContext context)
	{

	}
}
				