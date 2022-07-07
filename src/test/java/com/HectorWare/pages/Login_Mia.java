package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Mia {

    public Login_Mia() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement user;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement LogInButton;


    @FindBy(id="message")
    public WebElement ErrorMsj;

    @FindBy(css = "warning wrongPasswordMsg")
    public WebElement WrongPasswordMsg;




}
