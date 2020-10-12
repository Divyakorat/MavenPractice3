Feature: Add to cart success
  @PhoneCategory
  Scenario: User should be able to add two product successfully
    and user should be able to see both product in to shopping cart
    When user click on PhoneAndPDS
    And user click on HTCTouchHDAddToCart button
    And user click on iPhoneAddToCart button
    And user click on Shopping cart button
    Then user should be able to see both product in shopping cart