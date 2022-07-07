Feature: Default

	#US: As a user, I should be able to log in with valid credentials
	#
	#AC: No one should log in with invalid credentials
	@WARE-632
	Scenario: Login with Blank Username and Blank Password
		Given user to navigate to the URL given
			And user enter Blank Username in username field
			And user enter Blank password in password field
			And user click on login button
			Then user verify the error message