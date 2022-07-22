Feature: Default

	#_{color:#de350b}*User Story:*{color}_
	#
	#*As a user, I should be able to edit any file under the Files module*
	#
	# 
	#
	#{color:#de350b}{*}AC:{*}{*}{{*}}{color}
	# # The application allows the users to add their files to {*}favourites{*}.
	@WARE-688
	@emir
	Scenario: Verify that users add their files to favourites.
		Given user is on the login page of the HectorWare Application
		When user click the selected file
		And user add the selected file to favourites
		Then user should see the selected favourite file on the screen