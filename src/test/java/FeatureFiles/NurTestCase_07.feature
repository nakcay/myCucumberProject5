Feature: (TS_001) Register Functionality
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option (ER-1)
#  3. Click on 'My Account' Drop menu
#  4. Click on 'Login' option
#  5. Click  on 'Continue' button inside 'New Customer' box (ER-1)
#  6. Repeat Steps 3 and 4
#  7. Click on 'Register' option from the Right Column options (ER-1)

  Background:
    Given Navigate to My Account page
    When Select on Register button

  Scenario: Validate different ways of navigating to 'Register Account' page
    And Click on My account dop menu
    And click on login option
    And Click on the Continue button inside of new customer box
    And Click on My account dop menu
    And click on login option
    And click on Register button on the column
    Then user should see the register account page
