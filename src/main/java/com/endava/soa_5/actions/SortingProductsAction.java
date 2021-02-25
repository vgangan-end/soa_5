package com.endava.soa_5.actions;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.drivers.Driver;
import com.endava.soa_5.page_objects.SortingProductsObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SortingProductsAction extends BaseClass {
    static SortingProductsObjects sortingProductsObjects = new SortingProductsObjects();
    GenericActions genericActions = new GenericActions();

    public void navigateToProductsPage() {
        genericActions.waitForElement(sortingProductsObjects.getComputerLink());
        sortingProductsObjects.getComputerLink().click();
        sortingProductsObjects.getDesktopsLink().click();
    }

    public static void selectSortingLowToHigh() {
        sortingProductsObjects.getSortDropDown().click();
        sortingProductsObjects.getPriceLowToHigh().click();
    }

    public static void selectSortingHighToLow() {
        sortingProductsObjects.getSortDropDown().click();
        sortingProductsObjects.getPriceHighToLow().click();
    }

    public boolean sortAscending() {
        genericActions.waitForElement(sortingProductsObjects.getListOfAllPrices());
        List<WebElement> elements = Driver.getInstance().getDriver().findElements(By.xpath("//div[@class=\"prices\"]//span[@class=\"price actual-price\"]"));
        List<Double> sortedAscPriceList = new ArrayList<>();
        List<Double> listOfPricesSortedFromWeb = new ArrayList<>();

        for (WebElement element : elements) {
            sortedAscPriceList.add(Double.parseDouble(element.getText()));
            listOfPricesSortedFromWeb.add(Double.parseDouble(element.getText()));
        }
        Collections.sort(sortedAscPriceList);
        assertThat("List is sorted ascending", listOfPricesSortedFromWeb, equalTo(sortedAscPriceList));
        return true;
    }

    public boolean sortDescending() {
        genericActions.waitForElement(sortingProductsObjects.getListOfAllPrices());
        List<WebElement> elements = Driver.getInstance().getDriver().findElements(By.xpath("//div[@class=\"prices\"]//span[@class=\"price actual-price\"]"));
        List<Double> sortedDescPriceList = new ArrayList<>();
        List<Double> listOfPricesSortedFromWeb = new ArrayList<>();

        for (WebElement element : elements) {
            sortedDescPriceList.add(Double.parseDouble(element.getText()));
            listOfPricesSortedFromWeb.add(Double.parseDouble(element.getText()));
        }
        sortedDescPriceList.sort(Collections.reverseOrder());
        assertThat("List is sorted ascending", listOfPricesSortedFromWeb, equalTo(sortedDescPriceList));
        return true;
    }
}