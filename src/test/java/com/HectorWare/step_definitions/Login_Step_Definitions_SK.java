package com.HectorWare.step_definitions;

import com.HectorWare.pages.HectorWareLoginPage_Sk;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Login_Step_Definitions_SK {

    HectorWareLoginPage_Sk hectorWareLoginPage_sk= new HectorWareLoginPage_Sk();

    @When("user enters {string} username")
    public void user_enters_username(String username) {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login?clear=1");
        hectorWareLoginPage_sk.inputUsername.sendKeys(username);

    }
    @When("user enters {string} password")
    public void user_enters_password(String password) {
        hectorWareLoginPage_sk.inputPassword.sendKeys(password);

    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        hectorWareLoginPage_sk.loginButton.click();


    }
    @Then("user should see home page")
    public void user_should_see_home_page() {
        Assert.assertTrue(hectorWareLoginPage_sk.homeIcon.isDisplayed());


    }

    @Then("close the browser")
    public void close_broser() {
        Driver.closeDriver();

    }

}
