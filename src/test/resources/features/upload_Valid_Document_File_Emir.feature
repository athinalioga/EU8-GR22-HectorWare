Feature: Default

	#_{color:#de350b}*User Story:*{color}_
	#
	#As a user, I'd like to be able to upload valid file (types/sizes) attachments via the user interface so that I can share them with other app users.
	#
	#{color:#de350b}*AC3*{color}: The application will only accept the following document file types;
	#.pdf, .doc, docx, .xls, xlsx, .ppt
	@WARE-684
	Scenario: Verify that the users upload only valid document file types.
		Given user is on the login page of the HectorWare Application
		Given user click the plus button
		And user upload valid document files
		Then user should see the valid document files on the screen