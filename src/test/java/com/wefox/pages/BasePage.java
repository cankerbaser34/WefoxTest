package com.wefox.pages;

import com.wefox.utils.Driver;
import com.wefox.utils.ConfigurationReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;




public class BasePage {



    public BasePage() {
        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }

    public void scrollDown(WebElement link) {

        try {

            Thread.sleep(2000);

        } catch (Exception e) {


            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get(ConfigurationReader.get("url"));
            javascriptExecutor.executeScript("arguments[0]scrollIntoView(true)", link);

        }
    }



}
