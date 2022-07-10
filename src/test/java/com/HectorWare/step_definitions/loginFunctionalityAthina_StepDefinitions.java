package com.HectorWare.step_definitions;

import com.HectorWare.pages.LoginAthinaPage;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginFunctionalityAthina_StepDefinitions {

    LoginAthinaPage loginAthinaPage = new LoginAthinaPage();

    @Given("User is on Login search page")
    public void user_is_on_login_search_page() throws InterruptedException {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        Thread.sleep(1000);
    }

    @When("User types Employee1 in the Login username box")
    public void user_types_employee1_in_the_login_username_box() {

        loginAthinaPage.user.click();
        loginAthinaPage.user.sendKeys("Employee1");

    }

    @When("User types Employee123 in the password box")
    public void user_types_employee123_in_the_password_box() {

        loginAthinaPage.password.click();
        loginAthinaPage.password.sendKeys("Employee123");
    }

    @When("User click enter")
    public void user_click_enter() {

        loginAthinaPage.LogInButton.click();
    }

    @Then("User see the main page")
    public void user_see_the_main_page() {

        String expectedTitle = "Files - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @When("User types Employee123 in the Login username box")
    public void user_types_employee123_in_the_login_username_box() {
        loginAthinaPage.user.click();
        loginAthinaPage.user.sendKeys("Employee123");


    }

    @Then("User types Employee1 in the password box")
    public void user_types_employee1_in_the_password_box() {
        loginAthinaPage.password.click();
        loginAthinaPage.password.sendKeys("Employee1");

    }


    @Then("User see the {string} message")
    public void user_see_the_message(String string) {
        String expectedMessage = "Wrong username or password.";
        String actualMessage = loginAthinaPage.warningMsg.getText();

        try {
            Assert.assertEquals("While assert warning message",expectedMessage,actualMessage);
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }

    }


    @When("User types {string} in the Login username box")
    public void user_types_in_the_login_username_box(String string) {
        loginAthinaPage.user.click();
        loginAthinaPage.user.sendKeys(" Employee1");
    }

    @When("User typeses Employee123 in the password box")
    public void user_typess_employee123_in_the_password_box() {
        loginAthinaPage.password.click();
        loginAthinaPage.password.sendKeys("Employee123");
    }


    @And("User types {string} in the password box")
    public void userTypesInThePasswordBox(String password) {
        loginAthinaPage.password.click();
        loginAthinaPage.password.sendKeys(password);

    }
    @When("User will clicks enter")
    public void user_will_clicks_enter() throws InterruptedException {

        Thread.sleep(1000);
        loginAthinaPage.LogInButton.click();
//        String expectedMessage = "Wrong username or password.";
//        String actualMessage = longValidCredPage.warningMsg.getText();
//
//        try {
//            Assert.assertEquals("While assert warning message",expectedMessage,actualMessage);
//        }catch (Exception e){
//            System.out.println("Something went wrong.");
//        }
    }

    @When("User see the {string} message every time that enters a password.")
    public void user_see_the_message_every_time_that_enters_a_password(String string) throws InterruptedException {

        String expectedMessage = "Wrong username or password.";
        String actualMessage = loginAthinaPage.warningMsg.getText();

        try {
            Assert.assertEquals(expectedMessage,actualMessage);
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }

    }

    @When("User types Employee1 in the Login username boxs")
    public void user_types_employee1_in_the_login_username_boxs() {

        loginAthinaPage.user.click();
        loginAthinaPage.user.sendKeys("Employee1");

    }
    @Then("User see the {string} after last attempt")
    public void user_see_the_after_last_attempt(String string) {

        String expectedMessage = "We have detected multiple invalid login attempts from your IP. Therefore your next login is throttled up to 30 seconds.";
        String actualMessage = loginAthinaPage.multipleAttemts.getText();

        try {
            Assert.assertEquals(expectedMessage,actualMessage);
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }

    }


    @Then("User leaves password box empty")
    public void user_leaves_password_box_empty() {
        loginAthinaPage.password.click();
        loginAthinaPage.password.sendKeys("");

    }

    @Then("User haven't login")
    public void user_haven_t_login() {

        String expectedTitle = "Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }





}