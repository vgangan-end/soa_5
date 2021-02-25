package com.endava.soa_5.actions;

import com.endava.soa_5.abstract_classes.BaseClass;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.NoSuchElementException;

public class GenericActions extends BaseClass {
    Logger log = LoggerFactory.getLogger(this.getClass());

    public void clickOnElement(WebElement element){
        waitForElement(element);
        element.click();
    }

    public void waitForElement(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofMillis(Long.parseLong(propertyReader.getPropertyValue("waitTimeout"))))
                .pollingEvery(Duration.ofMillis(Long.parseLong(propertyReader.getPropertyValue("waitCheckFrequency"))))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void assertPageIsDisplayed(String title){
        assertThat("Wrong page is displayed", driver.getTitle(), is(title));
    }
    public void assertElementIsDisplayed(String selector){
        int size = driver.findElements(By.xpath(selector)).size();
        assertThat("At least one element of xpath:'" + selector + "' should be present", size, not(0));
    }
}