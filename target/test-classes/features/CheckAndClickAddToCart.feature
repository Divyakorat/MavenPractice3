@AddToCart
Feature: check and click on Add To Cart button

  Scenario: User able to see add to cart button on all category
    and user should be able to add product to shopping cart
    Given user is on homepage
    When user click and see laptopd & Notebook category
    And user can see all add to cart button on all laptops product
    And user click on selected add to cart button
    Then user able to see and add product to add cart button successfully

