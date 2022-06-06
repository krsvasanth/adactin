package com.base;

import java.io.File;
import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class CucumberJvmReport {

	public static void generateReport(String json) {
		File f = new File("C:\\Users\\VASANTH\\eclipse-workspace\\CucumberReports\\src\\test\\resources\\Report");
		Configuration config=new Configuration(f, "CucumberReports");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Platform", "Windows");
		config.addClassifications("Build", "2.2.2");
		
		List<String> li=new LinkedList<String>();
		li.add(json);
		
		ReportBuilder ref = new ReportBuilder(li, config);
		ref.generateReports();
		
	}
}
