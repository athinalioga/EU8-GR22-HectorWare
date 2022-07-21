Feature: Default

	#US: As a user, I should be able to log in with valid credentials
	#
	#AC: All the users can log in with valid credentials
	@WARE-678
	Scenario:  Login functionality
		Given user is on the login page
		    When user enters valid username "Employee1" and password "Employee123"
		    Then index page should be displayed