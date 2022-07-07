package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarAthinaPage {
    public CalendarAthinaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//a[@aria-label='Calendar']")
    public WebElement calendarButton;

    @FindBy(xpath ="//button[@class='button primary new-event']")
    public WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventBox;

    @FindBy(xpath ="(//input[@name='date'])[1]")
    public  WebElement startedDate;

    @FindBy(xpath = "(//input[@name='date'])[2]")
    public WebElement endedDate;

    @FindBy(xpath = "(//button[@class='mx-btn mx-btn-text'])[1]")
    public WebElement startedPickTimeButton;

    @FindBy(xpath = "(//button[@class='datetime-picker-inline-icon icon icon-timezone'])[1]")
    public WebElement startedTimeZone;

    @FindBy(xpath = "(//button[@class='mx-btn mx-btn-text'])[2]")
    public WebElement endedPickTimeButton;

    @FindBy(xpath = "(//button[@class='datetime-picker-inline-icon icon icon-timezone'])[2]")
    public WebElement endedTimeZone;

    @FindBy(xpath = "//label[@for='allDay']")
    public WebElement allDayButton;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement savaButton;

    @FindBy(xpath ="//*[.='Meting']")
    public WebElement metingVerification;

    @FindBy(xpath ="//*[.='Party']")
    public WebElement partyVerification;


    @FindBy(xpath = "(//td[@title='2022-07-07'])[1]")
    public WebElement Sdate;

    @FindBy(xpath = "//td[@data-day='14']")
    public WebElement Edate;



}
