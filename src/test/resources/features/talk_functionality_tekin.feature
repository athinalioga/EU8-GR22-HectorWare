Feature: Default

	#US:
	#
	#AC:
	@WARE-637 @wip
	Scenario: Talk functionality
		Given the user navigates to the url
		Given login with valid credential
		When the user clicks talk module 
		Then the user should see the conversations box
		And the user clicks plus button
		Then the user should see the pop up
		And the use writes a conversation name
		And the user clicks -Allow guests to join via link- button
		Then the user clicks “Add Participants” button
		Then the user should see the contacts names
		And the user select user names
		And the user clicks create conversation button
		Then the user should see the conversation group has been created
		Then the user clicks to copy conversation link
		Then the user clicks close button