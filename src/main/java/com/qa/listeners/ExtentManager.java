package com.qa.listeners;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentManager implements  IReporter{
    private ExtentReports extent;
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        extent = new ExtentReports();
        for (ISuite suite : suites) {

            Map<String, ISuiteResult> result = suite.getResults();
            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();
                buildTestNodes(context.getPassedTests(), String.valueOf(LogStatus.PASS));
                buildTestNodes(context.getFailedTests(), String.valueOf(LogStatus.FAIL));
                buildTestNodes(context.getSkippedTests(), String.valueOf(LogStatus.SKIP));
            }
        }
        extent.flush();
    }

    private void buildTestNodes(IResultMap tests, String status) {
        ExtentTest test;
        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                test = extent.createTest(result.getMethod().getMethodName());
            /*test.getTest(). = getTime(result.getStartMillis());
            test.getTest().endedTime = getTime(result.getEndMillis());*/
                for (String group : result.getMethod().getGroups())
                    test.assignCategory(group);
                String message = "Test " + status.toString().toLowerCase() + "ed";
                if (result.getThrowable() != null)
                    message = result.getThrowable().getMessage();
                test.log(Status.valueOf(status), message);
                extent.setTestRunnerOutput((List<String>) test);
            }
        }
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

}
