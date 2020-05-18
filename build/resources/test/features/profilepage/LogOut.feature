@Android @Profile @Logout
Feature: Log Out

  Background:
    Given User is on E-money Sign In Page
    When User input email "arrindika.pradana@gmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    And User is in homepage
    And User click Profile Button on Homepage

  Scenario: User Log Out the Account
    Given User is On Profile Page
    When User click Log Out on Profile Page
    And User click yes for Log Out confirmation
    Then User is on E-money Sign In Page

  Scenario: User Cancel Log Out Account
    Given User is On Profile Page
    When User click Log Out on Profile Page
    And User click cancel for Log Out confirmation
    Then User is On Profile Page
