Feature: Default

	
	@WARE-648
	Scenario: Create an event that last all day
		Given User is on calendar page
		When User click in the +new event button
		    And User enter Party in the Event title filed box
		    And User clicks on All day box button
		    And User clicks on save button
		    Then User Party event have appear on the week calendar