Feature: Category Scenario
  @Category
  Scenario Outline: User should able to navigate to correct category page,
  so that he can user all product features from categories
    Given user is on homepage
    When user click on "<category>" link on top menu
    Then user should be navigate to category "<related Category page>" successfully
    Examples:
      | category              | related Category page   |
      | Tablets               | http://tutorialsninja.com/demo/index.php?route=product/category&path=57 |