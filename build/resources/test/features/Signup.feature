@Android
Feature: Sign Up
  Scenario: Verify the functionality of Sign up on E-money Application
    Given User is on sigma start page
    And User click sign up link
    And User is at Sign Up page
    When User insert "Reza Rahardian" in Fullname text field
    And User input email "reza.rahardian@gmail.com"
    And User input phone number "6281904107070"
    And User input password "Password@123_"
    And User input confirm password "Password@123_"
    And User click sign up button
    Then User will see otp page