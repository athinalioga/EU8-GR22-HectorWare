Feature: Default

	Background:
		#@HECW-241
		Scenario: Login with valid credentials
		    Given the user login with valid credentials
		

	#US: As a user, I should be able to change the profile settings
	#
	#AC:  Display personal info under the Profile Settings page
	@WARE-652
	Scenario: User would be able to see any changes under the profile setting page
		Given user hoover over the profile tab
		When user click on the profile table
		And user verify to see the drop-down item
		And user hoover over to the settings
		And user click on the settings
		Then user verify settings page was displayed correctly