Feature: Verify Edit User Data

  Scenario Outline: Verify edit fields for Customer Info page
    Given HOME_PAGE page is displayed
    And User logs in using correct credentials
    And user clicks in Log In button
    And User is logged in.
    And user access My Account page
    And MY_ACCOUNT page is displayed
    When user fills in the customer info with the following data:
      | Gender     | <Gender>     |
      | First name | <First name> |
      | Last name  | <Last name>  |
    And user clicks on Save button
    Then user's updated information is saved

    Examples:
      | Gender | First name | Last name |
      | F      | Daniela    | Chihai    |
      |        | Dana       |           |
      |        |            | Ursachi   |
      | M      | Victor     | Cojocaru  |

  Scenario: Verify error message for mandatory empty fields
    Given HOME_PAGE page is displayed
    And User logs in using correct credentials
    And user clicks in Log In button
    And User is logged in.
    And user access My Account page
    And MY_ACCOUNT page is displayed
    When user clears customer info data from Your Personal Details
    And user clicks on Save button
    Then FIRST_NAME_ERROR message is displayed for the First Name text field
    And LAST_NAME_ERROR message is displayed for the Last Name text field
    And EMAIL_ERROR message is displayed for the Email text field