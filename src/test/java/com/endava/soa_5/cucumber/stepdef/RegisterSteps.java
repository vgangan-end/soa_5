package com.endava.soa_5.cucumber.stepdef;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.actions.GenericActions;
import com.endava.soa_5.page_objects.HomePage;
import com.endava.soa_5.page_objects.enums.PageTitlesEnum;
import com.endava.soa_5.page_objects.RegisterPage;
import com.endava.soa_5.page_objects.enums.RegisterPageEnum;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Slf4j
public class RegisterSteps extends BaseClass {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    GenericActions genericActions = new GenericActions();

    @Given("{} page is displayed")
    public void pageIsDisplayed(PageTitlesEnum title) {
        genericActions.assertPageIsDisplayed(title.getTitle());
        log.info(title + " page is displayed");
    }

    @When("user clicks Homepage Register button")
    public void userClicksHomepageRegisterButton() {
        genericActions.clickOnElement(homePage.getRegisterButton());
        log.info("User clicks Register button on Homepage");
    }

    @When("user chooses {}")
    public void userChoosesGender(RegisterPageEnum css) {
        genericActions.clickOnElement(registerPage.getRegisterElement(css.getCss()));
        log.info("User chooses " + css);
    }

    @And("user clicks Register page Register button")
    public void userClicksRegisterPageRegisterButton() {
        genericActions.clickOnElement(registerPage.getRegisterButton());
        log.info("User clicks Rgister after completing fields with data");
    }

    @Then("confirmation message is displayed")
    public void confirmationMessageIsDisplayed() {
        genericActions.assertElementIsDisplayed("//div[contains(text(),'Your registration completed')]");
        log.info("\"Your registration completed\" confirmation message is displayed");
    }

    @And("user fills the form with data:")
    public void userFillsTheForm(DataTable dataTable) {
        Map<String, String> parsedDataMap = dataTable.asMap(String.class, String.class);
        Map<RegisterPageEnum, String> finalMap = new HashMap<>();

        for (Map.Entry<String, String> entry : parsedDataMap.entrySet()) {
            RegisterPageEnum pageEnum = RegisterPageEnum.valueOf(entry.getKey());
            finalMap.put(pageEnum, entry.getValue());
        }
        registerPage.fillRegisterForm(finalMap);
        log.info("The user fills the registration form with data");
    }

    @Then("two warnings are displayed")
    public void twoWarningsAreDisplayed() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        assertThat("Wrong number of messages 'Password is required'",
                driver.findElements(By.xpath("//span[contains(text(), 'Password is required')]")).size(),
                is(2));
        log.info("\"Password is required\" warnings are displayed for both fields");
    }
}