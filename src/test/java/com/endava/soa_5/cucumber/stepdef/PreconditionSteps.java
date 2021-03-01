package com.endava.soa_5.cucumber.stepdef;

import com.endava.soa_5.abstract_classes.BaseClass;
import com.endava.soa_5.context.ScenarioContext;
import com.endava.soa_5.page_objects.SearchPage;

import static com.endava.soa_5.context.Keys.SEARCH_PAGE_CONFIRMATION;

public class PreconditionSteps extends BaseClass {
    SearchPage searchPage = new SearchPage();

    public void userAccessSearchPage() {
        String url = propertyReader.getPropertyValue("url") + "search?";
        driver.get(url);
        String searchPageConfirmation = searchPage.getSearchHeader().getText();
        ScenarioContext.getScenarioContext().saveData(SEARCH_PAGE_CONFIRMATION,
                searchPageConfirmation);
    }
}