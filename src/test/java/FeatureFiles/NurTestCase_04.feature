Feature:  (TS_001) Register Functionality
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. Don't enter anything into the fields
#  4. Click on 'Continue' button (ER-1)
Scenario:Validate proper notification messages are displayed for the mandatory fields, when you don't provide any fields in the 'Register Account' page and submit

  Given Navigate to My Account page
  When Select on Register button
  And Do not enter any fields
  And Click on the Continue button
  Then user should see the warning messages
