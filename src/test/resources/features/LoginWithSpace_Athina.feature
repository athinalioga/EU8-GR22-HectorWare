Feature:Login

	
	@WARE-642
	Scenario: No one should log in with Space on the Username credentials
		Given User is on Login search page
		    When User types Employee1 in the Login username box
		    And User types Employee123 in the password box
		    And User click enter
		    Then User see the "Wrong username or password." message