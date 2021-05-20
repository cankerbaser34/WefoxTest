package com.wefox.stepdefinitons;

import com.wefox.utils.ConfigurationReader;
import com.wefox.utils.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setUp() {
        Driver.get(ConfigurationReader.get("url")).manage().window().maximize();
    }

//    @After
//    public void tearDown(Scenario scenario) {
//
//        if (scenario.isFailed()) {
//
//            final byte[] screenshot = ((TakesScreenshot) Driver.get(ConfigurationReader.get("url"))).getScreenshotAs(OutputType.BYTES);
//
//            scenario.attach(screenshot, "image/png", "screenshot");
//
//        }
//
//        Driver.closeDriver();
//
//    }


}
