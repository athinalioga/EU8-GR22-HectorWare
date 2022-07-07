
Feature: Profile Settings
  #US: As a user, I should be able to log in with valid credentials
   #
   #AC: No one should log in with invalid credentials

  Background: User login in main page
    Given User is on the profile tab

  Scenario: Authorized user can upload the profile picture from the login_feature_file
  When user click on the settings
  Then settings page was displayed correctly


  Scenario: User would be able to see any changes under the Language setting tab
    When user click on "Language" tab
    And user click on the preferable language
    Then user to verify referable language was displayed correctly

  Scenario: User would be able to change profile information
    When user write the username into the username box
    And user enter the email in the email field
    And user enters phone number into phone box
    And user enters an address into the address box
    And user click on the Personal Info button on the right
    Then user to verify and see all entered info is displayed correctly



