package com.wefox.pages;

import com.wefox.utils.BrowserUtils;
import com.wefox.utils.ConfigurationReader;
import com.wefox.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dominorder extends BasePage {

    public Dominorder() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);


    }

    @FindBy(xpath = "//a[normalize-space()='Crea tu pizza']")
    WebElement buttonCreatePizze;

    @FindBy(xpath = "//select[@name='Cantidad']")
    WebElement selectsizeDrop;

    @FindBy(css = "#selectMasaDet")
    WebElement selectcheese;

    @FindBy(xpath = "//label[@for='Sin salsa_1']")
    WebElement noSalsa;

    @FindBy(xpath = "//li[@data-ing='Pimiento verde']/span[1]")
    WebElement addatun;

    @FindBy(xpath = "//body//div//li[@data-ing='Pollo a la parrilla']//span//span[2]")
    WebElement addChicken;


    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement clickCookie;
    @FindBy(xpath = "//a[normalize-space()='Recalcular']")
    WebElement addcalculate;


    @FindBy(css = "#addCreaPizza")
    WebElement addClick;


    public void clickCreatePizza() {
        buttonCreatePizze.click();
    }

    public void selectSize() {

        Select select = new Select(selectsizeDrop);

        select.selectByVisibleText("Familiar");
    }

    public void selectChhese() {

        Select select2 = new Select(selectcheese);

        select2.selectByVisibleText("Original");

    }

    public void noSalsaClick() throws InterruptedException {
        noSalsa.click();
        BrowserUtils.waitFor(10);
      //  clearCookies();   clickCookie.click();

    }

    public void clickMoreAtun() {
        scrollDown(addatun);
        // scrollBypixel();
        BrowserUtils.waitFor(5);
       // addChicken.click();
        // addChicken.click();

    }

    public void clickAddButton() throws InterruptedException {
        scrollDown(addcalculate);
        BrowserUtils.waitFor(4);
        addcalculate.click();
        BrowserUtils.waitFor(3);
       // addClick.click();

    }
}
