Feature: Vytrack application login test


#  @wip
  Scenario: Happy login test
    Given user is on the login page
    When user enters "user1" and "UserUser123" as credentials
    Then user is on the dashboard page

#  @wip
  Scenario: Sad path login test
    Given user is on the login page
    When user enters "user2" and "UserUser123123" as credentials
    Then user is getting alert message