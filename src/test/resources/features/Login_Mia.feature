
Feature: Hecter Ware login functionality feature
  #US: As a user, I should be able to log in with valid credentials
   #
   #AC: No one should log in with invalid credentials

  Scenario: Login Functionality -Mia
    Given user to navigate to the URL given
    When user enter valid Username in username field
    And user enter valid password in password field
    And user click on login button
    Then user verify the home page


  Scenario: Login with Blank Username and Blank Password
    Given user to navigate to the URL given
    When user enter "Blank" Username in username field
    And user enter "Blank" password in password field
    And user click on login button
    Then user verify the "error" message


  Scenario: Login with Blank Username and Invalid Password
    Given user to navigate to the URL given
    When user enter "Blank" Username in username field
    And user enter "Invalid" password in password field
    And user click on login button
    Then user verify the "error" message


  Scenario: Login with Blank Username and valid Password
    Given user to navigate to the URL given
    When user enter "Blank" Username in username field
    And user enter valid password in password field
    And user click on login button
    Then user verify the "error" message

  Scenario: Login with Invalid Username and Blank Password
    Given user to navigate to the URL given
    When user enter "Invalid" Username in username field
    And user enter "Blank" password in password field
    And user click on login button
    Then user verify the "error" message

  Scenario: Login with Valid Username and Blank Password
    Given user to navigate to the URL given
    When user enter valid Username in username field
    And user enter "Blank" password in password field
    And user click on login button
    Then user verify the "error" message

  Scenario: Login with Valid Username and Invalid Password
    Given user to navigate to the URL given
    When user enter valid Username in username field
    And user enter "Invalid" password in password field
    And user click on login button
    Then user verify the error message

  Scenario: Login Functionality
    Given user to navigate to the URL given
    When user enter "Invalid" Username in username field
    And user enter valid password in password field
    And user click on login button
    Then user verify the "error" message
