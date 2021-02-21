package com.endava.soa_5.cucumber.stepdef;

import com.endava.soa_5.actions.SortingProductsAction;
import com.endava.soa_5.cucumber.hook.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortingProductsSteps {
    SortingProductsAction sortingProductsAction = new SortingProductsAction();
    static Logger log = LoggerFactory.getLogger(Hooks.class);

    @Given("User navigate on productsListPage")
    public void userNavigateOnProductsListPage() {
        SortingProductsAction.navigateToProductsPage();
        log.info("User Navigate to Products page");
    }

    @When("user selects sorting by Price: Low to High")
    public void userSelectsSortingByPriceLowToHigh() {
        SortingProductsAction.selectSortingLowToHigh();
        log.info("User selects sorting by price low to high");
    }

    @Then("all displayed products are sorted ascending")
    public void allDisplayedProductsAreSortedAscending() {
        sortingProductsAction.sortAscending();
        assertThat("List is sorted ascending", sortingProductsAction.sortAscending(), is(true));
        log.info("The list of displayed products is sorted ascending");
    }

    @When("user selects sorting by Price: High to Low")
    public void userSelectsSortingByPriceHighToLow() {
        SortingProductsAction.selectSortingHighToLow();
        log.info("User selects sorting by price high to low");
    }

    @Then("all displayed products are sorted descending")
    public void allDisplayedProductsAreSortedDescending() {
        assertThat("List is sorted descending", sortingProductsAction.sortDescending(), is(true));
        log.info("The list of displayed products is sorted descending");
    }
}
