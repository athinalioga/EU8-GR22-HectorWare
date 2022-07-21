package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.Web_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy(xpath ="//*[.='Meeting']")
    public WebElement metingVerification;

    @FindBy(xpath ="//*[.='Party']")
    public WebElement partyVerification;


    @FindBy(xpath = "(//td[@title='2022-07-07'])[1]")
    public WebElement Sdate;

    @FindBy(xpath = "//td[@data-day='14']")
    public WebElement Edate;

    @FindBy(xpath = "//div[@class='fc-event-title-container']")
    public WebElement partyDelete;

    @FindBy(xpath = " //div[@class='event-popover__buttons']/button[1]")
    public WebElement moreButton;

    @FindBy(xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[2]")
    public WebElement threeButton;

    @FindBy(xpath = "//li[@class='action active']")
    public WebElement deleteButton;

//button[@class='action-button focusable'])[6]
//span[@class='action-button__text'])[3]
//button[@class='action-button focusable']

    @FindBy(xpath = "//button[@class='datepicker-button-section__datepicker-label button datepicker-label']")
    public WebElement dateModule;

    @FindBy(xpath = "//button[@aria-label='Actions']")
    public WebElement ComboboxListButton;

    @FindBy(css = ".fc-scrollgrid-sync-inner>a")
    public WebElement datesHeader;

    @FindBy(xpath = "//ul[@id='menu-zonwp']/li/button/span[2]")
    public List<WebElement> ComboboxOptions;


    public List<String> getTextFromComboboxOptions(){
        List<String>text=new ArrayList<>();
        text.add(Driver.getDriver().findElement(By.xpath("//*[.='Day']")).getText());
       Web_Utils.waitFor(5);
        text.add(Driver.getDriver().findElement(By.xpath("//*[.='Week']")).getText());
        Web_Utils.waitFor(5);
        text.add(Driver.getDriver().findElement(By.xpath("//*[.='Month']")).getText());
        Web_Utils.waitFor(5);
        text.add(Driver.getDriver().findElement(By.xpath("//*[.='List']")).getText());
        Web_Utils.waitFor(5);
        return  text;
    }

    public void clickComboboxOption(String option){
        Web_Utils.waitFor(2);
        ComboboxListButton.click();
        ComboboxListButton.click();
        Driver.getDriver().findElement(By.xpath("//*[text()='"+option+"']")).click();
    }
}
