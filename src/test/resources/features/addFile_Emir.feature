Feature: Add File Feature

  Background: User is on the login page
    Given user is on the login page of the HectorWare Application



  Scenario: User should be able to upload a maximum file size of 10MB at a time.
    When user click the plus button
    And user click the upload file button
    And user upload a selected file up to 10 MB
    Then user should see the uploaded file on the screen

  Scenario: User should be able to upload multiple file
      Given user click the plus button
      Given user click the upload file button
      And user upload selected multiple files
      Then user should see the uploaded multiple files on the screen

  Scenario: User should be able to upload valid image files
    Given user click the plus button
    Given user click the upload file button
    And user upload valid image files
    Then user should see the valid image files on the screen

  Scenario: User should be able to upload valid document files
    Given user click the plus button
    Given user click the upload file button
    And user upload valid document files
    Then user should see the valid document files on the screen

  Scenario: User should be able to upload valid audio files
    Given user click the plus button
    Given user click the upload file button
    And user upload valid audio files
    Then user should see the valid audio files on the screen

  Scenario: User should be able to upload valid video files
    Given user click the plus button
    Given user click the upload file button
    And user upload valid video files
    Then user should see the valid video files on the screen

















