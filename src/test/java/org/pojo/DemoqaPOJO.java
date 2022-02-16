package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPOJO extends BaseClass{
	
	public DemoqaPOJO() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "userEmail")
	private WebElement userEmail;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement genderRadioBtn;
	
	@FindBy(id = "userNumber")
	private WebElement userNumber;
	
	@FindBy(xpath="//label[text()='Reading']")
	private WebElement hobbiesRadioBtn;
	
	@FindAll({
		
		@FindBy(xpath = "//button[@id='submit']"),
		@FindBy(xpath = "//button[@type='submit']"),
		@FindBy(xpath = "//button[text()='Submit']"),
		@FindBy(xpath = "//div[@class='text-right col-md-2 col-sm-12']")
	})
	private WebElement submitBtn;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getUserEmail() {
		return userEmail;
	}

	public WebElement getGenderRadioBtn() {
		return genderRadioBtn;
	}

	public WebElement getUserNumber() {
		return userNumber;
	}

	public WebElement getHobbiesRadioBtn() {
		return hobbiesRadioBtn;
	}
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}

}
