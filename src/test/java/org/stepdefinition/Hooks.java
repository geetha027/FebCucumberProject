package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{

	//instead of @Given and @Then --> precondition() & postCondition()
	//create 3--> @Before(Incremental Order)  and 2--> @After(Decremental Order)
	//Tagged Hooks
	
	//@Before(Incremental Order)
	
	@Before(order=10) 
	public void preCondition2() {
		
		browserLaunch();
		System.out.println("Browser Launch...");
	}
	
	@Before(order=25, value="@Feature2")   
	public void preCondition1() {
		
		maxWindow();
		System.out.println("Max Window...");
	}
	
	@Before(order=30, value="@Feature1")    
	public void preCondition3() {
		
		System.out.println("Precondition 3");
	}
	
	//@After(Decremental Order)
	
	@After(order=15)    
	public void postCondition2() {
		
		closeBrowser();
		System.out.println("Close Browser...");
	}
	
	@After(order=20)    
	public void postCondition1(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] takenScreenshot = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(takenScreenshot, "image/png");
			System.out.println("Failed Scenario Name : "+ s.getName());
			System.out.println("Failed Scenario Id : "+ s.getId());
			System.out.println("Failed Scenario uri : "+ s.getUri());
			System.out.println("Failed Scenario TagNames : "+ s.getSourceTagNames());
			System.out.println("Failed Scenario LineNumber : "+ s.getLines());
			System.out.println("Failed Scenario Class : "+ s.getClass());
			System.out.println("Failed Scenario Status : "+ s.getStatus());
			
		}
	}
}
