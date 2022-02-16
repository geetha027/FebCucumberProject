package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.FbLoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookFunctionality extends BaseClass{
	
	FbLoginPOJO fb;
	
	//preCondition(), postCondition() -->Hooks.java
	//Read data from excel sheet
	//Assert--> get Failed (manually)
	
	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
	    
		urlLaunch("https://en-gb.facebook.com/");
	}

	@When("To pass invalid username into email field")
	public void to_pass_invalid_username_into_email_field() throws IOException {
	    
		fb = new FbLoginPOJO();
		passText(fb.getEmailFindBy(), excelRead("FaceBook", "Signup Details", 0, 0));
	}
	
	@When("To pass invalid password into password field")
	public void to_pass_invalid_password_into_password_field() throws IOException {
	    
		fb = new FbLoginPOJO();
		Assert.assertTrue(false); //Assert failed
		passText(fb.getPasswordFindBy(), excelRead("FaceBook", "Signup Details", 0, 1));
	}

	@When("To click login button")
	public void to_click_login_button() {
	    
		clickWebElement(fb.getLoginBtnFindAll());
	}

	@When("To check whether navigate to home page or not")
	public void to_check_whether_navigate_to_home_page_or_not() {
	    
		System.out.println("Check your Credentials...");
	}
}
