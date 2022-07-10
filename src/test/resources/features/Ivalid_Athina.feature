Feature: Login

	
	@WARE-640
	Scenario: Login with invalid credentials
		Given User is on Login search page
		    When User types Employee123 in the Login username box
		    Then User types Employee1 in the password box
		    And User click enter
		    Then User see the "Wrong username or password." message