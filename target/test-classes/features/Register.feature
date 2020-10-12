Feature: Register Scenario
  @Register
  Scenario: User should be able to enter all detail,
  user able to register successfully
    Given User is on homepage
    When user click on my Account
    And user click on register
    And user Enter all details
    Then user should be able see success message successfully
