package com.API_Testing.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentReportManager {

    public static ExtentReports createExtentReport(String filePath,String reportName,String documentTitle,String Author) throws UnknownHostException {
        ExtentSparkReporter sparkReports = new ExtentSparkReporter(filePath);
        sparkReports.config().setReportName(reportName);
        sparkReports.config().setDocumentTitle(documentTitle);
        sparkReports.config().setTheme(Theme.DARK);

        ExtentReports reports = new ExtentReports();
        reports.attachReporter(sparkReports);
        reports.setSystemInfo("Machine:", InetAddress.getLocalHost().getHostName());
        reports.setSystemInfo("OS", System.getProperty("os.name"));
        reports.setSystemInfo("Author", Author);
        return reports;
    }


    public static String getReportNameWithTimeStamp() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedTime = dateTimeFormatter.format(localDateTime);
        return "TestReport" + formattedTime + ".html";
    }

    //test case detail logging
    public static void logPassDetails(String log) {
        TestNgListener.extentTest.get().pass(MarkupHelper.createLabel(log, ExtentColor.GREEN));
    }
    public static void logFailureDetails(String log) {
        TestNgListener.extentTest.get().fail(MarkupHelper.createLabel(log, ExtentColor.RED));
    }
    public static void logExceptionDetails(String log) {
        TestNgListener.extentTest.get().fail(log);
    }
    public static void logInfoDetails(String log) {
        TestNgListener.extentTest.get().info(MarkupHelper.createLabel(log, ExtentColor.GREY));
    }

    public static void logJson(String json) {
        TestNgListener.extentTest.get().info(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));
    }


}
