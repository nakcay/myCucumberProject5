Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm, Newsletter and  Privacy Policy Fields) - by adding leading and trailing spaces to the applicable fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm)
#  4. Click on 'Continue' button (ER-1)

  Scenario: Validate whether the leading and trailing spaces entered into the Register Account fields are trimmed
    Given Navigate to My Account page
    When Select on Register button
    And Enter new Account details with some spaces on the leading and tailing part
    And Click on the Continue button
    Then user should see the account  success page
