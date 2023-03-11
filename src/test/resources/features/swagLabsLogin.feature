Feature: Login test of Swag Lab app

#  @wip
  Scenario: positive login test
    Given user goes to the login page
    When user login with validate credentials
    Then user is on the dashboard

#  @wip
  Scenario: negative login test
    Given user goes to the login page
    When user login with invalid credentials
    Then user gets error messages
