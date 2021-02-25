Feature: Test user registration flow

  Background:
    Given HOME_PAGE page is displayed
    When user clicks Homepage Register button
    Then REGISTER_PAGE page is displayed

  Scenario: Register new user account with valid credentials
    When user chooses GENDER_MALE
    And user fills the form with data:
      | FIRST_NAME       | LELELE       |
      | LAST_NAME        | Ololo        |
      | EMAIL            | lool@kek.lol |
      | PASSWORD         | SecretPass1  |
      | CONFIRM_PASSWORD | SecretPass1  |
    And user clicks Register page Register button
    Then confirmation message is displayed

  Scenario: Register new user account without providing password
    When user chooses GENDER_FEMALE
    And user fills the form with data:
      | FIRST_NAME | Jane          |
      | LAST_NAME  | Doe           |
      | EMAIL      | mail@jane.doe |
    And user clicks Register page Register button
    Then two warnings are displayed
