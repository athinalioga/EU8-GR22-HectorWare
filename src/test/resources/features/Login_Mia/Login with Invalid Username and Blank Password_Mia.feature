Feature: Default

	#US: As a user, I should be able to log in with valid credentials
	#
	#AC: No one should log in with invalid credentials
	@WARE-630
	Scenario: Login with Invalid Username and Blank Password
		Given user to navigate to the URL given
		When user verify login page is displayed in the middle of the page
		And user enter Invalid Username in username field
		And user enter Blank password in password field
		And user click on login button
		Then user verify the error message