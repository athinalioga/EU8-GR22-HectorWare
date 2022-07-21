Feature: calendar
	Background: User logs in main page
		Given User is on calendar page
	
	@WARE-680

		Scenario: Daily-Weekly-Monthly Should be viewed
		
		    When User clicks on Combobox menu button
		    Then The Combobox menu button should include the expected options
		      | Day   |
		      | Week  |
		      | Month |
		      | List  |