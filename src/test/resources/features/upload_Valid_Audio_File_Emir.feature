Feature: Default

	#{color:#de350b}*User Story:*{color}
	#
	#As a user, I'd like to be able to upload valid file (types/sizes) attachments via the user interface so that I can share them with other app users.
	#
	#{color:#de350b}*AC4:*{color} The application will only accept the following audio file types;
	#.mp3, .m4a, .wav
	@WARE-685
	Scenario: Verify that the users upload only valid audio file types.
		Given user is on the login page of the HectorWare Application
		Given user click the plus button
		And user upload valid audio files
		Then user should see the valid audio files on the screen