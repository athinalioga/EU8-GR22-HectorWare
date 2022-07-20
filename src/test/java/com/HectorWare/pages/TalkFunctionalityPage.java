package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkFunctionalityPage {

    public TalkFunctionalityPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//a[@href='https://qa.hectorware.com/index.php/apps/spreed/']")
    public WebElement talkModuleSign;

    @FindBy(className = "app-navigation__list")
    public WebElement chatSearchBox;

    @FindBy(xpath = "//button[@aria-label='Create a new group conversation']")
    public WebElement plusButton;

    @FindBy(className = "modal-container")
    public WebElement popUp;

    @FindBy(xpath = "//input[@placeholder='Conversation name']")
    public WebElement conversationName;

    @FindBy(className = "conversation-type__label")
    public WebElement joinLink;

    @FindBy(xpath = "//*[contains(text(), 'Add participants')]")
    public WebElement addParticipants;


    @FindBy(className = "participant-row__user-name")
    public WebElement contactsNames;


    @FindBy(xpath = "//span[.='Employee10']")
    public WebElement addEmployee10;

    @FindBy(xpath = "//span[.='Employee101']")
    public WebElement addEmployee101;

    @FindBy(xpath = "//span[.='Employee102']")
    public WebElement addEmployee102;

    @FindBy(className = "navigation__button-right")
    public WebElement createConversationButton;

    @FindBy(className = "confirmation__warning")
    public WebElement allSetWarning;

    @FindBy(xpath = "//label[@for='copy-link']")
    public WebElement conversationLink;

    @FindBy(xpath = "//button[contains(text(),'Close')]")
    public WebElement closeButton;
}
