package com.wefox.pages;

import com.wefox.utils.Driver;
import com.wefox.utils.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage() {
        PageFactory.initElements(Driver.get(ConfigurationReader.get("url")), this);
    }

    public static void clearCookies() {

        Driver.get(ConfigurationReader.get("url")).manage().deleteAllCookies();
    }

    public void scrollBypixel(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");

    }

    public void scrollDown(WebElement link) {

        try {

            Thread.sleep(2000);

        } catch (Exception e) {


            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get(ConfigurationReader.get("url"));
            javascriptExecutor.executeScript("arguments[0]scrollIntoView(true)", link);

        }
    }

    public void clickAlert() throws InterruptedException {


        // Switching to Alert
        driver =new ChromeDriver();
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert
        alert.accept();


    }


}
