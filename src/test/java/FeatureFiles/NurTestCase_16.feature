Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter spaces into the Mandatory Fields (First Name, Last Name, E-Mail,Telephone, Password and Password Confirm)
#  4. Click on 'Continue' button (ER-1)


  Scenario: Validate whether the Mandatory fields in the Register Account page are accepting only spaces
    Given Navigate to My Account page
    When Select on Register button
    And Enter new Account Fields with some spaces
    And Click on the Continue button
    Then user should see the error message under the all fields
#    Bug alarm