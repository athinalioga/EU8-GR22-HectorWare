Feature: Default

	#US: As a user, I should be able to change the profile settings
	#
	#AC: User can change any information under Profile Picture Settings page
	@WARE-676
		@regression
	Scenario: User should able to change their profile picture from uploaded files
		Given user is on the login page
		    And user enters valid username "Employee1" and password "Employee123"
		    And user navigates to "Menu"
		    And user select "Settings" option
		    Then the "Settings" page should be displayed
		    When user click on select avatar button
		    Then user choose the picture
		    And user click on Choose as a profile picture
		    And user crop the picture and click the button