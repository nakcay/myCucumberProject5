Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm and Newsletter Fields)
#  4. Don't select the 'Privacy Policy' checkbox option
#  4. Click on 'Continue' button (ER-1)


  Scenario: Validate Registering the Account without selecting the 'Privacy Policy' checkbox option
Given Navigate to My Account page
    When Select on Register button
    And Enter new Account Fields without privacy checkbox
    And Click on the Continue button
    Then user should see the warning message for privacy