package com.HectorWare.step_definitions;

import com.HectorWare.pages.Login_Mia;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    Login_Mia login_mia = new Login_Mia();

    @Given("user to navigate to the URL given")
    public void userToNavigateToTheURLGiven() throws InterruptedException {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        Thread.sleep(3000);

    }

    @When("user enter valid Username in username field")
    public void userEnterValidUsernameInUsernameField() {
        login_mia.user.click();
        login_mia.user.sendKeys("Employee1");

    }

    @And("user enter valid password in password field")
    public void userEnterValidPasswordInPasswordField() {
        login_mia.password.click();
        login_mia.password.sendKeys("Employee123");

    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        login_mia.LogInButton.click();
    }

    @Then("user verify the home page")
    public void userVerifyTheHomePage() {
        String expectedTitle = "Files - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user enter Blank Username in username field")
    public void userEnterBlankUsernameInUsernameField() {
        login_mia.user.click();
        login_mia.user.sendKeys("");
    }

    @And("user enter Blank password in password field")
    public void userEnterBlankPasswordInPasswordField() {
        login_mia.password.click();
        login_mia.password.sendKeys("");
    }

    @Then("user verify the {string} message")
    public void userVerifyTheMessage(String arg0) {
        String expectedMessage = "Fill in the field";
        String actualMessage = login_mia.ErrorMsj.getText();

        try {
            Assert.assertEquals("While assert warning message",expectedMessage,actualMessage);
        }catch (Exception e){
            System.out.println("Please fill in the fields.");
        }
}

    @When("user enter {string} Username in username field")
    public void userEnterUsernameInUsernameField(String arg0) {
        login_mia.user.click();
        login_mia.user.sendKeys("");
    }

    @And("user enter {string} password in password field")
    public void userEnterPasswordInPasswordField(String arg0) {
        login_mia.password.click();
        login_mia.password.sendKeys("House2022");
    }

    @When("user enter Invalid Username in username field")
    public void userEnterInvalidUsernameInUsernameField() {
        login_mia.user.click();
        login_mia.user.sendKeys("House2022");
    }

    @And("user enter Invalid password in password field")
    public void userEnterInvalidPasswordInPasswordField() {
        login_mia.password.click();
        login_mia.password.sendKeys("");
    }

    @Then("user verify the error message")
    public void userVerifyTheErrorMessage() throws NoSuchMethodException {
        String expectedMessage = "Wrong username or password.";
        String actualMessage = login_mia.WrongPasswordMsg.getText();

        Assert.assertEquals("While assert warning message",expectedMessage,actualMessage);
    }
}
