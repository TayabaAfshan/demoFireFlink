package com.vtiger.ObjectRepo;

import org.testng.ITestListener;
import org.testng.ITestResult;

import genericUtility.BaseUtility;
import genericUtility.WebDriverUtility;

public class ListenerImp implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailure(result);
		String methodName =result.getMethod().getMethodName();
		try {
			WebDriverUtility.getScreenShot(BaseUtility.sdriver, methodName);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
