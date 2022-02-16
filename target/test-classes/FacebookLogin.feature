@Feature2
Feature: To validate login functionality of facebook application

	@Scenario2 @Sanity
  Scenario: To validate invalid username and invalid password of fb login
    When To launch the url of facebook application
    And To pass invalid username into email field
    And To pass invalid password into password field
    And To click login button
    And To check whether navigate to home page or not

	@Scenario3 @Regression
  Scenario Outline: To validate the positive and negative combinations
    When user has to launch the url of application
    And user has to pass the "<emaildata>"email data in email field
    And user has to pass the "<passworddata>"password data in password field
    And user has to click the login button

    Examples: 
      | emaildata           | passworddata |
      | java@gmail.com      |        12345 |
      | cucumber@gmail.com  |         6789 |
      | framework@gmail.com |       101112 |
      | sql@gmail.com       | sql004       |
