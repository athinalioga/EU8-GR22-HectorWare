package com.HectorWare.step_definitions;

import com.HectorWare.pages.CalendarAthinaPage;
import com.HectorWare.pages.LoginAthinaPage;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class calendarFunctionAthina_StepDefinitions {
    LoginAthinaPage loginAthinaPage = new LoginAthinaPage();

    CalendarAthinaPage calendarAthinaPage = new CalendarAthinaPage();

    @Given("User is on calendar page")
    public void user_is_on_calendar_page () throws InterruptedException {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        Thread.sleep(1000);
        loginAthinaPage.user.click();
        loginAthinaPage.user.sendKeys("Employee1");

        loginAthinaPage.password.click();

        loginAthinaPage.password.sendKeys("Employee123");
        loginAthinaPage.LogInButton.click();
        Thread.sleep(1000);
        calendarAthinaPage.calendarButton.click();
    }

    @When("User click in the +new event button")
    public void user_click_in_the_new_event_button() throws InterruptedException {
        Thread.sleep(2000);
        calendarAthinaPage.newEventButton.click();
    }



    @When("User enter Meting in the Event title filed box")
    public void user_enter_meting_in_the_event_title_filed_box() throws InterruptedException {
        calendarAthinaPage.eventBox.click();
        calendarAthinaPage.eventBox.sendKeys("Meting");
        Thread.sleep(1000);
    }

    @When("User enter valid date that the even will stat")
    public void user_enter_valid_date_that_the_even_will_stat() {
    }

    @When("User enter valid date that the even will finish")
    public void user_enter_valid_date_that_the_even_will_finish() {

        calendarAthinaPage.endedDate.click();
        calendarAthinaPage.Edate.click();
    }

    @When("User clicks on save button")
    public void user_clicks_on_save_button() throws InterruptedException {

        Thread.sleep(1500);
        calendarAthinaPage.savaButton.click();
    }
    @Then("User Meting event have appear on the week calendar")
    public void user_meting_event_have_appear_on_the_week_calendar() {
        Assert.assertTrue(calendarAthinaPage.metingVerification.isEnabled());
    }
    @Then("User Party event have appear on the week calendar")
    public void user_party_event_have_appear_on_the_week_calendar() {
        Assert.assertTrue(calendarAthinaPage.partyVerification.isEnabled());
    }

    @When("User enter Party in the Event title filed box")
    public void user_enter_party_in_the_event_title_filed_box() {
        calendarAthinaPage.eventBox.click();
        calendarAthinaPage.eventBox.sendKeys("Party");
    }

    @When("User clicks on All day box button")
    public void user_clicks_on_all_day_box_button() throws InterruptedException {
        Thread.sleep(1500);
       // calendarAthinaPage.allDayButton.isSelected();
        calendarAthinaPage.allDayButton.click();

    }


    @Then("User see event have appear in the month calendar")
    public void user_see_event_have_appear_in_the_month_calendar() {

    }
    @When("User click on {string} event on the List")
    public void user_click_on_event_on_the_list(String string) {

    }

    @When("User click on {string} button")
    public void user_click_on_button(String string) {

    }

    @When("User click on the {string}\\({int} dotes) button")
    public void user_click_on_the_dotes_button(String string, Integer int1) {

    }

    @When("User see drop-down list")
    public void user_see_drop_down_list() {

    }

    @Then("User the is deleted from the month calendar")
    public void user_the_is_deleted_from_the_month_calendar() {

    }

    @When("User enter Studies in the Event title filed box")
    public void user_enter_studies_in_the_event_title_filed_box() {
        calendarAthinaPage.eventBox.click();
        calendarAthinaPage.eventBox.sendKeys("Studies");
    }


}
