Feature: Filter products by price

  Scenario: Verify filter by price products functionality
    Given HOME_PAGE page is displayed
    And user navigates to BOOKS category page
    And Filter by price title is displayed
    When user filters products by price under 25
    Then only the products with the price under 25 are displayed
    When user clicks Remove Filter Price button
    Then all the products are not filtered by price
    When user filters products by price over 50
    Then only the products with the price over 50 are displayed