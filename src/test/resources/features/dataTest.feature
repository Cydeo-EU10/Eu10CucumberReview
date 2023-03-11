Feature: validate production name and price are match

  Scenario: checking price and products
    Given user goes to the login page
    When user login with validate credentials
    And user provide "<name>"
    Then the price should equal to "<price>"
