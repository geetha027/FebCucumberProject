@Feature1
Feature: To validate registration form functionality of demoqa application

  @Scenario1 @Smoke
  Scenario: To verify the registration form with invalid details of demoqa application
    When To pass the url of demoqa application
    And To pass invalid firstname into firstname field
    And To pass invalid lastname into lastname field
    And To pass invalid email into emailfield
    And To choose gender in gender radio button field
    And To pass invalid mobilenumber into mobilenumber field
  # And To click submit button
