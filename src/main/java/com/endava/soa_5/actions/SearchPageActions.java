package com.endava.soa_5.actions;

import com.endava.soa_5.drivers.Driver;
import com.endava.soa_5.page_objects.enums.CategoryEnum;
import com.endava.soa_5.page_objects.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SearchPageActions {
    SearchPage searchPage;
    List<WebElement> elements = new ArrayList<>();

    public SearchPageActions() {
        searchPage = new SearchPage();
    }

    public String getPageConfirmation() {
        return searchPage.getSearchHeader().getText();
    }

    public void searchProduct(String product) {
        if (product.equals("null")) {
            product = "";
        }
        searchPage.getSearchField().sendKeys(product);
    }

    public void clickOnSearchField() {

        searchPage.getSearchField().click();
    }

    public void submitSearch() {
        searchPage.getSearchButton().click();
    }

    public void insertPriceFrom(String price) {
        searchPage.getPriceFromField().sendKeys(price);
    }

    public void insertPriceTo(String price) {
        searchPage.getPriceToField().sendKeys(price);
    }

    public void clickOnSubCategoriesCheckBox() {
        searchPage.getSearchInSubCategoriesCheckBox().click();
    }

    public void clickOnAdvancedSearchCheckBox() {
        searchPage.getAdvancedSearchCheckBox().click();
    }

    public void clickOnCategoryDropDown() {
        searchPage.getCategoryDropDown().click();
    }

    public void selectFromDropDown(CategoryEnum word) {
        clickOnCategoryDropDown();
        Select category = new Select(searchPage.getCategoryDropDown());
        category.selectByVisibleText(word.getCategory());
    }

    public String getWarningMessage() {
        return searchPage.getWarningMessage().getText();
    }

    public void searchElementsOnProductGrid() {
        WebDriver driver = Driver.getInstance().getDriver();
        elements = driver.findElements(By.xpath("//h2[@class='product-title']"));
    }

    public boolean isProductInList(String searchWord) {
        searchElementsOnProductGrid();
        for (WebElement element : elements) {
            if (element.getText().toLowerCase().contains(searchWord.toLowerCase()))
                return true;
        }
        return false;
    }
}
