Feature: Passing multiple parameters to the same step

  @ns
  Scenario: Searching multiple items
    Given user is on Google search page
    Then user searches the following item
      |items|
      | loop academy |
      | java         |
      | selenium     |
      | cucumber bdd |
      | sql          |
      | nadir        |
      | zahid        |
      | anna         |
      | anything     |

#    option + command + L - mac
#    CTRL + ALT + L window