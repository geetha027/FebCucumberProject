package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPOJO extends BaseClass {

	//1. Non parameterized constructor
	public FbLoginPOJO() {
		
		PageFactory.initElements(driver, this);
	}
	
	//2. Private WebElements
	
	//WebElement email = driver.findElement(By.id("email"));
	@FindBy(id="email")
	private WebElement emailFindBy;
	
	//WebElement password = driver.findElement(By.id("pass"));
	@FindBy(name="pass")
	private WebElement passwordFindBy;
	
	//WebElement loginBtn = driver.findElement(By.id("u_0_d_nQ"));
	//@FindAll--->any one of condition should be satisfied
	@FindAll({
				// for login Button WebElement
		@FindBy(xpath="//button[@id='u_0_d_nQ']"),
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@type='submit']"),
		@FindBy(xpath="//button[text()='Log In']")
	})
	private WebElement loginBtnFindAll;

	//3. Generate to access those WebElements outside the class
	public WebElement getEmailFindBy() {
		return emailFindBy;
	}

	public WebElement getPasswordFindBy() {
		return passwordFindBy;
	}

	public WebElement getLoginBtnFindAll() {
		return loginBtnFindAll;
	}
	
}
