package com.HectorWare.step_definitions;

import com.HectorWare.pages.CodePage;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login_Guler_StepDef {

    CodePage codePage = new CodePage();

    @When("user enters {string} username")
    public void user_enters_username(String username) {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login?clear=1");

       codePage.inputUsername.sendKeys(username);

    }

    @When("user enters {string} password")
    public void user_enters_password(String password) {

      codePage.inputPassword.sendKeys(password);

    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {

       codePage.loginButton.click();


    }

    @Then("user should see home page")
    public void user_should_see_home_page() {

        Assert.assertTrue(codePage.homeIcon.isDisplayed());


    }
}