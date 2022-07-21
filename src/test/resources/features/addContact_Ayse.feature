Feature: Contact functionality

  Background: For the scenarios in the feature file, user is expected to be on the main page
    And User clicks on the contacts button
    Then Webpage title contains Contacts

  Scenario: Create a new contact
    Given User clicks on the + New contact button
    And User enters "cbd" into the name input box
    And User refreshes the page
    Then User verifies contact named "cbd" is displayed on the contacts column

