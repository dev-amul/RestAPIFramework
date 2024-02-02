package com.API_Testing.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class TestNgListener implements ITestListener {

    ExtentReports extent;
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest("Test Name " + result.getTestClass().getName() + " -- " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, MarkupHelper.createLabel("FAILED TEST CASE IS : " + result.getName(), ExtentColor.RED));
        test.log(Status.FAIL, "Failure Reason: " + result.getThrowable().getMessage());
    }

    @Override
    public void onStart(ITestContext context) {
        String fileName = "extent-report.html";
        String filePath = System.getProperty("user.dir") + File.separator + "test-output" + File.separator + fileName;
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filePath);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @Override
    public void onFinish(ITestContext context) {
        if (extent != null)
            extent.flush();
    }

    // Other methods like onTestSuccess, onTestSkipped can be implemented similarly
}
