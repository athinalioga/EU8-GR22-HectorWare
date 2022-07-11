package com.HectorWare.pages;

import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class AddFileEmirPage {


    // Create a constructor to get to the web elements of Add File Properties
    public AddFileEmirPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addFilePlusBtn;

    @FindBy (xpath = "//span[.='Upload file']")
    public WebElement uploadFileBtn;

    @FindBy (id = "user")
    public WebElement loginUser;

    @FindBy (id = "password")
    public WebElement loginPass;

    @FindBy (id = "submit-form")
    public WebElement loginBtn;

    @FindBy (xpath = "//a[@href='/remote.php/webdav/Guitar%20House%20-%20josh%20pan.mp3']")
    public WebElement upTo10MBfileAudio;

    @FindBy (xpath = "//a[@href='/remote.php/webdav/file_example_TIFF_1MB.tiff']")
    public WebElement validImageFile;

    @FindBy (xpath = "//a[@href='/remote.php/webdav/a.docx']")
    public WebElement validDocumentFile;

    @FindBy (xpath = "//a[@href='/remote.php/webdav/file_example_WAV_1MG.wav']")
    public WebElement validAudioFile;

    @FindBy (xpath = "//span[.='Purple Yellow Illustration Fauget Creative Instagram Story']")
    public WebElement validVideoFile;


    public void login (){

        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        loginUser.sendKeys("Employee2");
        loginPass.sendKeys("Employee123");
        loginBtn.click();
    }

    public void upTo10MBFileUpload() throws AWTException {
        Robot rb = new Robot();

        uploadFileBtn.click();

        rb.setAutoDelay(2000);

        // copying File path to Clipboard
        StringSelection upTo10MBfileAudioPath = new StringSelection("C:\\Users\\emirb\\Desktop\\SDET\\HectorWare\\Sprint 3\\Add File Function\\Guitar House - josh pan.mp3");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upTo10MBfileAudioPath, null);

        rb.setAutoDelay(2000);


        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }

    public void validImageFileUpload() throws AWTException {
        Robot rb = new Robot();

        uploadFileBtn.click();

        rb.setAutoDelay(2000);

        // copying File path to Clipboard
        StringSelection validImagePath = new StringSelection("C:\\Users\\emirb\\Desktop\\SDET\\HectorWare\\Sprint 3\\Add File Function\\file_example_TIFF_1MB.tiff");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(validImagePath, null);

        rb.setAutoDelay(2000);


        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }

    public void validDocumentFileUpload() throws AWTException {
        Robot rb = new Robot();

        uploadFileBtn.click();

        rb.setAutoDelay(2000);

        // copying File path to Clipboard
        StringSelection validDocumentPath = new StringSelection("C:\\Users\\emirb\\Desktop\\SDET\\HectorWare\\Sprint 3\\Add File Function\\a.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(validDocumentPath, null);

        rb.setAutoDelay(2000);


        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }

    public void validAudioFileUpload() throws AWTException {
        Robot rb = new Robot();

        uploadFileBtn.click();

        rb.setAutoDelay(2000);

        // copying File path to Clipboard
        StringSelection validAudioPath = new StringSelection("C:\\Users\\emirb\\Desktop\\SDET\\HectorWare\\Sprint 3\\Add File Function\\file_example_WAV_1MG.wav");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(validAudioPath, null);

        rb.setAutoDelay(2000);


        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }

    public void validVideoFileUpload() throws AWTException {
        Robot rb = new Robot();

        uploadFileBtn.click();

        rb.setAutoDelay(2000);

        // copying File path to Clipboard
        StringSelection validVideoPath = new StringSelection("C:\\Users\\emirb\\Desktop\\SDET\\HectorWare\\Sprint 3\\Add File Function\\Purple Yellow Illustration Fauget Creative Instagram Story.mp4");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(validVideoPath, null);

        rb.setAutoDelay(2000);


        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }



















}
