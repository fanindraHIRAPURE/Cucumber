@runallsearch
Feature: customers

  @search
  Scenario: searching customers
     Given user launches browser
    When user enters url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email as "admin@yourstore.com" and user enters password as "admin"
    And user clicks on login button
    Then User can view dashboard
    When user clicks on customers menu 
    And clicks on customers menu item
    And user enters email in fields
    Then user clicks search and validated customers email
    And user closes browser