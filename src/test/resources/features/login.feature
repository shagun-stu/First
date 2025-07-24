Feature: Login Functionality for OrangeHrm Website

  Scenario Outline: Valid credentionals for successful login
    When user is on OrangeHRM website
    And user put valid "<username>" and "<password>"
    Then user redirected to the dashboard

    Examples:
      | username | password |
      | Admin    | admin123 |