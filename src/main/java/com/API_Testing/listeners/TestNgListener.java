package com.API_Testing.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.net.UnknownHostException;

public class TestNgListener implements ITestListener {

    ExtentReports extent;
    public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
    private ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest("Test Name " + result.getTestClass().getName() + " -- " + result.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, MarkupHelper.createLabel("FAILED TEST CASE IS : " + result.getName(), ExtentColor.RED));
        test.log(Status.FAIL, "Failure Reason: " + result.getThrowable().getMessage());
    }

    @Override
    public void onStart(ITestContext context) {
        String fileName = ExtentReportManager.getReportNameWithTimeStamp();
        String filePath = System.getProperty("user.dir") + File.separator+"src"+File.separator+"test"+File.separator+"reports"+File.separator+ fileName;

        try {
            extent = ExtentReportManager.createExtentReport(filePath, "Rest API Testing Learning Project", "REST ASSURED FRAMEWORK", "Sumit Kumar Chaudhary ");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onFinish(ITestContext context) {
        if (extent != null)
            extent.flush();
    }

    // Other methods like onTestSuccess, onTestSkipped can be implemented similarly
}
