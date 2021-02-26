package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ComputersPage extends BaseClass {

    private @FindBy(xpath = "//div[@class='sub-category-item']//a[contains(text(), 'Notebooks')]")
    WebElement notebooksButton;
}
