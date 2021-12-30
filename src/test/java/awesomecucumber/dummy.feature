Feature: Add to Cart

  Scenario Outline : Add Product from Store page
    Given I am on Store page
    When I add "<product_name>" to the cart
    Then I see 1 "<product_name>" to the cart
    Examples:
      |product_name  |
      | Blue Shoes   |
