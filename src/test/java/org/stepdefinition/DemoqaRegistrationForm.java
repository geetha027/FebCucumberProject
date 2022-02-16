package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.DemoqaPOJO;

import cucumber.api.java.en.When;

public class DemoqaRegistrationForm extends BaseClass{

	DemoqaPOJO dp;
	
	//preCondition(), postCondition() -->Hooks.java
	//Read data from excel sheet
	//Assert--> get Failed (manually)
	
	@When("To pass the url of demoqa application")
	public void toPassTheUrlOfDemoqaApplication() {
		
	    urlLaunch("https://demoqa.com/automation-practice-form");
	}

	@When("To pass invalid firstname into firstname field")
	public void toPassInvalidFirstnameIntoFirstnameField() throws IOException {
	    
		dp = new DemoqaPOJO();
		passText(dp.getFirstName(), excelRead("Demoqa", "Registration_Details", 0, 0));	
	}

	@When("To pass invalid lastname into lastname field")
	public void toPassInvalidLastnameIntoLastnameField() throws IOException {
	    
		dp = new DemoqaPOJO();
		passText(dp.getLastName(), excelRead("Demoqa", "Registration_Details", 0, 1));
	}

	@When("To pass invalid email into emailfield")
	public void toPassInvalidEmailIntoEmailfield() throws IOException {
	    
		dp = new DemoqaPOJO();
		Assert.assertTrue(false);  //Assert failed
		passText(dp.getUserEmail(), excelRead("Demoqa", "Registration_Details", 1, 0));
	}

	@When("To choose gender in gender radio button field")
	public void toChooseGenderInGenderRadioButtonField() {
	    
		dp = new DemoqaPOJO();
		clickWebElement(dp.getGenderRadioBtn());
	}

	@When("To pass invalid mobilenumber into mobilenumber field")
	public void toPassInvalidMobilenumberIntoMobilenumberField() throws IOException {
		
		dp = new DemoqaPOJO();
		passText(dp.getUserNumber(), excelRead("Demoqa", "Registration_Details", 1, 1));
	}

//	@When("To click submit button")
//	public void toClickSubmitButton() {
//	    
//		driver.switchTo().frame(3);
//		clickWebElement(dp.getSubmitBtn());
//	}
}
