package com.HectorWare.step_definitions;

import com.HectorWare.pages.AddFile_EmirPage;
import com.HectorWare.pages.EditFile_EmirPage;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.Web_Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class EditFile_Emir_StepDefinitions {

   EditFile_EmirPage editFile_emirPage = new EditFile_EmirPage();



    @When("user click the selected file")
    public void user_click_the_selected_file() {

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(editFile_emirPage.tiffObject).perform();

    }
    @When("user add the selected file to favourites")
    public void user_add_the_selected_file_to_favourites() {
        editFile_emirPage.tiffObjectFavBtn.click();
    }
    @Then("user should see the selected favourite file on the screen")
    public void user_should_see_the_selected_favourite_file_on_the_screen() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(editFile_emirPage.tiffObject).perform();
        Web_Utils.waitForClickablility(editFile_emirPage.tiffObjectRemoveFavBtn,2);

        Assert.assertTrue(editFile_emirPage.tiffObjectRemoveFavBtn.isDisplayed());

    }







}
