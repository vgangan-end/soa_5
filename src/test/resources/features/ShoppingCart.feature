Feature: Verify Shopping cart features

  Scenario: LogIn with correct credentials
    Given User logs in using correct credentials
    When user clicks in Log In button
    And user clicks Jewelry menu
    And user adds diamond heart to shopping cart
    And user goes to shopping cart
    Then user validates diamond heart was added

  Scenario: user updates shopping cart
    Given User logs in using correct credentials
    When user clicks in Log In button
    And user goes to shopping cart
    And user clears quantity field
    And user changes product quantity
    And user updates shopping cart
    Then user validates product quantity is changed

    Scenario: user deletes item from shopping cart
      Given User logs in using correct credentials
      When user clicks in Log In button
      And user goes to shopping cart
      And user applies remove checkbox
      And user updates shopping cart
      Then user sees empty shopping cart