package com.endava.soa_5.actions;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.page_objects.FilterByPricePage;
import com.endava.soa_5.page_objects.HomePage;
import com.endava.soa_5.page_objects.enums.PageTitlesEnum;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FilterByPriceActions extends BaseClass {
    private GenericActions genericActions = new GenericActions();
    private HomePage homePage = new HomePage();
    private FilterByPricePage filterByPricePage = new FilterByPricePage();

    public void clickCategoryButton(PageTitlesEnum categoryName) {
        if (categoryName.equals(PageTitlesEnum.BOOKS)) {
            genericActions.waitForElement(homePage.getBooksButton());
            homePage.getBooksButton().click();
        } else throw new IllegalArgumentException("Invalid Category Name: " + categoryName);
    }

    public void booksPageTitleIsDisplayed() {
        genericActions.waitForElement(filterByPricePage.getBooksPageTitle());
        filterByPricePage.getBooksPageTitle().getText();
    }

    public void filterByPriceTitleIsDisplayed() {
        genericActions.waitForElement(filterByPricePage.getFilterByPriceTitle());
        filterByPricePage.getFilterByPriceTitle().getText();
    }

    public void clickUnder25PriceButton() {
        genericActions.waitForElement(filterByPricePage.getPriceUnder25FilterButton());
        filterByPricePage.getPriceUnder25FilterButton().click();
    }

    public boolean getIsUnderPriceLimit(String limitType) {
        if (limitType.equalsIgnoreCase("under") || limitType.equalsIgnoreCase("over")) {
            return limitType.equalsIgnoreCase("under");
        } else throw new IllegalArgumentException("Invalid limit type: " + limitType);
    }

    public boolean filterByPrice(boolean isLowerThanPriceLimit, double priceLimit) {
        genericActions.waitForElement(filterByPricePage.getListOfBooksPrices().get(0));
        boolean isFiltered = false;
        List<Double> priceList = new ArrayList<>();
        for (WebElement element : filterByPricePage.getListOfBooksPrices()) {
            priceList.add(Double.parseDouble(element.getText()));
        }
        for (Double price : priceList) {
            if ((isLowerThanPriceLimit && price < priceLimit) || (!isLowerThanPriceLimit && price > priceLimit)) {
                isFiltered = true;
            } else {
                isFiltered = false;
            }
        }
        return isFiltered;
    }

    public void clickRemoveFilterButton() {
        genericActions.waitForElement(filterByPricePage.getRemoveFilterButton());
        filterByPricePage.getRemoveFilterButton().click();
    }

    public void clickOver50PriceButton() {
        genericActions.waitForElement(filterByPricePage.getPriceOver50FilterButton());
        filterByPricePage.getPriceOver50FilterButton().click();
    }
}
