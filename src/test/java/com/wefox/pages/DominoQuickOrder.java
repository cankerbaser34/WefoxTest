package com.wefox.pages;

import com.wefox.utils.BrowserUtils;
import com.wefox.utils.ConfigurationReader;
import com.wefox.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class DominoQuickOrder extends BasePage {

    public DominoQuickOrder() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }

    //font[contains(text(),'START ORDER')]
    @FindBy(xpath = "//nav//button")
    public WebElement orderStartButton;

    @FindBy(xpath = "//select[@name='IdProvinciaSeleccionada']")
    public WebElement provienceButton;

    @FindBy(css = "#IdLocalidadSeleccionada")
    public WebElement locationButton;

    //label[3]//div[1]
    @FindBy(xpath = "//input[@spellcheck='false']")
    public WebElement streetInput;

    //font[contains(text(),'Find stores')]

    @FindBy(xpath = "//body//section//label[4]")
    public WebElement noInput;

    @FindBy(xpath = "//font[contains(text(),'Find stores')]")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@name='domicilio']")
    public WebElement adressButton;

    @FindBy(xpath = "//section/div/div/div/div/div/div[1]")
    public WebElement selectPromotions;

    @FindBy(xpath = "//section//div//div//section//div[6]")
    public WebElement menusOption;

    @FindBy(xpath = "//section/div/div/ul/ul/li/div/a[1]")
    public WebElement quiroBUtton;


    public void clickQuickStart() {
        orderStartButton.click();
        BrowserUtils.waitFor(5);

    }

    public void selectProvience() {
        Select select = new Select(provienceButton);

        select.selectByVisibleText("BARCELONA");

        BrowserUtils.waitFor(4);

    }

    public void selectLocation() {

        Select select1 = new Select(locationButton);

        select1.selectByVisibleText("TERRASSA");

        BrowserUtils.waitFor(5);

    }

    public void enterstreet() {


        streetInput.click();
        BrowserUtils.waitFor(2);
        streetInput.sendKeys("CALLE ANTONI TORRELLA");
        BrowserUtils.waitFor(3);
        streetInput.sendKeys(Keys.TAB);
        BrowserUtils.waitFor(3);


    }

    public void enterNo() {


        // noInput.click();
        BrowserUtils.waitFor(2);

        // noInput.sendKeys(Keys.ENTER);


    }

    public void clickSearchButton() throws InterruptedException {
        noInput.sendKeys("2");

        BrowserUtils.waitFor(4);

        noInput.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(5);
        // searchButton.click();
        BrowserUtils.waitFor(4);
        // clickAlert();

    }

    public void clickAdressButton() {
        adressButton.click();

        BrowserUtils.waitFor(5);

    }


    public void selectPromotions() {

        selectPromotions.click();

        BrowserUtils.waitFor(5);

        menusOption.click();

        BrowserUtils.waitFor(3);
    }


    public void clickQuiro() {

        quiroBUtton.click();
    }

}

