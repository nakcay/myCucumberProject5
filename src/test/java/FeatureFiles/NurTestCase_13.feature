Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. View the First Name, Last Name, E-Mail, Telephone, Password, Password Confirm fields for Placeholders (ER-1)

  Scenario: Validate all the fields in the Register Account page have the proper placeholders
    Given Navigate to My Account page
    When Select on Register button
    And View the fields
    Then user should see the name of placeholders are displayed
