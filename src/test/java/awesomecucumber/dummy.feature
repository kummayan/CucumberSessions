Feature: Add to Cart

  Scenario Outline :
    Given I am on Store page
    When I add "<product_name>" to the cart
    Then I see 1 "<product_name>" to the cart
    And I see 1 "product" to the cart


    Examples:
      |product_name  |
      | Blue Shoes   |
