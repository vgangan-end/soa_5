package com.endava.soa_5.actions;

import com.endava.soa_5.drivers.Driver;
import com.endava.soa_5.page_objects.SortingProductsObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingProductsAction {
    static WebDriver driver = Driver.getInstance().getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    static SortingProductsObjects sortingProductsObjects = new SortingProductsObjects(driver);

    public static void navigateToProductsPage() {
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
        wait.until(ExpectedConditions.visibilityOf(sortingProductsObjects.getListOfAllPrices()));
        List<WebElement> elements = Driver.getInstance().getDriver().findElements(By.xpath("//div[@class=\"prices\"]//span[@class=\"price actual-price\"]"));

        List<Double> integerList = new ArrayList<>();

        for (WebElement element : elements) {
            integerList.add(Double.parseDouble(element.getText()));
        }
        Collections.sort(integerList);

        for (int i = 0; i < elements.size() - 1; i++) {
            if ((Double.parseDouble(elements.get(i).getText()) != (integerList.get(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean sortDescending() {
        wait.until(ExpectedConditions.visibilityOf(sortingProductsObjects.getListOfAllPrices()));
        List<WebElement> elements = Driver.getInstance().getDriver().findElements(By.xpath("//div[@class=\"prices\"]//span[@class=\"price actual-price\"]"));
        List<Double> integerList = new ArrayList<>();

        for (WebElement element : elements) {
            integerList.add(Double.parseDouble(element.getText()));
        }

        Collections.sort(integerList, Collections.reverseOrder());

        for (int i = 0; i < elements.size() - 1; i++) {
            if ((Double.parseDouble(elements.get(i).getText()) != (integerList.get(i)))) {
                return false;
            }
        }
        return true;
    }
}