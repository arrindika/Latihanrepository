@Android @Navigation
Feature: Navigation

  Background:
    Given User is on E-money Sign In Page
    When User input email "arrindika.pradana@gmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    And User is in homepage
    And User click Profile Button on Homepage

  Scenario: User Open E-Money Home Page
    Given User is On Profile Page
    When User click Home Button on Profile Page
    Then User is in homepage

  Scenario: User Open E-Money History Page
    Given User is On Profile Page
    When User click History Button on Profile Page
    Then User is on History Page
