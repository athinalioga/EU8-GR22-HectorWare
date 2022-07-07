Feature: Default

	
	@WARE-644
	Scenario: Login without password 
		Given User is on Login search page
		    When User types Employee1 in the Login username box
		    Then User leaves password box empty
		    And User click enter
		    Then User haven't login