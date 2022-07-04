Feature: Default

	#US:
	#
	#AC:
	@WARE-637
	Scenario: Talk functionality
		Given the user navigates to the url
		When the user clicks talk module 
		Then the user should see the conversations box
		Then the user clicks plus button
		Then the user should see the pop up
		Then the use writes a conversation name
		Then the user clicks -Allow guests to join via link- button
		Then the user clicks “Add Participants” button
		Then the user should see the contacts names
		Then the user select user names
		Then the user should see the conversation group has been created