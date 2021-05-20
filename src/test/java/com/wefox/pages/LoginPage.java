package com.wefox.pages;

import com.wefox.utils.BrowserUtils;
import com.wefox.utils.ConfigurationReader;
import com.wefox.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);

    }


    @FindBy(name = "username")
    public WebElement userInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement loginBtn;

    @FindBy(xpath = "//h3[normalize-space()='Hi, Demo User']")
    public WebElement welcomeText;

    @FindBy(xpath = "//div[contains(text(),'Invalid Email or Password')]")
    public WebElement warningMessage;


    @FindBy(xpath = "//a[normalize-space()='Demo']")
    public WebElement demoMainButton;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement signOutButton;


    public void login(String username, String password) {

        try {
            userInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginBtn.click();
            BrowserUtils.waitFor(5);
        } catch (Exception e) {

            System.out.println("Something went wrong");
        }


    }

    public void verifyWelcomeMessage() {

        String welcomeTMessage = welcomeText.getText();

        Assert.assertEquals("Hi, Demo User", welcomeTMessage);
    }

    public void signOut() {

        demoMainButton.click();
        BrowserUtils.waitFor(3);
        signOutButton.click();
    }

    public void verifyWarningMessage() {

        String textWarning = warningMessage.getText();

        Assert.assertEquals("Invalid Email or Password", textWarning);


    }

}
