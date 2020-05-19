@Android @History

Feature: History Functionality
  Background:
    Given User is on E-money Sign In Page
    And User input email "ltfrzky@gmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    And User is on top up e-money homepage
    And User input "6032123432123210" on card number text field
    And User chose "20000" on top up amount option
    And User see payment details with total payment is "Rp21.500"

  Scenario: User wants to check wether the complete transaction is marked as completed transaction or not
    When User click cancel button
    And User is on top up e-money homepage
    And User click history page button on main page
    And User click completed tab transaction on history page
    And User click the last completed transaction on history completed tab transaction page
    Then User see "Completed" status in detail transaction page

