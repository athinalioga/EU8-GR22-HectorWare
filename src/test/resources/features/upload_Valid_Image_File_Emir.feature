Feature: Default

	#{color:#de350b}*User Story:*{color}
	#
	#As a user, I'd like to be able to upload valid file (types/sizes) attachments via the user interface so that I can share them with other app users.
	#
	#{*}{color:#de350b}AC2{color}{*}: The application will only accept the following image file types;
	#.jpg, .jpeg, .gif, .tiff, .webp
	@WARE-683
	Scenario: Verify that the users upload only valid image file types.
		Given user is on the login page of the HectorWare Application
		Given user click the plus button
		And user upload valid image files
		Then user should see the valid image files on the screen