Feature: Dashboard Test

  Background:
    Given user is on the login page


  Scenario Outline: Check dashboard elements as user
    When user enters as different "<role>"
    Then user should see menu options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples:
      | role          |
      | sales manager |
      | store manager |





#  @smoke
#  Scenario: Check dashboard elements as sales manager
#    When user enters "salesmanager101" and "UserUser123" as credentials
#    Then user should see menu options
#      | Dashboard       |
#      | Fleet           |
#      | Customers       |
#      | Sales           |
#      | Activities      |
#      | Marketing       |
#      | Report&Segments |
#      | System          |
#
#  Scenario: Check dashboard elements as store manager
#    When user enters "storemanager85" and "UserUser123" as credentials
#    Then user should see menu options
#      | Dashboard       |
#      | Fleet           |
#      | Customers       |
#      | Sales           |
#      | Activities      |
#      | Marketing       |
#      | Report&Segments |
#      | System          |



