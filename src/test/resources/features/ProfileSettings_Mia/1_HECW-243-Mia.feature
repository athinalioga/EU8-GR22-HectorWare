Feature: Default

	#US: As a user, I should be able to change the profile settings
	#
	#AC: User can change any information under Profile Settings page
	@WARE-654
	Scenario: User would be able to see any changes under the Language setting tab
		Given user to verify Profile settings page is displayed
		When user scroll down to "Language" tab
		And user click on "Language" tab
		And user click on the preferable language
		Then user to verify referable language was displayed correctly