Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Newsletter and  Privacy Policy Fields)
#  4. Check entering simple passwords (Not following Password Complexity Standars' i.e. Size of password as 8, password should contain atleast one number, symbol, lower case letter and upper case letters) - <Refer Test Data>
#  5. Click on 'Continue' button (ER-1)

  Scenario Outline: Validate whether the Password fields in the Register Account page are following Password Complexity Standards
    Given Navigate to My Account page
    When Select on Register button
    And Enter the fields without password
    And Check entering simple "<password>"

    Then Click on the Continue button
    Examples:
      |password|
      |123  |

