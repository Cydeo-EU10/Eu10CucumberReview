Feature: validate visual contents

  @wip
  Scenario: validate visual contents
    Given user goes to the login page
    When user login with validate credentials
    Then user see below contents
      | title    | Swag Labs |
      | subTitle | Products  |
      | itemSize | 6         |