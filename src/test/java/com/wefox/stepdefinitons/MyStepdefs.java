package com.wefox.stepdefinitons;

import com.wefox.pages.BasePage;
import com.wefox.pages.DominoQuickOrder;
import com.wefox.utils.BrowserUtils;
import com.wefox.utils.ConfigurationReader;
import com.wefox.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs extends BasePage {

    DominoQuickOrder dominoQuickOrder = new DominoQuickOrder();

    @Given("customer is on main page")
    public void customerIsOnMainPage() {

        //    String url = ConfigurationReader.get("url");
        Driver.get(ConfigurationReader.get("browser")).get("https://www.dominospizza.es/");

        BrowserUtils.waitFor(5);


    }

    @When("customer  click on start order button")
    public void customerClickOnStartOrderButton() {

        dominoQuickOrder.clickQuickStart();


    }

    @Then("select {string}")
    public void select(String arg0) {

        dominoQuickOrder.selectProvience();
        dominoQuickOrder.selectLocation();
    }

    @And("enter street name")
    public void enterStreetName() {
        dominoQuickOrder.enterstreet();
    }

    @Then("enter {string}")
    public void enter(String arg0) {
        dominoQuickOrder.enterNo();
    }

    @And("click Find store button")
    public void clickFindStoreButton() throws InterruptedException {

        dominoQuickOrder.clickSearchButton();
    }

    @Then("click address button")
    public void clickAddressButton() {
        dominoQuickOrder.clickAdressButton();

    }

    @Then("choose type of the {string}")
    public void chooseTypeOfThe(String arg0) {

        dominoQuickOrder.selectPromotions();
    }

    @And("click I want button")
    public void clickIWantButton() {

        dominoQuickOrder.clickQuiro();
    }
}
