package com.endava.soa_5.cucumber.stepdef;

import com.endava.soa_5.actions.GenericActions;
import com.endava.soa_5.page_objects.ComputersPage;
import com.endava.soa_5.page_objects.HomePage;
import com.endava.soa_5.page_objects.NotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterByAttributesSteps {
    GenericActions genericActions = new GenericActions();
    HomePage homePage = new HomePage();
    NotebooksPage notebooksPage = new NotebooksPage();
    ComputersPage computersPage = new ComputersPage();

    @When("user clicks Computers Notebooks button")
    public void userClicksComputersNotebooksButton() {
        genericActions.clickOnElement(computersPage.getNotebooksButton());
    }

    @When("user clicks CPU Type Intel button")
    public void userClicksCPUTypeIntelButton() {
        genericActions.clickOnElement(notebooksPage.getCpuTypeIntelButton());
    }

    @Then("Currently shopping by: message is displayed")
    public void currentlyShoppingByMessageIsDisplayed() {
        genericActions.assertElementIsDisplayed("//div[contains(text(),'Currently shopping by:')]");
    }

    @And("CPU Type message is displayed")
    public void cpuTypeMessageIsDisplayed() {
        genericActions.assertElementIsDisplayed("//div[@class='item']//strong[contains(text(), 'CPU Type:')]");
    }

    @And("Remove Filter button is displayed")
    public void removeFilterButtonIsDisplayed() {
        genericActions.assertElementIsDisplayed("//a[contains(text(),'Remove Filter')]");
    }

    @When("user clicks Memory 3GB button")
    public void userClicksMemoryGBButton() {
        genericActions.clickOnElement(notebooksPage.getMemory3GBButton());
    }

    @And("Memory message is displayed")
    public void memoryMessageIsDisplayed() {
        genericActions.assertElementIsDisplayed("//div[@class='already-filtered-items']//strong[contains(text(), 'Memory:')]");
    }

    @And("user clicks Remove Filter button")
    public void userClicksRemoveFilterButton() {
        genericActions.clickOnElement(notebooksPage.getRemoveFilterButton());
    }

    @Then("Currently shopping by: message is not displayed")
    public void currentlyShoppingByMessageIsNotDisplayed() {
        genericActions.assertElementIsNotDisplayed("//div[contains(text(),'Currently shopping by:')]");
    }

    @When("user clicks Homepage Computers button")
    public void userClicksHomepageComputersButton() {
        genericActions.clickOnElement(homePage.getComputersButton());
    }
}
