package com.HectorWare.step_definitions;

import com.HectorWare.pages.Mahmut_Calendar_Page;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.Web_Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalendarFeaturesStep {
    Mahmut_Calendar_Page calendar = new Mahmut_Calendar_Page();
    @Given("the user navigates to the More options button")
    public void the_user_navigates_to_the_more_options_button() {
        Web_Utils.waitFor(2);
        //calendar.eventTable.click();
        Driver.getDriver().findElement(By.xpath("//td[@data-time=\"03:00:00\"][2]")).click();
    }
    @When("the user click on the More button")
    public void the_user_click_on_the_more_button() {
    //calendar.moreOption.click();
        Driver.getDriver().findElement(By.xpath("//button[contains(text(),'More')]")).click();
    }
    @Then("the user will see different features")
    public void the_user_will_see_different_features() {
        WebElement sideBar=Driver.getDriver().findElement(By.id("app-sidebar-vue"));
        Assert.assertTrue(sideBar.isDisplayed());
    }
    @Then("the user write adress on the Location bar")
    public void the_user_write_adress_on_the_location_bar() {
        WebElement locationBar=Driver.getDriver().findElement(By.xpath("//textarea[@title='Location']"));
locationBar.sendKeys("MK00 0AD");
    }

}
