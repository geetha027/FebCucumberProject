package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
					glue = "org.stepdefinition", 
					monochrome = true,
					dryRun = false, strict = true,
					snippets = SnippetType.CAMELCASE,
					plugin = {"html:target",
							"junit:Reports\\junitrepo.xml",
							"json:Reports\\jsonrepo.json",
							"rerun:Reports\\rerun.txt"}) //save failed scenarios rerun.txt file

public class TestRunnerClass {

	//jvmReport-->readable format
	// pass jsonReportFilePath to JvmReport class
	
	@AfterClass
	public static void generateJVMReport() {
	
	// className. methodName() -->static method
		JvmReport.report("C:\\Users\\HP\\eclipse-workspace\\MavenCucumber\\Reports\\jsonrepo.json");

	}
}
