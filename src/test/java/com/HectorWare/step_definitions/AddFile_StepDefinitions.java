package com.HectorWare.step_definitions;

import com.HectorWare.pages.AddFileEmirPage;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.Web_Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class AddFile_StepDefinitions {

    AddFileEmirPage addFileEmirPage = new AddFileEmirPage();

    @Given("user is on the login page of the HectorWare Application")
    public void user_is_on_the_login_page_of_the_hector_ware_application() {

        addFileEmirPage.login();

    }

    @When("user click the plus button")
    public void user_click_the_plus_button() {
      addFileEmirPage.addFilePlusBtn.click();
    }

    @When("user upload a selected file up to Ten MB")
    public void user_upload_a_selected_file_up_to_ten_mb() throws AWTException {

        addFileEmirPage.upTo10MBFileUpload();

    }


    @Then("user should see the uploaded file on the screen")
    public void user_should_see_the_uploaded_file_on_the_screen() {
        Assert.assertTrue(addFileEmirPage.upTo10MBfileAudio.isDisplayed());
    }



    @Given("user upload valid image files")
    public void user_upload_valid_image_files() throws AWTException {

        addFileEmirPage.validImageFileUpload();

    }
    @Then("user should see the valid image files on the screen")
    public void user_should_see_the_valid_image_files_on_the_screen() {
        Assert.assertTrue(addFileEmirPage.validImageFile.isDisplayed());
    }



    @Given("user upload valid document files")
    public void user_upload_valid_document_files() throws AWTException {
        addFileEmirPage.validDocumentFileUpload();
    }
    @Then("user should see the valid document files on the screen")
    public void user_should_see_the_valid_document_files_on_the_screen() {
        Assert.assertTrue(addFileEmirPage.validDocumentFile.isDisplayed());
    }


    @Given("user upload valid audio files")
    public void user_upload_valid_audio_files() throws AWTException {
        addFileEmirPage.validAudioFileUpload();
    }
    @Then("user should see the valid audio files on the screen")
    public void user_should_see_the_valid_audio_files_on_the_screen() {
        Assert.assertTrue(addFileEmirPage.validAudioFile.isDisplayed());
    }

    @Given("user upload valid video files")
    public void user_upload_valid_video_files() throws AWTException {
        addFileEmirPage.validVideoFileUpload();
    }
    @Then("user should see the valid video files on the screen")
    public void user_should_see_the_valid_video_files_on_the_screen() {
        Assert.assertTrue(addFileEmirPage.validVideoFile.isDisplayed());
    }




}
