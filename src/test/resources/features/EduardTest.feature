@UserLogsIn
Feature: Verify that the user is able to login

  Scenario: LogIn with correct credentials
    Given User logs in using correct credentials
    When user clicks in Log In button
    Then User is logged in.

  Scenario: Verify sorting of products by price
    Given User navigate on productsListPage
    When user selects sorting by Price: Low to High
    Then all displayed products are sorted ascending
    When user selects sorting by Price: High to Low
    Then all displayed products are sorted descending

  Scenario: Change user password
    Given User is logged in
    When navigate to Change password page
    And user type in the old password
    And type in the new password and confirm it
    And user clicks on [Change password] button
    Then confirmation message is displayed about Change password
    When user logs in with old password
    Then user can't log in with old password
    When user logs in with new password
    Then user is logged in with new password