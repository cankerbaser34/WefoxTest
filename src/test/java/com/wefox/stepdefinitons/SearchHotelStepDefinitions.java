package com.wefox.stepdefinitons;

import com.wefox.pages.BasePage;
import com.wefox.pages.HotelSearch;
import com.wefox.utils.BrowserUtils;
import com.wefox.utils.ConfigurationReader;
import com.wefox.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotelStepDefinitions {

    HotelSearch hotelSearch = new HotelSearch();


    @And("the user navigates to main page")
    public void theUserNavigatesToMainPage() {

        BrowserUtils.waitFor(2);

        hotelSearch.navToMainPage();
    }

    @Then("the customer  enters hotelname")
    public void theCustomerEntersHotelname() {


    }

    @Then("the customer  enters {string}")
    public void theCustomerEnters(String hotelname) {
        BrowserUtils.waitFor(4);
        hotelSearch.searhHotelName();
    }

    @Then("the customer select checkin date")
    public void the_customer_select_checkin_date() {

        hotelSearch.enterChekinDate();

    }

    @Then("the customer selects chectout date")
    public void the_customer_selects_chectout_date() {

        hotelSearch.enterCheckOutdate();

    }

    @Then("the customer clicks select button")
    public void the_customer_clicks_select_button() {

        hotelSearch.setClickSearchButton();

    }


    @And("the customer selects the room and  selectNumberofRoom")
    public void theCustomerSelectsTheRoomAndSelectNumberofRoom() {


        hotelSearch.selectRoom();
        hotelSearch.selectnumberOfRoom("1");
    }

    @Then("the customer clicks booking button")
    public void theCustomerClicksBookingButton() {

        hotelSearch.clickForBooking();
    }


}
