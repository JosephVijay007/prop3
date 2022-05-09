package com.properties.ExtentManager;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.properties.base.BaseClass;

public class ExtentManager extends BaseClass{

	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extreports;
	public static ExtentTest createTest;
	public static WebDriver driver;
	
	public static void setExtent() {
		// TODO Auto-generated method stub
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"//Test-output//ExtentReport//PropertiesDemo.html");
		htmlreporter.config().setDocumentTitle("Properties Report");
		htmlreporter.config().setReportName("Properties Report");
		htmlreporter.config().setTheme(Theme.DARK);
	}
	
	public static void endExtent() {
		// TODO Auto-generated method stub
		extreports.flush();
	}
	
}
