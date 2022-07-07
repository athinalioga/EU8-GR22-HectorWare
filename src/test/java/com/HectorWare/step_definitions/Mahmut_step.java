package com.HectorWare.step_definitions;

import com.HectorWare.pages.CodePage;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Mahmut_step{
    CodePage codePage=new CodePage();
    @Given("the user login to the application.")
    public void the_user_login_to_the_application() {
        codePage.login();

    }
    @When("the user navigate to calendar page")
    public void the_user_navigate_to_calendar_page() {
    codePage.navigateToCalendar();
    }
    @When("the user click on +new event button")
    public void the_user_click_on_new_event_button() {
codePage.clickEvent();
    }
    @When("the user fill up to the event form and click save button")
    public void the_user_fill_up_to_the_event_form_and_click_save_button() {
codePage.eventTitle("Mahmut's Event");
    }
    @Then("the event should be displayed on the calendar page")
    public void the_event_should_be_displayed_on_the_calendar_page() {
        WebElement createdEvent= Driver.getDriver().findElement(By.xpath("//*[.='Mahmut']"));
        Assert.assertTrue(createdEvent.isEnabled());
    Driver.closeDriver();
    }

}
