package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S4_ProfileSettings_Mia {

    public S4_ProfileSettings_Mia(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".logo.logo-icon")
    public WebElement logo;

    @FindBy(className = "creatable")
    public WebElement loader;

    public void navigateMenuTab(String tabName){
        Driver.getDriver().findElement(By.xpath("(//a[@aria-label='"+tabName+"'])[1]")).click();
    }

    @FindBy(xpath = "//*[@id='expand']")
    public WebElement dropdown;

    @FindBy(partialLinkText = "Settings")
    public WebElement settings;

    @FindBy(id = "selectavatar")
    public WebElement selectedavatar;

    @FindBy(xpath = "//*[@id=\"picker-filestable\"]/tbody/tr[6]/td[1]/span")
    public WebElement selectedpicture;

    @FindBy(xpath = "//*[@id=\"body-settings\"]/div[6]/div[2]/button")
    public WebElement choosebtn;

    @FindBy(id = "sendcropperbutton")
    public WebElement croppedpic;


}
