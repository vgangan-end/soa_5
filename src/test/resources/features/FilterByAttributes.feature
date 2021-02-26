Feature: Verify filtering by attributes

  Background:
    Given HOME_PAGE page is displayed
    When user clicks Homepage Computers button
    When user clicks Computers Notebooks button
    Then NOTEBOOKS_PAGE page is displayed

  Scenario: Filter by CPU Type
    When user clicks CPU Type Intel button
    Then Currently shopping by: message is displayed
    And CPU Type message is displayed
    And Remove Filter button is displayed


  Scenario: Filter by Memory
    When user clicks Memory 3GB button
    Then Currently shopping by: message is displayed
    And Memory message is displayed
    And Remove Filter button is displayed

  Scenario: Remove filters
    When user clicks CPU Type Intel button
    And user clicks Memory 3GB button
    And user clicks Remove Filter button
    Then Currently shopping by: message is not displayed