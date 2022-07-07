Feature: Calendar

Background: User logs in main page
  Given User is on calendar page

  @wep
  Scenario: Create an event that last all day
    When User click in the +new event button
    And User enter Party in the Event title filed box
    And User clicks on All day box button
    And User clicks on save button
    Then User Party event have appear on the week calendar


  Scenario: Create an event that last a week
    When User click in the +new event button
    And User enter Studies in the Event title filed box
    And User enter valid date that the even will stat
    And User enter valid date that the even will finish
    And User clicks on save button
    Then User see event have appear in the month calendar


  Scenario: Delete an exiting event

    When User click on "Studies" event on the List
    And User click on "More" button
    And User click on the "..."(3 dotes) button
    And User see drop-down list
    And User click on "Delete " button
    Then User the is deleted from the month calendar