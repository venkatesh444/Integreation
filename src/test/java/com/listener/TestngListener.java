package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener {

	public void onFinish(ITestContext result) {
		
		
	}

	public void onStart(ITestContext result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed and Testcase details are "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and Testcase details are "+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test case start and Testcase details are "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success and Testcase details are "+result.getName());
		
	}
	
	
	
	

}
