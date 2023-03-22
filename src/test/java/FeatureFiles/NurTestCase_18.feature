Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Check all the fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm, Newsletter and  Privacy Policy Fields) including the 'Continue' button (ER-1)
  Scenario: Validate whether the fields in the Register Account page are according the Client requirements (Examples- Height, Width, Number of characters etc.)
    Given Navigate to My Account page
    When Select on Register button
    And Check the fields all mandatory fields depend on the client requirements