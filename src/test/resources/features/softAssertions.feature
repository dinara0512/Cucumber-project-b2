Feature: Practice soft assertions
  Scenario: Soft assertions practice
    Given user is on Docuport login page
    Then user validates "Login" text is displayed
    And user validates "forgot password" text is displayed
    When user enters credentials
      | username | b1g1_client@gmail.com |
      | password | Group1|
    And user validates "choose account" text is displayed
    Then user chooses account from drop down
    And user clicks "continue" button
    And user clicks "home" button
    And user clicks "invitations" button