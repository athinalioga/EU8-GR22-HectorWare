package com.HectorWare.step_definitions;

import com.HectorWare.pages.ContactsFunctionalityPage;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Contacts_StepDefinitions {

    ContactsFunctionalityPage contactsFunctionalityPage = new ContactsFunctionalityPage();

    @Given("User clicks on the contacts button")
    public void user_clicks_on_the_contacts_button() {
        // to be deleted later on
//        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
//        Driver.getDriver().findElement(By.xpath("//input[@name='user']")).sendKeys("Employee1");
//        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Employee123");
//        Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();

        contactsFunctionalityPage.contactsButton.click();
    }

    @Then("Webpage title contains Contacts")
    public void webpage_title_contains_contacts() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Contacts"));
    }

    @Given("User clicks on the + New contact button")
    public void user_clicks_on_the_new_contact_button() {
        contactsFunctionalityPage.newContactButton.click();
    }

    @Given("User enters {string} into the name input box")
    public void user_enters_into_the_name_input_box(String fullName) {
        contactsFunctionalityPage.fullNameInputBox.clear();
        contactsFunctionalityPage.fullNameInputBox.sendKeys(fullName);
    }

    @Given("User refreshes the page")
    public void user_refreshes_the_page() throws InterruptedException {
        Thread.sleep(5000);
        Driver.getDriver().navigate().refresh();
    }

    @Then("User verifies contact named {string} is displayed on the contacts column")
    public void user_verifies_contact_named_is_displayed_on_the_contacts_column(String nameInContactList) {
        List<WebElement> actualName = contactsFunctionalityPage.nameInContactList;

        for (int i = 0; i < actualName.size(); i++) {
            String eachContact = contactsFunctionalityPage.nameInContactList.get(i).toString();
            if (eachContact.equals(nameInContactList)) {
                Assert.assertTrue(true);
                break;
            } else if (i == actualName.size()) {
                Assert.assertTrue("Name is not in contacts list", false);
            }
        }
    }

    @Given("User clicks on the contact named {string}")
    public void user_clicks_on_the_contact_named(String nameInContactList) {
        List<WebElement> actualName = contactsFunctionalityPage.nameInContactList;

        for (int i = 0; i < actualName.size(); i++) {
            String eachContact = contactsFunctionalityPage.nameInContactList.get(i).toString();
            if (eachContact.equals(nameInContactList)) {
                contactsFunctionalityPage.nameInContactList.get(i).click();
                break;
            } else if (i == actualName.size()) {
                Assert.assertTrue("Name is not in contacts list", false);
            }
        }
    }

    /*
    @Given("User enters all required fields")
    public void user_enters_all_required_fields() {
        contactsFunctionalityPage.companyInputBox.sendKeys("Cydeo");
        contactsFunctionalityPage.titleInputBox.sendKeys("IT");
        contactsFunctionalityPage.phoneInputBox.sendKeys("0123456789");
        contactsFunctionalityPage.emailInputBox.sendKeys("abc@cydeo.com");
        contactsFunctionalityPage.cityInputBox.sendKeys("London");
    }

    @Then("User verifies contact is successfully edited")
    public void user_verifies_contact_is_successfully_edited() {
        Assert.assertTrue("company info error", contactsFunctionalityPage.companyInputBox.equals("Cydeo"));
        Assert.assertTrue("title info error", contactsFunctionalityPage.titleInputBox.equals("IT"));
        Assert.assertTrue("phone info error", contactsFunctionalityPage.phoneInputBox.equals("0123456789"));
        Assert.assertTrue("email info error", contactsFunctionalityPage.emailInputBox.equals("abc@cydeo.com"));
        Assert.assertTrue("city info error", contactsFunctionalityPage.cityInputBox.equals("London"));
    }
     */

    @Given("User clicks on groups input box and selects {string} group")
    public void user_clicks_on_groups_input_box_and_selects_group(String string) {
        contactsFunctionalityPage.groupInputBox.click();
        contactsFunctionalityPage.chosenGroup.click();
    }

    @Given("User clicks on {string} on the left column")
    public void user_clicks_on_on_the_left_column(String string) throws InterruptedException {
        Thread.sleep(5000);
        contactsFunctionalityPage.cydeo10GroupTab.click();
    }


}
