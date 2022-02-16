package org.jvm.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void report(String jsonReportFilePath) {
		
		// 1. Mention the target folder location - File
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenCucumber\\src\\test\\resources");
		
		// 2. Add details to the report using Configuration class
		Configuration c = new Configuration(f, "Facebook_Login & Demoqa_Registration");
		
		c.addClassifications("Platform Name : ", "Windows");
		c.addClassifications("Platform Version", "10");
		c.addClassifications("Browser Name : ", "Chrome");
		c.addClassifications("Browser Version", "96.0.");
		c.addClassifications("Sprint Num : ", "2");
		
		// 3. Add json file path into List<String>
		List<String> li = new ArrayList<String>();
		li.add(jsonReportFilePath);
		
		// 4. Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(li, c);
		
		// using created object call generateReports() method
		r.generateReports();

	}

}
