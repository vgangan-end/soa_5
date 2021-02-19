package com.endava.soa_5.actions;

import com.endava.soa_5.abstract_classes.BaseAction;
import org.openqa.selenium.WebElement;

public class GenericActions extends BaseAction {
    public static void clickOnElement(WebElement element){
        element.click();
    }
    //TODO: add generic waiter method here;
    //TODO: add some generic asserts here;
}
