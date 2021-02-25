package com.endava.soa_5.cucumber.stepdef;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.actions.LogInAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LogInSteps extends BaseClass {
    static Logger log = LoggerFactory.getLogger(LogInSteps.class);
    LogInAction logInAction = new LogInAction();

    @Given("User logs in using correct credentials")
    public void userLogsIn() {
        logInAction.login();
        log.info("User was log in");
    }

    @When("user clicks in Log In button")
    public void userClicksInLogInButton() {
        logInAction.clickLogInButton();
        log.info("[Log in] button is clicked");
    }

    @Then("User is logged in.")
    public void userIsLoggedInWithRightAccount() {
        assertThat("LogIn was successful", logInAction.checkAccountNameIsDisplayed(), is(propertyReader.getPropertyValue("userName")));
        log.info("Log in confirmation is passed");
    }
}
