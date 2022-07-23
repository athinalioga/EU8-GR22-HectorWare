package com.HectorWare.step_definitions;

import com.HectorWare.pages.S4_ProfileSettings_Mia;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.Web_Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S4_StepDefs_ProfileSettings_Mia {

    S4_ProfileSettings_Mia profileSettingsPage=new S4_ProfileSettings_Mia();
    WebDriverWait webDriverWait =new WebDriverWait(Driver.getDriver(),10);
    Actions actions= new Actions(Driver.getDriver());


    @And("user navigates to {string}")
    public void userNavigatesTo(String dropdownmenu) {
        profileSettingsPage.dropdown.click();
        Web_Utils.waitFor(1);

    }

    @And("user select {string} option")
    public void userSelectOption(String settingsoptn) {
        profileSettingsPage.settings.click();
        Web_Utils.waitFor(2);
    }

    @Then("the {string} page should be displayed")
    public void thePageShouldBeDisplayed(String profilesettings) {
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(profilesettings));


    }

    @When("user click on select avatar button")
    public void userClickOnSelectAvatarButton() {
        profileSettingsPage.selectedavatar.click();
        Web_Utils.waitFor(2);

    }

    @Then("user choose the picture")
    public void userChooseThePicture() {
        profileSettingsPage.selectedpicture.click();
        Web_Utils.waitFor(2);

    }


    @And("user click on Choose as a profile picture")
    public void userClickOnChooseAsAProfilePicture() {
        profileSettingsPage.choosebtn.click();
        Web_Utils.waitFor(2);

    }

    @And("user crop the picture and click the button")
    public void userCropThePictureAndClickTheButton() {
        profileSettingsPage.croppedpic.click();
    }
}
