Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Check the Fields - First Name, Last Name, E-Mail, Telephone, Password, Password Confirm and Privacy Policy
#

  Scenario: Validate all the mandatory fields in the Register Account page are marked with red color * symbol
    Given Navigate to My Account page
    When Select on Register button
    And Check the fields all mandatory fields
    Then user should see the red color * sign
