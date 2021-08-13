package com.wefox.stepdefinitons;

import com.wefox.pages.BasePage;
import com.wefox.pages.DominoQuickOrder;
import com.wefox.pages.Dominorder;
import com.wefox.utils.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateToPizza extends BasePage {

    Dominorder dominorder = new Dominorder();

    @When("customer click on {string}")
    public void customerClickOn(String arg0) {

        dominorder.clickCreatePizza();

    }

    @Then("customer can select size of pizza")
    public void customerCanSelectSizeOfPizza() {

        dominorder.selectSize();

    }

    @And("customer selects {string}")
    public void customerSelects(String arg0) throws InterruptedException {

        dominorder.noSalsaClick();
        BrowserUtils.waitFor(3);
        dominorder.selectChhese();
        dominorder.clickMoreAtun();
    }

    @Then("customer clicks  add button")
    public void customerClicksAddButton() throws InterruptedException {
        dominorder.clickAddButton();
    }
}
