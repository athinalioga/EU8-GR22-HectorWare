Feature: HectorWare login functionality

	User story:As a user, I should be able to log in with valid credentials so
	that I can use the app.

@hwglr
	Scenario: Login with valid credentials
		When user enters "Employee1" username
		And user enters "Employee123" password
		And user clicks to login button
		Then user should see home page