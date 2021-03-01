package com.endava.soa_5.cucumber.stepdef;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.actions.GenericActions;
import com.endava.soa_5.actions.JewelryPageActions;
import com.endava.soa_5.actions.ShoppingCartActions;
import com.endava.soa_5.page_objects.HomePage;
import com.endava.soa_5.page_objects.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ShoppingCartSteps extends BaseClass {
    JewelryPageActions jewelryPageActions = new JewelryPageActions();
    ShoppingCartActions shoppingCartActions = new ShoppingCartActions();
    Logger log = LoggerFactory.getLogger(ShoppingCartSteps.class);
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    GenericActions genericActions = new GenericActions();

    @When("user clicks Jewelry menu")
    public void userClicksJewelryOption() {
        jewelryPageActions.accessPage();
        log.info("The [JEWELERY] button is clicked");
    }


    @And("user adds diamond heart to shopping cart")
    public void userAddsDiamondHeartToShoppingCart() {
        jewelryPageActions.addToCartDiamondHeart();
        log.info("The [Add to cart] button is clicked");
    }

    @And("user goes to shopping cart")
    public void userGoesToShoppingCart() {
        shoppingCartActions.accessPage();
        log.info("The [Shopping cart] button is clicked");
    }

    @Then("user validates diamond heart was added")
    public void userValidatesDiamondHeartWasAdded() {
        assertThat("Diamond heart was added successfully", shoppingCartActions.validateDiamondHeartIsDisplayed(), is(true));
        log.info("Item is successfully added to Shopping Cart");
    }

    @And("user clears quantity field")
    public void userClearsQuantityField() {
        shoppingCartActions.clearQuanityField();
        log.info("The Item quantity field is cleared");
    }

    @When("user changes product quantity")
    public void userChangesProductQuantity() {
        shoppingCartActions.clickOnItemsCartQuantityField();
        log.info("The Item quantity is changed");
    }

    @And("user updates shopping cart")
    public void userUpdatesShoppingCart() {
        shoppingCartActions.clickOnUpdateShippingCart();
        log.info("The [Update Shopping Cart] button is clicked");
    }

    @Then("user validates product quantity is changed")
    public void userValidatesProductQuantityIsChanged() {
        assertThat("Quantity should be successfully changed", shoppingCartActions.validateItemsQuantity(), is(true));
        log.info("Item quantity is successfully changed");
    }

    @And("user applies remove checkbox")
    public void userAppliesRemoveCheckbox() {
        shoppingCartActions.clickOnRemoveFromCart();
        log.info("The remove Checkbox is applied");
    }

    @Then("user sees empty shopping cart")
    public void userSeesEmptyShoppingCart() {
        assertThat("Shopping cart is empty", shoppingCartActions.checkEmptyShoppingCart(), is(true));
        log.info("'Your Shopping Cart is empty!' message is displayed");
    }
}