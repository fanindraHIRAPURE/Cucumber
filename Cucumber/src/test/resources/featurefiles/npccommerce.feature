
@alltestcaseRUN
Feature: Successful login with valid credential

  @test1
  Scenario: Loginpagenpc
    Given user launches browser
    When user enters url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email as "admin@yourstore.com" and user enters password as "admin"
    And user clicks on login button
    Then validate the page title "Dashboard / nopCommerce administration"
    When user clicks on logout button
    Then title should be "Your store. Login"
    And close the browser 