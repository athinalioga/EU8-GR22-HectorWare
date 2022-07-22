package com.HectorWare.step_definitions;

import com.HectorWare.pages.S4_Login_Mia;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class S4_StepDefs_Login_Mia {

    S4_Login_Mia loginPage = new S4_Login_Mia();

        @Given("user is on the login page")
        public void user_is_on_the_login_page() throws InterruptedException {
            Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
            Thread.sleep(3000);
        }

        @When("user enters valid username {string} and password {string}")
        public void user_enters_valid_username_and_password(String username, String password) {
            loginPage.user.click();
            loginPage.user.sendKeys("Employee1");
            loginPage.password.click();
            loginPage.password.sendKeys("Employee123");
            loginPage.LogInButton.click();



        }

        @Then("index page should be displayed")
        public void index_page_should_be_displayed() {
            String exptectedTitle = "Files - Hectorware - QA";
            String actualtitle = Driver.getDriver().getTitle();
            Assert.assertEquals("User is not on the index page", exptectedTitle, actualtitle);
        }
}
