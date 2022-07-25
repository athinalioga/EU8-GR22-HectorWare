package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditFile_EmirPage {

    // Create a constructor to get to the web elements of Add File Properties
    public EditFile_EmirPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@href='/remote.php/webdav/file_example_TIFF_1MB.tiff']")
    public WebElement tiffObject;

    @FindBy (xpath = "//a[@class='menu-option option-favorite']")
    public WebElement tiffObjectFavBtn;

    @FindBy (xpath = "//li[@class='action-0']")
    public WebElement tiffObjectRemoveFavBtn;







}
