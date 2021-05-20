package com.wefox.stepdefinitons;

import com.wefox.pages.LoginPage;
import com.wefox.utils.BrowserUtils;
import com.wefox.utils.ConfigurationReader;
import com.wefox.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the  login page")
    public void the_user_is_on_the_login_page() {

        String url = ConfigurationReader.get("url");
        Driver.get(ConfigurationReader.get("browser")).get(url);


    }

    //the user enters the "username" and "password"
    @When("the user enters the {string} and {string}")
    public void the_user_enters_the_username_and_password(String username1, String password1) {

        String username = ConfigurationReader.get(username1);
        String password = ConfigurationReader.get(password1);

        loginPage.login(username, password);

    }

    @Then("the user should see the welcome text")
    public void the_user_should_see_the_welcome_text() {

        BrowserUtils.waitFor(2);
        loginPage.verifyWelcomeMessage();


    }


    @When("the users enters {string} {string}")
    public void the_users_enters(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }


    @And("the user should be able to logout by clicking logout button")
    public void theUserShouldBeAbleToLogoutByClickingLogoutButton() {

        loginPage.signOut();
    }

    @Then("the users should get warning message as Invalid Email or Password")
    public void theUsersShouldGetWarningMessageAsInvalidEmailOrPassword() {

        loginPage.verifyWarningMessage();


    }
}
