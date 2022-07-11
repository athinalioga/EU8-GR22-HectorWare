package com.HectorWare.step_definitions;

import com.HectorWare.pages.TalkFunctionalityPage;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TalkFunctionality_StepDefinitions_Tekin {
    TalkFunctionalityPage talkFunctionalityPage = new TalkFunctionalityPage();
    @Given("the user navigates to the url")
    public void theUserNavigatesToTheUrl() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/apps/spreed/");

    }

    @Given("login with valid credential")
    public void loginWithValidCredential() {
        talkFunctionalityPage.userName.sendKeys("Employee5");
        talkFunctionalityPage.password.sendKeys("Employee123" + Keys.ENTER);
    }
    @When("the user clicks talk module")
    public void theUserClicksTalkModule() {

        talkFunctionalityPage.talkModuleSign.click();

    }

    @Then("the user should see the conversations box")
    public void theUserShouldSeeTheConversationsBox() {

        Assert.assertTrue(talkFunctionalityPage.chatSearchBox.isDisplayed());

    }

    @Then("the user clicks plus button")
    public void theUserClicksPlusButton() {

        talkFunctionalityPage.plusButton.click();

    }

    @Then("the user should see the pop up")
    public void theUserShouldSeeThePopUp() {
       Assert.assertTrue(talkFunctionalityPage.popUp.isDisplayed());
    }

    @Then("the use writes a conversation name")
    public void theUseWritesAConversationName() {
        talkFunctionalityPage.conversationName.sendKeys("The best group - 22");
    }

    @Then("the user clicks -Allow guests to join via link- button")
    public void theUserClicksAllowGuestsToJoinViaLinkButton() {

        talkFunctionalityPage.joinLink.click();
    }


    @Then("the user clicks “Add Participants” button")
    public void theUserClicksAddParticipantsButton() {
        talkFunctionalityPage.addParticipants.click();
    }

    @Then("the user should see the contacts names")
    public void theUserShouldSeeTheContactsNames() {

        Assert.assertTrue(talkFunctionalityPage.contactsNames.isDisplayed());

    }

    @Then("the user select user names")
    public void theUserSelectUserNames() {

        talkFunctionalityPage.addEmployee10.click();
        talkFunctionalityPage.addEmployee101.click();
        talkFunctionalityPage.addEmployee102.click();
    }

    @And("the user clicks create conversation button")
    public void theUserClicksCreateConversationButton() {

        talkFunctionalityPage.createConversationButton.click();
    }


    @Then("the user should see the conversation group has been created")
    public void theUserShouldSeeTheConversationGroupHasBeenCreated() {
        Assert.assertTrue(talkFunctionalityPage.allSetWarning.isDisplayed());
    }


    @Then("the user clicks to copy conversation link")
    public void theUserClicksToCopyConversationLink() {
        talkFunctionalityPage.conversationLink.click();
    }

    @Then("the user clicks close button")
    public void theUserClicksCloseButton() {
        talkFunctionalityPage.closeButton.click();
    }
}
