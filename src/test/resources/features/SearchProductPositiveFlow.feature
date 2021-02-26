@SearchPage
Feature: Verify that search functionality return desired products

  Scenario: user access search Page
    Then user is on search page

  Scenario Outline: Verify that search will return products list
    Given user insert <searchWord> into search field
    When user send search request
    Then list contain <searchWord> are returned
    Examples:
      | searchWord |
      | blue       |
      | laptop     |
      | com        |

  Scenario Outline: Verify that search will return warning message if user insert less that 3 chars
    Given user insert <searchWord> into search field
    When user send search request
    Then warning message will is displayed
    Examples:
      | searchWord |
      | b          |
      | la         |
      | null       |

  Scenario Outline: Verify that search will return products list using advanced search
    Given user insert <searchWord> into search field
    And user select in advanced search <category>
    When user send search request
    Then list contain <searchWord> are returned
    Examples:
      | searchWord | category      |
      | blue       | APPAREL_SHOES |
      | laptop     | NOTEBOOKS     |
      | com        | BOOKS         |
      | com        | ACCESSORIES   |
