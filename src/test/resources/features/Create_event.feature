Feature: Default
@wip
	#As a user I should click on the new event+ button the calendar will appear.
	#
	#A.C:
	#
	#All users can select forward time. 
	#
	#No one should select previous time.
	#@WARE-625
	Scenario: Create an event on calendar.
		Given the user login to the application.
		When the user navigate to calendar page
		And the user click on +new event button
		And the user fill up to the event form and click save button
		Then the event should be displayed on the calendar page