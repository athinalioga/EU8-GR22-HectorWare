Feature: Contact functionality

  Background: For the scenarios in the feature file, user is expected to be on the main page
    #Given user to navigate to the URL given
    #When user enter valid Username in username field
    #And user enter valid password in password field
    #And user click on login button
    #And user verify the home page
    And User clicks on the contacts button
    And Webpage title contains Contacts
    And User clicks on the + New contact button
    And User enters "cbd" into the name input box
    And User refreshes the page
    Then User verifies contact named "cbd" is displayed on the contacts column

  @wipAyse
  Scenario: Edit a contact that is already created
    Given User clicks on the contact named "cbd"
    And User enters all required fields
    And User refreshes the page
    Then User verifies contact is successfully edited

  @wipAyse
  Scenario: Add a contact into a group
    Given User clicks on the contact named "cbd"
    And User clicks on groups input box and selects "cydeo10" group
    And User clicks on "cydeo10" on the left column
    Then User verifies contact named "cbd" is displayed on the contacts column