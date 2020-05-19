@Android @ChangePassword
Feature: Change Password

  Background:
    Given User is on E-money Sign In Page
    When User input email "arrindika.pradana@gmail.com" on email or phone text field
    And User input password "P@ssw0rd" on password text field
    And User click sign in button on Sign In page
    And User is in homepage
    And User click Profile Button on Homepage


  @Positive
  Scenario: User Change Password with right new password format and match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@ssw0rd" on new password text field
    And User input confirm password "P@ssw0rd" on confirm password text field
    And User click change password button on change password page
    Then success change password


  @Negative
  Scenario: User Change Password with right new password format and not match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@ssw0rd" on new password text field
    And User input confirm password "P@ssw0r" on confirm password text field
    And User click change password button on change password page
    Then User see error that confirm password doesn't match

  Scenario: User Change Password with wrong new password format without uppercase and match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "p@ssw0rd" on new password text field
    And User input confirm password "p@ssw0rd" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password

  Scenario: User Change Password with wrong new password format without uppercase and not match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "p@ssw0rd" on new password text field
    And User input confirm password "p@ssw0r" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password
    And User see error that confirm password doesn't match

  Scenario: User Change Password with wrong new password format without special case and match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "Passw0rd" on new password text field
    And User input confirm password "Passw0rd" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password

  Scenario: User Change Password with wrong new password format without special case and not match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "Passw0rd" on new password text field
    And User input confirm password "Passw0r" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password
    And User see error that confirm password doesn't match

  Scenario: User Change Password with wrong new password format without lowercase and match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@SSW0RD" on new password text field
    And User input confirm password "P@SSW0RD" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password

  Scenario: User Change Password with wrong new password format without lowercase and not match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@SSW0RD" on new password text field
    And User input confirm password "P@SSW0R" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password
    And User see error that confirm password doesn't match

  Scenario: User Change Password with wrong new password format without numerical and match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@ssword" on new password text field
    And User input confirm password "P@ssword" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password

  Scenario: User Change Password with wrong new password format without numerical and not match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@ssword" on new password text field
    And User input confirm password "P@sswor" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password
    And User see error that confirm password doesn't match

  Scenario: User Change Password with wrong new password format with space and match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@ssw0 rd" on new password text field
    And User input confirm password "P@ssw0 rd" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password

  Scenario: User Change Password with wrong new password format with space and not match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@ssw0 rd" on new password text field
    And User input confirm password "P@ssw0 r" on confirm password text field
    And User click change password button on change password page
    Then User see error that confirm password doesn't match
    And User see error that invalid format password

  Scenario: User Change Password with wrong new password format less than 8 character and match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@ssw0r" on new password text field
    And User input confirm password "P@ssw0r" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password

  Scenario: User Change Password with wrong new password format less than 8 character and not match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@ssw0r" on new password text field
    And User input confirm password "P@ssw0" on confirm password text field
    And User click change password button on change password page
    Then User see error that confirm password doesn't match
    And User see error that invalid format password

  Scenario: User Change Password with right new password format and blank confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "P@ssw0rd" on new password text field
    And User input confirm password "" on confirm password text field
    And User click change password button on change password page
    Then User see error that confirm password is empty

  Scenario: User Change Password with blank new password and not match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "" on new password text field
    And User input confirm password "P@ssw0rd" on confirm password text field
    And User click change password button on change password page
    Then User see error that confirm password doesn't match
    And User see error that new password is empty

  Scenario: User Change Password with wrong new password format without alphabet and match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "-_123456" on new password text field
    And User input confirm password "-_123456" on confirm password text field
    And User click change password button on change password page
    Then User see error that invalid format password

  Scenario: User Change Password with wrong new password format without alphabet and not match confirm password
    Given User is On Profile Page
    When User click Change Password on Profile Page
    And User input new password "-_123456" on new password text field
    And User input confirm password "-_1234567" on confirm password text field
    And User click change password button on change password page
    Then User see error that confirm password doesn't match
    And User see error that invalid format password