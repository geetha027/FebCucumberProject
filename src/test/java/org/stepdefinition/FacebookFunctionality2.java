package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.FbLoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookFunctionality2 extends BaseClass{

	FbLoginPOJO fb;
	
	//preCondition(), postCondition() -->Hooks.java
	//Read data from Examples tag
	@When("user has to launch the url of application")
	public void userHasToLaunchTheUrlOfApplication() {
	    
		urlLaunch("https://en-gb.facebook.com/");
	}

	@When("user has to pass the {string}email data in email field")
	public void userHasToPassTheEmailDataInEmailField(String emaildata) {
	    
		fb = new FbLoginPOJO();
		passText(fb.getEmailFindBy(), emaildata);
	}

	@When("user has to pass the {string}password data in password field")
	public void userHasToPassThePasswordDataInPasswordField(String passworddata) {
	    
		fb = new FbLoginPOJO();
		passText(fb.getPasswordFindBy(), passworddata);
	}

	@When("user has to click the login button")
	public void userHasToClickTheLoginButton() {

		fb = new FbLoginPOJO();
		clickWebElement(fb.getLoginBtnFindAll());
	}
}
