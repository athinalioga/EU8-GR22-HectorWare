Feature: Calendar

	@WARE-646
	Scenario: Create an event
		Given User is on calendar page
		When User click in the +new event button
		  And User enter Meting in the Event title filed box
		  And User clicks on save button
		  Then User Meting event have appear on the week calendar