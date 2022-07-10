Feature: Default

	#US: As a user, I should be able to log in with valid credentials
	#
	#AC: All the users can log in with valid credentials
	@WARE-618
	Scenario: Login Functionality 
		Given user to navigate to the URL given
		When user verify login page is displayed in the middle of the page
		And user enter Invalid Username in username field
		And user enter valid password in password field
		And user click on login button
		Then user verify the error message