package com.endava.soa_5.cucumber.stepdef;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.actions.FilterByPriceActions;
import com.endava.soa_5.actions.GenericActions;
import com.endava.soa_5.page_objects.FilterByPricePage;
import com.endava.soa_5.page_objects.HomePage;
import com.endava.soa_5.page_objects.enums.PageTitlesEnum;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FilterByPriceSteps extends BaseClass {

    Logger log = LoggerFactory.getLogger(this.getClass());

    private GenericActions genericActions = new GenericActions();
    private HomePage homePage = new HomePage();
    private FilterByPriceActions filterByPriceActions = new FilterByPriceActions();
    private FilterByPricePage filterByPricePage = new FilterByPricePage();

    @Given("user navigates to {} category page")
    public void userNavigatesToCategoryPage(PageTitlesEnum categoryName) {
        filterByPriceActions.clickCategoryButton(categoryName);
        filterByPriceActions.booksPageTitleIsDisplayed();
        log.info("User navigates to BOOKS category page");
    }

    @Given("Filter by price title is displayed")
    public void filterByPriceTitleIsDisplayed() {
        filterByPriceActions.filterByPriceTitleIsDisplayed();
        log.info("Filter by price title is displayed");
    }

    @When("user filters products by price under 25")
    public void userFiltersProductsByPriceUnder25() {
        filterByPriceActions.clickUnder25PriceButton();
        log.info("User filter the products with the price under 25.00");
    }

    @Then("only the products with the price {} {double} are displayed")
    public void onlyTheProductsWithThePriceAreDisplayed(String limitType, double priceLimit) {
        boolean isLowerThanPriceLimit = filterByPriceActions.getIsUnderPriceLimit(limitType);
        boolean isFiltered = filterByPriceActions.filterByPrice(isLowerThanPriceLimit, priceLimit);
        assertThat("Products are displayed accordingly to their filter type", isFiltered, is(true));
    }

    @When("user clicks Remove Filter Price button")
    public void userClicksRemovePriceFilterButton() {
        filterByPriceActions.clickRemoveFilterButton();
        log.info("User removes the filter for the products prices");
    }

    @When("user filters products by price over 50")
    public void userFiltersProductsByPriceOver50() {
        filterByPriceActions.clickOver50PriceButton();
        log.info("User filters the products with the price under 50");
    }

    @Then("all the products are not filtered by price")
    public void allTheProductsAreNotFilteredByPrice() {
        boolean isNotFiltered = filterByPriceActions.filterByPrice(false, 0.00);
        assertThat("Products are no longer filtered by price", isNotFiltered, is(true));
        log.info("The products are not filtered by price");
    }
}
