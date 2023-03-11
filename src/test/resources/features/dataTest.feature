Feature: validate production name and price are match

  @wip
  Scenario Outline: checking price and products
    Given user goes to the login page
    When user login with validate credentials
    And user provide "<name>"
    Then the price should equal to "<price>"
    Examples:
      | name                    | price |
      | Sauce Labs Backpack     | 29.99 |
      | Sauce Labs Bike Light   | 9.99  |
      | Sauce Labs Bolt T-Shirt | 15.99 |

