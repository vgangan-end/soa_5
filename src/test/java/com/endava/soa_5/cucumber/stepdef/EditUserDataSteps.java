package com.endava.soa_5.cucumber.stepdef;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.actions.EditUserDataPageActions;
import com.endava.soa_5.actions.GenericActions;
import com.endava.soa_5.context.ScenarioContext;
import com.endava.soa_5.page_objects.LogInPageObject;
import com.endava.soa_5.page_objects.MyAccountPage.CustomerInfoPage;
import com.endava.soa_5.page_objects.enums.CustomerInfoValidationErrorsEnum;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.core.Is;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static com.endava.soa_5.context.Keys.CUSTOMER_INFO;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EditUserDataSteps extends BaseClass {
    Logger log = LoggerFactory.getLogger(this.getClass());
    ScenarioContext context = ScenarioContext.getScenarioContext();

    private EditUserDataPageActions editUserDataPageActions = new EditUserDataPageActions();
    private GenericActions genericActions = new GenericActions();
    private CustomerInfoPage customerInfoPage = new CustomerInfoPage();
    private LogInPageObject logInPageObject = new LogInPageObject(driver);

    @Given("user access My Account page")
    public void userAccessMyAccountPage() {
        genericActions.waitForElement(logInPageObject.getAccountName());
        editUserDataPageActions.clickAccountNameButton();
        log.info("User navigates to My account page");
    }

    @When("user fills in the customer info with the following data:")
    public void userFillsInTheCustomerInfoWithTheFollowingData(Map<String, String> userData) {
        editUserDataPageActions.fillInCustomerInfo(userData);
        context.saveData(CUSTOMER_INFO, userData);
        log.info("User fills in the customer info with valid data");
    }

    @When("user clicks on Save button")
    public void userClicksOnSaveButton() {
        genericActions.waitForElement(customerInfoPage.getSaveCustomerInfoButton());
        editUserDataPageActions.clickSaveCustomerInfoButton();
        log.info("User clicks on Save customer information button");
    }

    @Then("user's updated information is saved")
    public void userSUpdatedInformationIsSaved() {
        Map<String, String> userData = (Map<String, String>) context.getData(CUSTOMER_INFO);
        if (userData.get("First name") != null) {
            assertThat(editUserDataPageActions.getFirstNameText(), is(userData.get("First name")));
        }
        if (userData.get("Last name") != null) {
            assertThat(editUserDataPageActions.getLastNameText(), is(userData.get("Last name")));
        }
        if (userData.get("Gender") != null) {
            assertThat(editUserDataPageActions.getGenderCheck(userData.get("Gender")), is("true"));
        }
        log.info("User's updated information is saved");
    }

    @When("user clears customer info data from Your Personal Details")
    public void userClearsCustomerInfoDataFrom() {
        editUserDataPageActions.clearExistingText();
        log.info("All text fields from Customer info page are empty.");
    }

    @Then("{} message is displayed for the First Name text field")
    public void checkFirstNameErrorMessage(CustomerInfoValidationErrorsEnum error) {
        genericActions.waitForElement(customerInfoPage.getFirstNameIsRequiredError());
        assertThat("First Name Error is displayed correctly", editUserDataPageActions.getFirstNameErrorMessage(), Is.is(error.getErrorMessage()));
        log.info("Expected error for First Name text field appears");
    }

    @Then("{} message is displayed for the Last Name text field")
    public void checkLastNameErrorMessage(CustomerInfoValidationErrorsEnum error) {
        genericActions.waitForElement(customerInfoPage.getLastNameIsRequiredError());
        assertThat("Last Name Error is displayed correctly", editUserDataPageActions.getLastNameErrorMessage(), Is.is(error.getErrorMessage()));
        log.info("Expected error for Last Name text field appears");
    }

    @Then("{} message is displayed for the Email text field")
    public void checkEmailErrorMessage(CustomerInfoValidationErrorsEnum error) {
        genericActions.waitForElement(customerInfoPage.getEmailIsRequiredError());
        assertThat("Email Error is displayed correctly", editUserDataPageActions.getEmailErrorMessage(), Is.is(error.getErrorMessage()));
        log.info("Expected error for Email text field appears");
    }
}
