Feature: Default

	Background:
		#@HECW-241
		Scenario: Login with valid credentials
		    Given the user login with valid credentials
		

	#US: As a user, I should be able to change the profile settings
	#
	#AC: User can change any information under the Profile Settings page
	@WARE-650
	Scenario: User would be able to change profile information
		Given user to verify if Profile settings page is displayed
		When user write the username into the username box
		And user enter the email in the email field
		And user enters phone number into phone box
		And user enters an address into the address box
		And user click on the Personal Info button on the right
		Then user to verify and see all entered info is displayed correctly