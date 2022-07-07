Feature: Login


  @wip
  Scenario Outline: Multiple entry of invalid Passwords credentials.

    Given User is on Login search page
    When User types Employee1 in the Login username box
    And User types "<Password>" in the password box
    And User will clicks enter
    And User see the "Wrong username or password." message every time that enters a password.
    Then User see the "<Message>" after last attempt

    Examples: | Password       | Message                                                                                                                |
    | Employee123dcg |                                                                                                                        |
    | Employee5894   |                                                                                                                        |
    | Employee749375 |                                                                                                                        |
    | Employee12356r |                                                                                                                        |
    | Employee12gfn  |                                                                                                                        |
    | Employee4eew   | We have detected multiple invalid login attempts from your IP. Therefore your next login is throttled up to 30 seconds |


