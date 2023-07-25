
@tag
Feature: Purchase the order from the ecommerce website
  I want to use this template for my feature file

BackGround:
Given I landed on the Ecommerce page
  
  
  @tag2
 Scenario Outline: Positive test of the submitting the order
    Given Logged i with username  <username> and password <password>
    When I add the <productName> to cart
    And Checkout <productName> and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage

    Examples: 
      | username                    | password         | productName  |
      | sireesha.mocharla@gmail.com | Sireesha@1023    | ZARA COAT 3  |
      
Scenario: Login with valid credentials
Given User has navigated to login page
When User has enters valid email address "amotooricap9@gmail.com" into emial field
And User has enter valid password "12345" into password field
And User clicks on Login button
Then User should get successfully logged in