package com.HectorWare.pages;

import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mahmut_Calendar_Page {
    @FindBy(xpath = "(//tbody/tr[2])")
    public WebElement eventTable;
    @FindBy(xpath = "//button[contains(text(),'More')]")
    public WebElement moreOption;
    @FindBy(id = "app-sidebar")
    public WebElement sideBar;
    @FindBy(xpath = "//textarea[@title='Location']")
    public WebElement locationBar;

    public void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        WebElement username = Driver.getDriver().findElement(By.id("user"));
        username.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        Driver.getDriver().findElement(By.id("submit-form")).click();

    }
    public void navigateToCalendar(){
        WebElement calendar= Driver.getDriver().findElement(By.xpath("(//*[@aria-label='Calendar'])[1]"));
        calendar.click();


    }
    public void clickEvent(){
        WebElement event= Driver.getDriver().findElement(By.xpath("//button[contains(text(),'+ New event')]"));
        event.click();

    }
    public void eventTitle(String title){
        WebElement eventTitle=Driver.getDriver().findElement(By.xpath("//*[@placeholder='Event title']"));
        eventTitle.sendKeys(title);
        WebElement event= Driver.getDriver().findElement(By.xpath("//button[contains(text(),'Save')]"));
        event.click();


    }
}
