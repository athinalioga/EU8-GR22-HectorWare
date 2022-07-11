package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettings_Mia{

public ProfileSettings_Mia(){

    PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id="expandDisplayName")
    public WebElement profileTab;

    @FindBy(id="settings")
    public WebElement settingsTab;

    @FindBy(id = "languageinput")
    public WebElement languageInput;

    @FindBy(id="en_GB")
    public  WebElement chooseLang;

    @FindBy(id="displayname")
    public  WebElement fullName;

    @FindBy(id="email")
    public  WebElement emailAddress;

    @FindBy(id="phone")
    public WebElement phoneNo;

    @FindBy(id="address")
    public WebElement address;




}
