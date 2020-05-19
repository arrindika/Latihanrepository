@Android @Signup
Feature: Sign Up
  @Positive
  Scenario Outline: verify the functionality of sign up on Sigma Application
    Given User is on E-money Sign In Page
    And User click sign up button on Sign In Page
    And User is at Sign Up page
    When User insert "<FullName Field>" in Fullname text field
    And User input email "<Email Field>"
    And User input phone number "<Phone Number>"
    And User input password "<Password>"
    And User input confirm password "<Confirmation Password>"
    And User click sign up button
    And User will see "Success" message alert to verify email address
    And User click ok button to insert otp code in otp page
    Then User will see otp page
    Examples:
      | FullName Field | Email Field              | Phone Number    | Password      | Confirmation Password |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | Password@123_ | Password@123_         |
      | Reza Rahardian | reza.rahardian@gmail.com | 081904107070    | Password@123_ | Password@123_         |
      | Reza 123       | reza.rahardian@gmail.com | 6281904107070   | Password@123_ | Password@123_         |
      | Reza @/!       | reza.rahardian@gmail.com | 6281904107070   | Password@123_ | Password@123_         |
      | Reza Rahardian | reza.rahardian@gmail.com | 62819041070707  | Password@123_ | Password@123_         |

  @Negative
  Scenario Outline: verify the error message functionality of sign up on Sigma Application
    Given User is on E-money Sign In Page
    And User click sign up button on Sign In Page
    And User is at Sign Up page
    When User insert "<FullName Fld>" in Fullname text field
    And User input email "<Email Fld>"
    And User input phone number "<PhoneNumber>"
    And User input password "<Passwords>"
    And User input confirm password "<Conf Passwords>"
    And User click sign up button
    Then User will see error message
    Examples:
      | FullName Fld   | Email Fld                | PhoneNumber     | Passwords     | Conf Passwords |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | Password@123_ | Wordpass@123_  |
      | Reza Rahardian | reza.rahardiangmail.com  | 6281904107070   | Password@123_ | Password@123_  |
      | Reza Rahardian | reza.rahardian@gmailcom  | 6281904107070   | Password@123_ | Password@123_  |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107      | Password@123_ | Password@123_  |
      | Reza Rahardian | reza.rahardian@gmail.com | 6888882193138   | Password@123_ | Password@123_  |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | password@123_ | password@123_  |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | PASSWORD@123_ | PASSWORD@123_  |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | Password123   | Password123    |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | Password@     | Password@      |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | Password      | Password       |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | password      | password       |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | P@ssw0r       | P@ssw0r        |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | Password @123 | Password @123  |
      | Reza Rahardian | reza.rahardian@gmail.com | 6281904107070   | P@ssw0rdpasswordpasswordpasswordpasswordpasswordpas | P@ssw0rdpasswordpasswordpasswordpasswordpasswordpas |



  @Testing
  Scenario: Verify the functionality of Sign up on Sigma Application
    Given User is on E-money Sign In Page
    And User click sign up button on Sign In Page
    And User is at Sign Up page
    When User insert "Reza Rahardian" in Fullname text field
    And User input email "reza.rahardian@gmail.com"
    And User input phone number "62819041070707"
    And User input password "Password@123_"
    And User input confirm password "Password@123_"
    And User click sign up button
    And User will see "Success" message alert to verify email address
    And User click ok button to insert otp code in otp page
    Then User will see otp page


  @Testing2
  Scenario: Verify the functionality of Sign up on Sigma Application
    Given User is on E-money Sign In Page
    And User click sign up button on Sign In Page
    And User is at Sign Up page
    When User insert "Reza Rahardian" in Fullname text field
    And User input email "reza.rahardian@gmail.com"
    And User input phone number "6281904107070"
    And User input password "P@ssw0rdpasswordpasswordpasswordpasswordpasswordpas"
    And User input confirm password "P@ssw0rdpasswordpasswordpasswordpasswordpasswordpas"
    And User click sign up button
    Then User will see error message


  @Fullname
  Scenario: User not input fullname, valid email address,valid phone number, and valid password
    Given User is on E-money Sign In Page
    And User click sign up button on Sign In Page
    And User is at Sign Up page
    When User input email "reza.rahardian@gmail.com"
    And User input phone number "081904107070"
    And User input password "Password@123_"
    And User input confirm password "Password@123_"
    And User click sign up button
    Then User will see error message

  @Email
  Scenario: User input alphabetic fullname, not input email address,valid phone number, and valid password
    Given User is on E-money Sign In Page
    And User click sign up button on Sign In Page
    And User is at Sign Up page
    When User insert "Reza Rahardian" in Fullname text field
    And User input phone number "081904107070"
    And User input password "Password@123_"
    And User input confirm password "Password@123_"
    And User click sign up button
    Then User will see error message

  @Phonenumber
  Scenario: User input alphabetic fullname, valid email address,not input phone number, and valid password
    Given User is on E-money Sign In Page
    And User click sign up button on Sign In Page
    And User is at Sign Up page
    When User insert "Reza Rahardian" in Fullname text field
    And User input email "reza.rahardian@gmail.com"
    And User input password "Password@123_"
    And User input confirm password "Password@123_"
    And User click sign up button
    Then User will see error message

  @Password
  Scenario: User input alphabetic fullname, valid email address,not input phone number, and not inserted password
    Given User is on E-money Sign In Page
    And User click sign up button on Sign In Page
    And User is at Sign Up page
    When User insert "Reza Rahardian" in Fullname text field
    And User input email "reza.rahardian@gmail.com"
    And User input phone number "081904107070"
    And User input confirm password "Password@123_"
    And User click sign up button
    Then User will see error message

  @Password2
  Scenario: User input alphabetic fullname, valid email address,not input phone number, and not inserted password
    Given User is on E-money Sign In Page
    And User click sign up button on Sign In Page
    And User is at Sign Up page
    When User insert "Reza Rahardian" in Fullname text field
    And User input email "reza.rahardian@gmail.com"
    And User input phone number "081904107070"
    And User input password "Password@123_"
    And User click sign up button
    Then User will see error message

  @Password3
  Scenario: User input alphabetic fullname, valid email address,not input phone number, and not inserted password
    Given User is on E-money Sign In Page
    And User click sign up button on Sign In Page
    And User is at Sign Up page
    When User insert "Reza Rahardian" in Fullname text field
    And User input email "reza.rahardian@gmail.com"
    And User input phone number "081904107070"
    And User click sign up button
    Then User will see error message
