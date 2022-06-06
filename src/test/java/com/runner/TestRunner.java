package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.CucumberJvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\",
glue="com.stepdefinition",
plugin= {"pretty","json:C:\\Users\\VASANTH\\eclipse-workspace\\CucumberReports\\src\\test\\resources\\Report\\report.json"},dryRun=false)
public class TestRunner {
@AfterClass
public static void report() {
	CucumberJvmReport.generateReport("C:\\\\Users\\\\VASANTH\\\\eclipse-workspace\\\\CucumberReports\\\\src\\\\test\\\\resources\\\\Report\\\\report.json");
	
}
}