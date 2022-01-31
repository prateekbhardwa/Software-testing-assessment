Feature: Navigating to the saucelab website and adding the product to the cart


  Scenario Outline: Add the product to the cart
    Given Navigate to the site URL
    Given   The user enters the username as "<Username>" and password as "<Password>"
    And   The user clicks on the login button
    When  The user clicks on the product sort container
    And   Select the sort option as "<Low to High>"
    And   Select the inventory item name as Sauce Labs Onesie
    When  The user clicks on the Add to cart button
    Then  Navigate to the one page backwards
    And   Select the inventory item name as Sauce Labs Fleece Jacket
    When  The user clicks on the Add to cart button for fleece jacket
    And   The user navigates to the shopping cart link
    Then  Validate the item name in the cart
    Then  Click on the check out button
    And   Fill the relevant details
    Then  Click on the Continue Button
    Then  Click on the finish button
    And   Validate the order confirmation
    Then Logout of the application
    Examples:
      |Username  | Password |      Low to High|     Low to High   |
      |standard_user| secret_sauce| Price (low to high)|   Price (low to high)|



