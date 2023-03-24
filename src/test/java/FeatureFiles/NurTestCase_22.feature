Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter some Password text into the 'Password' and 'Password Confirm' fields (ER-1)


  Scenario: Validate the Password text entered into the 'Password' and 'Password Confirm' field of 'Register Account' functionality is toggled to hide its visibility
    Given Navigate to My Account page
    When Select on Register button
    And Enter password and confirmation password
    Then user should see the hidden signs in password and confirm password button