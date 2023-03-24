Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Newsletter and  Privacy Policy Fields)
#  4. Don't enter into 'Password Confirm' field
#  5. Click on 'Continue' button (ER-1)

  Scenario: Validate Registring an Account, by filling 'Password' field and not filling 'Password Confirm' field
    Given Navigate to My Account page
    When Select on Register button
    And Enter new Account Fields without confirm Password box
    And Click on the Continue button
    Then user should see the error message under the password confirm field
