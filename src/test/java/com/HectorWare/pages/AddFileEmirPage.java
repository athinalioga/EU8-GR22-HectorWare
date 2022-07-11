package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFileEmirPage {


    // Create a constructor to get to the web elements of Add File Properties
    public AddFileEmirPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addFilePlusBtn;

    @FindBy (xpath = "//span[.='Upload file']")
    public WebElement uploadFileBtn;















}
