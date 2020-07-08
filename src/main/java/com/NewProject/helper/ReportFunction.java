package com.NewProject.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportFunction 
{
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void extentReportingMethod()
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String repName="Test-Report-"+timeStamp+".html";
		reporter= new ExtentHtmlReporter(ResourcesHelper.getPath("src/main/resources/reports/"+repName));
		extent=new ExtentReports();
		extent.attachReporter(reporter);
	}

}
