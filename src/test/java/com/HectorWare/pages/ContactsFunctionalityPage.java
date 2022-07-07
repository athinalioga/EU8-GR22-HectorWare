package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsFunctionalityPage {

    public ContactsFunctionalityPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='Contacts']")
    public WebElement contactsButton;

    @FindBy(id = "new-contact-button")
    public WebElement newContactButton;

    @FindBy(id = "contact-fullname")
    public WebElement contactFullNameInputBox;

    @FindBy(id = "contact-org")
    public WebElement companyInputBox;

    @FindBy(id = "contact-title")
    public WebElement titleInputBox;

    @FindBy(xpath = "//input[@inputmode='tel']")
    public WebElement phoneInputBox;

    @FindBy(xpath = "//input[@inputmode='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//div[contains(text(),\"City\")]/following-sibling::input")
    public WebElement cityInputBox;

    @FindBy(xpath = "//input[@placeholder='Add contact in group']")
    public WebElement groupInputBox;

    @FindBy(xpath = "//span[text()=\"cydeo10\"]")
    public WebElement chosenGroup;

    @FindBy(xpath = "//span[@title='cydeo10']")
    public WebElement cydeo10GroupTab;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> nameInContactList;

}
