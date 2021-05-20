package com.wefox.pages;

import com.wefox.utils.BrowserUtils;
import com.wefox.utils.ConfigurationReader;
import com.wefox.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelSearch extends BasePage {

    public HotelSearch() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);


    }

    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement mainPage;

    @FindBy(id = "s2id_autogen16")
    public WebElement userInput;

    @FindBy(xpath = "//div[@id='select2-drop']//input[@type='text']")
    public WebElement sendInput;

    @FindBy(xpath = "//body/div/div/input[1]")
    public WebElement sendInputEnter;

    @FindBy(xpath = "//form[@name='HOTELS']//div//div//div//button[@type='submit'][normalize-space()='Search']")
    public WebElement searchButton;


    @FindBy(xpath = "//input[@id='checkin']")
    public WebElement calenderInput;


    @FindBy(xpath = "//input[@id='checkout']")
    public WebElement calenderCheckOutInput;

    @FindBy(xpath = "//label[@for='70']")
    public WebElement selectRoomCheckbox;

    @FindBy(xpath = "//select[@name='roomscount[9]")
    public WebElement selectRoomNumOption;

    @FindBy(xpath = "//button[normalize-space()='Book Now']")
    public WebElement bookButton;


    public void searhHotelName() {

        userInput.click();
        BrowserUtils.waitFor(2);
        sendInput.sendKeys("Tria");
        BrowserUtils.waitFor(3);
        sendInputEnter.sendKeys(Keys.ENTER);


    }

    public void enterChekinDate() {

        try {
            calenderInput.click();
            calenderInput.clear();
            BrowserUtils.waitFor(3);
            calenderInput.sendKeys("25/05/2021");
            calenderInput.sendKeys(Keys.TAB);
            BrowserUtils.waitFor(3);
        } catch (Exception e) {

            System.out.println("Date entry error");
        }


    }

    public void enterCheckOutdate() {

        try {
            calenderCheckOutInput.click();
            calenderCheckOutInput.clear();
            BrowserUtils.waitFor(3);
            calenderCheckOutInput.sendKeys("27/05/2021", Keys.ENTER);
            BrowserUtils.waitFor(3);
        } catch (Exception e) {

            System.out.println("Out-date entry error");
        }


    }

    public void setClickSearchButton() {
        searchButton.click();
    }

    public void navToMainPage() {
        mainPage.click();
    }

    public void selectRoom() {

        scrollDown(selectRoomCheckbox);
        BrowserUtils.waitFor(5);
        selectRoomCheckbox.click();
        BrowserUtils.waitFor(3);
    }

    public void selectnumberOfRoom(String roomValue) {

        Select select = new Select(selectRoomNumOption);

        select.selectByValue(roomValue);
    }

    public void clickForBooking() {

        bookButton.click();
    }
}

