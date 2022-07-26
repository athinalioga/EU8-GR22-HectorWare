@WARE-690
Feature: Default
	Background: User is logged in
		Given the user login to the application.
		When  the user navigate to calendar page

	#As a user I should select a specific time on the day activities and more button will appear.
	#
	#A.C:
	#
	#User click on the more button and see all details
	#
	#User write an adress on the location bar
	#
	# 
	@WARE-690
	Scenario: Calendar Functions Control
		Given the user navigates to the More options button
		When the user click on the More button
		Then the user will see different features
		And the user write adress on the Location bar