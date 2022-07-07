package com.HectorWare.step_definitions;

import com.HectorWare.pages.Login_Mia;
import com.HectorWare.pages.ProfileSettings_Mia;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.Web_Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDef_ProfileSettings_Mia {

    Login_Mia login_mia = new Login_Mia();
    ProfileSettings_Mia profileSettings_mia = new ProfileSettings_Mia();

    @Given("User is on the profile tab")
    public void userIsOnTheProfileTab() throws InterruptedException {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        Thread.sleep(3000);

        login_mia.user.click();
        login_mia.user.sendKeys("Employee1");
        login_mia.password.click();

        login_mia.password.sendKeys("Employee123");
        login_mia.LogInButton.click();
        Thread.sleep(3000);
        profileSettings_mia.profileTab.click();
    }


    @And("user click on the settings")
    public void userClickOnTheSettings() {
        profileSettings_mia.settingsTab.click();
    }

    @Then("settings page was displayed correctly")
    public void settingsPageWasDisplayedCorrectly() {

    }

    @And("user click on {string} tab")
    public void userClickOnTab(String arg0) {
        profileSettings_mia.languageInput.click();
    }

    @And("user click on the preferable language")
    public void userClickOnThePreferableLanguage() {
        profileSettings_mia.chooseLang.click();
        Assert.assertTrue(profileSettings_mia.languageInput.isDisplayed());
    }

    @Then("user to verify referable language was displayed correctly")
    public void userToVerifyReferableLanguageWasDisplayedCorrectly() {

    }

    @When("user write the username into the username box")
    public void userWriteTheUsernameIntoTheUsernameBox() {
    profileSettings_mia.fullName.click();
    profileSettings_mia.fullName.sendKeys("Mia Iaz");
    Assert.assertTrue(profileSettings_mia.fullName.isEnabled());
    }

    @And("user enter the email in the email field")
    public void userEnterTheEmailInTheEmailField() {
    profileSettings_mia.emailAddress.click();
    profileSettings_mia.emailAddress.sendKeys("miaiaz@gmail.com");
    Assert.assertTrue(profileSettings_mia.emailAddress.isEnabled());
    }

    @And("user enters phone number into phone box")
    public void userEntersPhoneNumberIntoPhoneBox() {
        profileSettings_mia.phoneNo.click();
        profileSettings_mia.phoneNo.sendKeys("096735746");
        Assert.assertTrue(profileSettings_mia.phoneNo.isEnabled());
    }

    @And("user enters an address into the address box")
    public void userEntersAnAddressIntoTheAddressBox() {
        profileSettings_mia.address.click();
        profileSettings_mia.address.sendKeys("17 Canterbury Road/Flitwick/MK45 1TY");
        Assert.assertTrue(profileSettings_mia.address.isEnabled());
    }

    @And("user click on the Personal Info button on the right")
    public void userClickOnThePersonalInfoButtonOnTheRight() {
    }

    @Then("user to verify and see all entered info is displayed correctly")
    public void userToVerifyAndSeeAllEnteredInfoIsDisplayedCorrectly() {
    }



}