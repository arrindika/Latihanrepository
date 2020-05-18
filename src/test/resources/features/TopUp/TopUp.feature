@Android @TopUp
Feature: TopUp E-money

  @TUP-03
  Scenario Outline: Input valid card number
    Given User is on E-money Sign In Page
    When User input email "ltfrzky@gmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    And User is on top up e-money homepage
    When User input <Keyword> on card number text field
    Then User see the option top up amount
    Examples:
      | Keyword            |
      | "6032123432123210" |
      | "6032123432123240" |


  @TUP-04
  Scenario Outline: Input invalid card number
    Given User is on E-money Sign In Page
    When User input email "ltfrzky@gmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    And User is on top up e-money homepage
    When User input <Keyword> on card number text field
    Then User see error message <Keyword1> on card number text field
    Examples:
      | Keyword | Keyword1                     |
      | "1232"     | "Invalid Card Number Format" |
      | "603212321"     | "Invalid Card Number Format" |
      | "1236765456721230"     | "Invalid Card Number Format" |


  @TUP-05
  Scenario: Cancel Top Up
    Given User is on E-money Sign In Page
    When User input email "ltfrzky@gmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    And User is on top up e-money homepage
    When User input "1232232123432435" on card number text field
    And User chose "20000" on top up amount option
    And User see payment details with total payment is "Rp 21500"
    And User click cancel button
    Then User is on top up e-money homepage

  @TUP-06
  Scenario Outline: Top Up
    Given User is on E-money Sign In Page
    When User input email "mas@boy.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    And User is on top up e-money homepage
    When User input <Keyword> on card number text field
    And User chose <Keyword1> on top up amount option
    And User see payment details with total payment is <Keyword2>
    And User choose <Keyword3> payment option
    And User click pay button
    Then User see top up payment is successfull
    Examples:
      | Keyword            | Keyword1 | Keyword2   | Keyword3        |
      | "6032123432123210" | "10000"  | "Rp11.000" | "Bank Transfer" |
      | "6032123432123210" | "20000"  | "Rp21.500" | "Bank Transfer" |
      | "6032123432123210" | "50000"  | "Rp51.500" | "Bank Transfer" |
      | "6032123432123210" | "100000"  | "Rp102.000" | "Bank Transfer" |
      | "6032123432123210" | "150000"  | "Rp152.500" | "Bank Transfer" |
      | "6032123432123210" | "200000"  | "Rp203.500" | "Bank Transfer" |
      | "6032123432123210" | "10000"  | "Rp11.000" | "Merchant" |
      | "6032123432123210" | "20000"  | "Rp21.500" | "Merchant" |
      | "6032123432123210" | "50000"  | "Rp51.500" | "Merchant" |
      | "6032123432123210" | "100000"  | "Rp102.000" | "Merchant" |
      | "6032123432123210" | "150000"  | "Rp152.500" | "Merchant" |
      | "6032123432123210" | "200000"  | "Rp203.000" | "Merchant" |
      | "6032123432123210" | "10000"  | "Rp11.000" | "Wallet Balance" |
      | "6032123432123210" | "20000"  | "Rp21.500" | "Wallet Balance" |
      | "6032123432123210" | "50000"  | "Rp51.500" | "Wallet Balance" |
      | "6032123432123210" | "100000"  | "Rp102.000" | "Wallet Balance" |
      | "6032123432123210" | "150000"  | "Rp152.500" | "Wallet Balance" |
      | "6032123432123210" | "200000"  | "Rp203.000" | "Wallet Balance" |


  @TUP-07
  Scenario: Check wallet less than transactions
    Given User is on E-money Sign In Page
    When User input email "ltfrzky@gmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    And User is on top up e-money homepage
    When User input "1232232123432435" on card number text field
    And User chose "100000" on top up amount option
    And User see payment details with total payment is "Rp102.000"
    And User choose "Wallet Balance" payment option
    And User click pay button
    Then User error message that wallet is less than total payment




