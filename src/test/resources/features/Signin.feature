@SignIn
Feature: Sign In

  #Positive Scenario

  Scenario: User Sign In with correct email and correct password
    Given User is on E-money Sign In Page
    When User input email "ltfrzky@gmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User is in homepage

  Scenario: User Sign In with correct phone start with 08 and correct password
    Given User is on E-money Sign In Page
    When User input phone "089505744128" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User is in homepage

  Scenario: User Sign In with correct phone start with 62 and correct password
    Given User is on E-money Sign In Page
    When User input phone "6289505744128" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User is in homepage

  Scenario: User Sign In with correct phone start with +62 and correct password
    Given User is on E-money Sign In Page
    When User input phone "+6289505744128" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User is in homepage

  #Negative Scenario

  Scenario: User Sign In with wrong email without @ and correct password
    Given User is on E-money Sign In Page
    When User input email "reza.rahardiangmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User see error that email or phone is not the format

  Scenario: User Sign In with wrong email without dot and correct password
    Given User is on E-money Sign In Page
    When User input email "reza.rahardian@gmailcom" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User see error that email or phone is not the format

  Scenario: User Sign In with correct phone start with 08 and wrong password without uppercase
    Given User is on E-money Sign In Page
    When User input email "089505744128" on email or phone text field
    And User input password "p@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User see error that password is not the format

  Scenario: User Sign In with correct phone start with 08 and wrong password without special case
    Given User is on E-money Sign In Page
    When User input email "089505744128" on email or phone text field
    And User input password "Passw0rd" on password text field
    And User click sign in button on Sign In page
    Then User see error that password is not the format

  Scenario: User Sign In with correct phone start with 08 and wrong password without lowercase
    Given User is on E-money Sign In Page
    When User input email "089505744128" on email or phone text field
    And User input password "P@SSW0RD" on password text field
    And User click sign in button on Sign In page
    Then User see error that password is not the format

  Scenario: User Sign In with correct phone start with 08 and wrong password without numerical
    Given User is on E-money Sign In Page
    When User input email "089505744128" on email or phone text field
    And User input password "P@ssword" on password text field
    And User click sign in button on Sign In page
    Then User see error that password is not the format

  Scenario: User Sign In with correct phone start with 08 and wrong password less than 8 character
    Given User is on E-money Sign In Page
    When User input email "089505744128" on email or phone text field
    And User input password "P@ssw0r" on password text field
    And User click sign in button on Sign In page
    Then User see error that password is not the format

  Scenario: User Sign In with blank email and correct password
    Given User is on E-money Sign In Page
    When User input email "" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User see error that email or phone field is blank

  Scenario: User Sign In with correct email and blank password
    Given User is on E-money Sign In Page
    When User input email "reza.rahardian@gmail.com" on email or phone text field
    And User input password "" on password text field
    And User click sign in button on Sign In page
    Then User see error that password field is blank

  Scenario: User Sign In with unregistered email and correct password
    Given User is on E-money Sign In Page
    When User input email "reza.puls@gmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User see error that email or phone is wrong

  Scenario: User Sign In with unregistered phone and correct password
    Given User is on E-money Sign In Page
    When User input phone "081220304078" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User see error that email or phone is wrong

  Scenario: User Sign In with correct phone start with 0 and correct password
    Given User is on E-money Sign In Page
    When User input phone "89505744128" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    Then User see error that email or phone is not the format

  Scenario: User Sign In with correct email and wrong password
    Given User is on E-money Sign In Page
    When User input phone "ltfrzky@gmail.com" on email or phone text field
    And User input password "P@ssw0rdd" on password text field
    And User click sign in button on Sign In page
    Then User see error that password is wrong

  Scenario: User Sign In with correct phone start with 08 and wrong password
    Given User is on E-money Sign In Page
    When User input phone "089505744128" on email or phone text field
    And User input password "P@ssw0rdd" on password text field
    And User click sign in button on Sign In page
    Then User see error that password is wrong

  Scenario: User Sign In with correct phone start with 62 and wrong password
    Given User is on E-money Sign In Page
    When User input phone "6289505744128" on email or phone text field
    And User input password "P@ssw0rdd" on password text field
    And User click sign in button on Sign In page
    Then User see error that password is wrong

  Scenario: User Sign In with correct phone start with 08 and wrong password with space
    When User input email "089505744128" on email or phone text field
    And User input password "P@ssw0 rd" on password text field
    And User click sign in button on Sign In page
    Then User see error that password is not the format

  Scenario: User Sign In with correct phone start with 08 and wrong password without alphabet
    When User input email "089505744128" on email or phone text field
    And User input password "-_123456" on password text field
    And User click sign in button on Sign In page
    Then User see error that password is not the format
