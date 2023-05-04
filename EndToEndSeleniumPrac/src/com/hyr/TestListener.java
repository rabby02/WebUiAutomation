package com.hyr;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
@Listeners(Listenerr.class)


public class TestListener {
	
	
	@Test
	public void testMethod1()
	{
		System.out.println("I m inside the function");
		AssertJUnit.assertTrue(false);
		
		
		
	}
	
	@Test(timeOut=1000)
	public void testMethod2() throws Exception
	
	{
		Thread.sleep(2000);
		System.out.println("Im outside the methoddd");
	}
	@Test(dependsOnMethods="testMethod2")
	public void testMethod3()
	{
		
		System.out.println("It depends on testMethod2");
		
	}
	
	
	
}
