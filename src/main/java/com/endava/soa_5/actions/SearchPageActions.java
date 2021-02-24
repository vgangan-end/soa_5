package com.endava.soa_5.actions;

import com.endava.soa_5.page_objects.SearchPage;
import com.endava.soa_5.page_objects.enums.CategoryEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SearchPageActions extends GenericActions {
    SearchPage searchPage;
    List<WebElement> elements = new ArrayList<>();

    public SearchPageActions() {
        searchPage = new SearchPage();
    }

    public String getPageConfirmation() {
        waitForElement(searchPage.getSearchHeader());
        return searchPage.getSearchHeader().getText();
    }

    public void searchProduct(String product) {
        if (product.equals("null")) {
            product = "";
        }
        searchPage.getSearchField().sendKeys(product);
    }

    public void submitSearch() {
        searchPage.getSearchButton().click();
    }

    public void selectFromDropDown(CategoryEnum word) {
        clickOnElement(searchPage.getCategoryDropDown());
        Select category = new Select(searchPage.getCategoryDropDown());
        category.selectByVisibleText(word.getCategory());
    }

    public String getWarningMessage() {
        waitForElement(searchPage.getWarningMessage());
        return searchPage.getWarningMessage().getText();
    }

    public void searchElementsOnProductGrid() {
        waitForElement(searchPage.getProductGrid());
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
