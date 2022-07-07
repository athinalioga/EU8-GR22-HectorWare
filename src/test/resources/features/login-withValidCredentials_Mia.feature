Feature: Default

	#US: As a user, I should be able to log in with valid credentials
	#
	#AC: All the users can log in with valid credentials
	@WARE-617
	Scenario: Login Functionality -Mia
		Given user to navigate to the URL given
		When user enter valid Username in username field
		And user enter valid password in password field
		And user click on login button
		Then user verify the home page