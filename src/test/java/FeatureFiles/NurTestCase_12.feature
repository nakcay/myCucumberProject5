Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm, Newsletter and  Privacy Policy Fields) by using Keyboard keys (Tab, Spacebar and Enter)
#  4. Click on 'Continue' button (ER-1)



  Scenario: Validate Registering an Account by using the Keyboard keys
    Given Navigate to My Account page
    When Select on Register button
    And Enter new Account Fields buttons using action
  Then user should see the account  success page
# Then Click on the Continue button