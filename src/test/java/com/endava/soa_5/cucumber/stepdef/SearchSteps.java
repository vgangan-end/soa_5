package com.endava.soa_5.cucumber.stepdef;

import com.endava.soa_5.actions.GenericActions;
import com.endava.soa_5.actions.SearchPageActions;
import com.endava.soa_5.context.ScenarioContext;
import com.endava.soa_5.page_objects.SearchPage;
import com.endava.soa_5.page_objects.enums.CategoryEnum;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.endava.soa_5.context.Keys.SEARCH_PAGE_CONFIRMATION;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchSteps extends GenericActions {
    Logger log = LoggerFactory.getLogger(this.getClass());
    SearchPageActions searchPageActions = new SearchPageActions();
    SearchPage searchPage = new SearchPage();

    @Given("^user insert (.+) into search field$")
    public void userInsertProductIntoSearchField(String searchProduct) {
        clickOnElement(searchPage.getSearchField());
        log.info("---------------------User clicks on search field--------------------");
        searchPageActions.searchProduct(searchProduct);
        log.info("---------------------User inserts keyword: \"" + searchProduct + "\" in search field--------------------");
    }

    @When("^user send search request$")
    public void userSendSearchRequest() {
        searchPageActions.submitSearch();
        log.info("---------------------User clicks on search button--------------------");
    }

    @Then("^list contain (.+) are returned$")
    public void listOfProductsAreReturned(String searchProduct) {
        assertEquals(searchPageActions.isProductInList(searchProduct),
                (true));
        log.info("---------------------List of products which contains keyword: \"" + searchProduct + "\" in product name is returned--------------------");
    }

    @And("^user select in advanced search (.+)$")
    public void userSelectInAdvancedSearchCategory(CategoryEnum categoryEnum) {
        clickOnElement(searchPage.getAdvancedSearchCheckBox());
        searchPageActions.selectFromDropDown(categoryEnum);
        log.info("---------------------User clicks advanced search and selects a value: \"" + categoryEnum.toString() + "\" from drop down menu--------------------");
    }

    @Then("warning message will is displayed")
    public void warningMessageIsDisplayed() {
        assertThat("Warning message will is displayed", searchPageActions.getWarningMessage(), is("Search term minimum length is 3 characters"));
        log.info("---------------------Warning message is displayed when user inserts less than 3 characters--------------------");
    }

    @Then("user is on search page")
    public void confirmationOnSearchPage() {
        assertEquals(ScenarioContext.getScenarioContext().getData(SEARCH_PAGE_CONFIRMATION),
                (searchPageActions.getPageConfirmation()), "user is on search page");
        log.info("---------------------User is on search page--------------------");
    }
}
