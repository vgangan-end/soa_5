package com.endava.soa_5.cucumber.stepdef;

import com.endava.soa_5.actions.ChangePasswordActions;
import com.endava.soa_5.actions.LogInAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ChangePasswordSteps extends LogInAction {
    Logger log = LoggerFactory.getLogger(ChangePasswordSteps.class);
    ChangePasswordActions changePasswordActions = new ChangePasswordActions();

    @Given("User is logged in")
    public void userIsLoggedIn() {
        changePasswordActions.userLogsIn();
        log.info("User is logged in with old password");
    }

    @When("navigate to Change password page")
    public void userNavigateToChangePasswordPage() {
        changePasswordActions.navigateToChangePasswordPage();
        log.info("User accessed Change Password page");
    }

    @And("user type in the old password")
    public void userTypeInTheOldPassword() {
        changePasswordActions.typeInOldPassword();
        log.info("User typed in old password");
    }

    @And("type in the new password and confirm it")
    public void typeInTheNewPasswordConfirmIt() throws IOException {
        changePasswordActions.typeInNewPassword();
        log.info("User typed in new generated password");
    }

    @And("user clicks on [Change password] button")
    public void userClicksOnChangePasswordButton() {
        changePasswordActions.clickChangePasswordButton();
        log.info("[Change password] button is clicked");
    }

    @Then("confirmation message is displayed about Change password")
    public void confirmationMessageIsDisplayed() {
        changePasswordActions.checkConfirmationMessageIsDisplayed();
       log.info("Confirmation message was displayed");
    }

    @When("user logs in with old password")
    public void userLogsInWithOldPassword() {
        changePasswordActions.logInWithOldPassword();
        log.info("User try to log in with old password");
    }

    @Then("user can't log in with old password")
    public void userCanTLogInWithOldPassword() {
        changePasswordActions.checkWrongCredentialsMessage();
        log.info("Confirmation message about wrong credential is displayed");
    }

    @When("user logs in with new password")
    public void userLogsInWithNewPassword() {
        changePasswordActions.LogInWithNewPassword();
        log.info("User is logged in with new password");
    }

    @Then("user is logged in with new password")
    public void userIsLoggedInWithNewPassword() {
        changePasswordActions.checkThatUserIsLoggedIn();
        log.info("Confirmed that user is logged in");
    }
}