Feature: Calendar

Background: User logs in main page
  Given User is on calendar page


  Scenario: Delete an exiting event
    When User click on "Party" event on the List
    And User click on "More" button
    And User click on the "..."(3 dotes) button
    And User click on "Delete " button
    Then User the is deleted from the month calendar


  Scenario: Click Day option
    When User clicks on Combobox menu button
    And User clicks on Combobox "Day" option
    Then The Daily calendar should be display


  Scenario: Click Week option
    When User clicks on Combobox menu button
    And User clicks on Combobox "Week" option
    Then The Weekly calendar should be displayed


  Scenario: Click Month option
    When User clicks on Combobox menu button
    And User clicks on Combobox "Month" option
    Then The Monthly calendar should be displayed


  Scenario: Click List option
    When User clicks on Combobox menu button
    And User clicks on Combobox "List" option
    Then The List calendar should be displayed