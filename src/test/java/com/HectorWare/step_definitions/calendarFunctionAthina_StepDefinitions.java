package com.HectorWare.step_definitions;

import com.HectorWare.pages.CalendarAthinaPage;
import com.HectorWare.pages.LoginAthinaPage;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.Web_Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class calendarFunctionAthina_StepDefinitions {
    LoginAthinaPage loginAthinaPage = new LoginAthinaPage();

    CalendarAthinaPage calendarAthinaPage = new CalendarAthinaPage();

    @Given("User is on calendar page")
    public void user_is_on_calendar_page () {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");
        Web_Utils.waitFor(2);
        loginAthinaPage.user.click();
        loginAthinaPage.user.sendKeys("Employee1");

        loginAthinaPage.password.click();

        loginAthinaPage.password.sendKeys("Employee123");
        loginAthinaPage.LogInButton.click();
        Web_Utils.waitFor(2);
        calendarAthinaPage.calendarButton.click();
    }

    @When("User click in the +new event button")
    public void user_click_in_the_new_event_button() {
        Web_Utils.waitFor(2);
        calendarAthinaPage.newEventButton.click();
    }



    @When("User enter Meting in the Event title filed box")
    public void user_enter_meting_in_the_event_title_filed_box() {
        calendarAthinaPage.eventBox.click();
        calendarAthinaPage.eventBox.sendKeys("Meeting");
        Web_Utils.waitFor(2);
    }


    @When("User clicks on save button")
    public void user_clicks_on_save_button() {

        Web_Utils.waitFor(2);
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
    public void user_clicks_on_all_day_box_button() {
        Web_Utils.waitFor(2);
       // calendarAthinaPage.allDayButton.isSelected();
        calendarAthinaPage.allDayButton.click();

    }

    @When("User click on {string} event on the List")
    public void user_click_on_event_on_the_list(String string) {

        calendarAthinaPage.partyDelete.click();
    }

    @When("User click on {string} button")
    public void user_click_on_button(String string) {

        calendarAthinaPage.moreButton.click();

    }

    @When("User click on the {string}\\({int} dotes) button")
    public void user_click_on_the_dotes_button(String string, Integer int1) {

        Web_Utils.waitFor(2);
        calendarAthinaPage.threeButton.click();

    }


    @Then("User the is deleted from the month calendar")
    public void user_the_is_deleted_from_the_month_calendar() throws InterruptedException {

        calendarAthinaPage.threeButton.click();
       // Thread.sleep(2000);
        calendarAthinaPage.deleteButton.click();
    }

    @When("User enter Studies in the Event title filed box")
    public void user_enter_studies_in_the_event_title_filed_box() {
        calendarAthinaPage.eventBox.click();
        calendarAthinaPage.eventBox.sendKeys("Studies");
    }


    @When("User clicks on Combobox menu button")
    public void the_user_clicks_on_combobox_menu_button() {
        Web_Utils.waitForClickablility(calendarAthinaPage.ComboboxListButton,3);
        calendarAthinaPage.ComboboxListButton.click();
        Web_Utils.waitFor(2);

    }

    @Then("The Combobox menu button should include the expected options")
    public void the_combobox_menu_button_should_include_the_expected_options(List<String> expectedOptions){

        List <String> actualOptions = calendarAthinaPage.getTextFromComboboxOptions();

        Assert.assertEquals(expectedOptions,actualOptions);
    }

    @When("User clicks on Combobox {string} option")
    public void user_clicks_on_combobox_option(String option) {

        calendarAthinaPage.clickComboboxOption(option);
    }

    @Then("The Daily calendar should be display")
    public void the_daily_calendar_should_be_display() {

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date d = new Date();

        String date = dateFormat.format(d);
        String[] str = calendarAthinaPage.datesHeader.getText().split(" ");
        String dayTxt=str[1];
        Assert.assertEquals(date,dayTxt);
    }

    @Then("The Weekly calendar should be displayed")
    public void the_weekly_calendar_should_be_displayed() {
        List<String>weekDays=Web_Utils.getElementsText(Driver.getDriver().findElements(By.xpath("//a[@tabindex='0']")));
        try{
            if(weekDays.size()==7){
                Assert.assertTrue(true);
            }else{
                Assert.fail("The Weekly Calendar is NOT been displayed");
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
    @Then("The Monthly calendar should be displayed")
    public void the_monthly_calendar_should_be_displayed() {
        List<WebElement>weekDays=Driver.getDriver().findElements(By.xpath("//a[@class='fc-daygrid-day-number']"));
        try{
            if(weekDays.size()>28){
                Assert.assertTrue(true);
            }else{
                Assert.fail("The Monthly Calendar is NOT been displayed");
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
    @Then("The List calendar should be displayed")
    public void the_list_calendar_should_be_displayed() {
        Date d =new Date();
        String[] text=calendarAthinaPage.dateModule.getText().split(" ");
        String actualText=text[0];
        String month="";
        switch (d.getMonth()){
            case 0:
                month="January";
                Assert.assertEquals(month,actualText);
                break;
            case 1:
                month="February";
                Assert.assertEquals(month,actualText);
                break;
            case 2:
                month="March";
                Assert.assertEquals(month,actualText);
                break;
            case 3:
                month="April";
                Assert.assertEquals(month,actualText);
                break;
            case 4:
                month="May";
                Assert.assertEquals(month,actualText);
                break;
            case 5:
                month="June";
                Assert.assertEquals(month,actualText);
                break;
            case 6:
                month="July";
                Assert.assertEquals(month,actualText);
                break;
            case 7:
                month="August";
                Assert.assertEquals(month,actualText);
                break;
            case 8:
                month="September";
                Assert.assertEquals(month,actualText);
                break;
            case 9:
                month="October";
                Assert.assertEquals(month,actualText);
                break;
            case 10:
                month="November";
                Assert.assertEquals(month,actualText);
                break;
            case 11:
                month="December";
                Assert.assertEquals(month,actualText);
                break;
        }
    }
}
