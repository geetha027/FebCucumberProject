package org.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 // Execute only failed scenarios present in rerun.txt file

@RunWith(Cucumber.class) 
@CucumberOptions(features = "@C:\\Users\\HP\\eclipse-workspace\\MavenCucumber\\Reports\\rerun.txt",
				     glue = "org.stepdefinition",
				     monochrome = true)

public class TestReRunnerClass {

}
