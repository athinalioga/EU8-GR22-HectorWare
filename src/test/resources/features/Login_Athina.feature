Feature: Login

	@WARE-638
		@smoke
	Scenario: Login with valid credentials
		Given User is on Login search page
		    When User types Employee1 in the Login username box
		    And User types Employee123 in the password box
		    And User click enter
		    Then User see the main page