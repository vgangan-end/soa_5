package com.endava.soa_5.page_objects;

import com.endava.soa_5.abstract_classes.BaseClass;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class NotebooksPage extends BaseClass {

    private @FindBy(xpath = "//a[contains(text(),'Intel')]")
    WebElement cpuTypeIntelButton;
    private @FindBy(xpath = "//div[contains(text(),'Currently shopping by:')]")
    WebElement currentlyShoppingByText;
    private @FindBy(xpath = "//div[@class='already-filtered-items']//strong[contains(text(), 'CPU Type:')]")
    WebElement cpuTypeMessage;
    private @FindBy(xpath = "//a[contains(text(),'Remove Filter')]")
    WebElement removeFilterButton;
    private @FindBy(xpath = "//a[contains(text(),'3 GB')]")
    WebElement memory3GBButton;
    private @FindBy(xpath = "//div[@class='already-filtered-items']//strong[contains(text(), 'Memory:')]")
    WebElement memoryMessage;
}
