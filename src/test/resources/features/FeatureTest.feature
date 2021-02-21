@UserLogsIn
Feature: Verify that the user is able to login

  Scenario: LogIn with correct credentials
    Given User logs in using correct credentials
    When user clicks in Log In button
    Then User is logged in

  Scenario: Verify sorting of products by price
    Given User navigate on productsListPage
    When user selects sorting by Price: Low to High
    Then all displayed products are sorted ascending
    When user selects sorting by Price: High to Low
    Then all displayed products are sorted descending