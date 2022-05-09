package com.properties.testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.properties.ExtentManager.ExtentManager;
import com.properties.base.BaseClass;

public class TestClassProp extends BaseClass{
	public static WebDriver driver;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extreports;
	public static ExtentTest createTest;
	@Test
	public void logotest() {
		createTest = extreports.createTest("orange HRM logo test");
		WebElement image= driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/img"));
		Assert.assertTrue(image.isDisplayed());
	}

	@Test
	public void loginTest() {
		createTest = extreports.createTest("orange HRM login test");
		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"),Keys.ENTER);
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"),Keys.ENTER);
		driver.findElement(By.id("btnLogin")).click();
		
		String currentUrl = driver.getCurrentUrl();
		String expectedurl="https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
		Assert.assertEquals(currentUrl, expectedurl);
	}
	
	@Test
	public void samplefailTC() {
		createTest=extreports.createTest("Sample failed SS");

	}
	
	
}
