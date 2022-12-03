@runallCustomers
Feature: customers

  @tag1
  Scenario: Adding customers
     Given user launches browser
    When user enters url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email as "admin@yourstore.com" and user enters password as "admin"
    And user clicks on login button
    Then User can view dashboard
    When user clicks on customers menu 
    And clicks on customers menu item
    And click on add new button
    Then user can view add new customers page
    When user enters customers info
    And click on save button
    Then user can view confirmation message "The new customer has been added successfully."
And user closes browser