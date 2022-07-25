Feature: Default

	#{color:#de350b}*User Story:*{color}
	#
	#As a user, I'd like to be able to upload valid file (types/sizes) attachments via the user interface so that I can share them with other app users.
	#
	# 
	#
	#{color:#de350b}*AC1:*{color}
	#
	#Each file must not exceed a maximum file size of 10MB. 
	@WARE-682
	Scenario: Verify that users can upload a maximum file size of 10MB at a time.
		Given user is on the login page of the HectorWare Application
		When user click the plus button
		And user upload a selected file up to Ten MB
		Then user should see the uploaded file on the screen