Feature: Dashboard Test

  @wip
  Scenario: Check dashboard elements
    Given user is on the login page
    When user enters "user1" and "UserUser123" as credentials
    Then user should see menu options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |



