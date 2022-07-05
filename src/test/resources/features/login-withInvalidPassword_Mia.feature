Feature: Default

	#US: As a user, I should be able to log in with valid credentials
	#
	#AC: No one should log in with invalid credentials
	@WARE-621
	Scenario: Login with Valid Username and Invalid Password
		Given user to navigate to webpage given
		When user to verify login page is displayed in the middle of the page
		And user enter valid Username in username field
		And user enter Invalid password in password field
		And user click on login button
		Then user verify the error message
