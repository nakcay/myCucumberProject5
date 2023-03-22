Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Newsletter and  Privacy Policy Fields)
#  4. Enter any password say '12345' into the 'Password' field
#  5. Enter any different password say 'abcde' into the 'Passsword Confirm' field
#  6. Click on 'Continue' button (ER-1)
  Background:
    Given Navigate to My Account page
    When Select on Register button
    Scenario:
      And Enter all the necessary fields
      And Enter password "12345" into  password field
      And Enter different password "abcde"into password confirm field
      And Click on the Continue button
      Then user should see the error message under the password box
