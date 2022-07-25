Feature: Contact functionality - edit contact - add contact into a group

  Background: For the scenarios in the feature file, user is expected to be on the main page

    And User clicks on the contacts button
    And Webpage title contains Contacts
    And User clicks on the + New contact button
    And User enters "cbd" into the name input box
    And User refreshes the page
    Then User verifies contact named "cbd" is displayed on the contacts column

  #Scenario: Edit a contact that is already created
   # Given User clicks on the contact named "cbd"
   # And User enters all required fields
   # And User refreshes the page
   # Then User verifies contact is successfully edited

  Scenario: Add a contact into a group
    Given User clicks on the contact named "cbd"
    And User clicks on groups input box and selects "cydeo10" group
    And User clicks on "cydeo10" on the left column
    Then User verifies contact named "cbd" is displayed on the contacts column
