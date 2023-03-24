Feature: Register Functionality

#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
#  3. View the 'Privacy Policy' checkbox option (ER-1)

  Scenario:Validate whether the 'Privacy Policy' checkbox option is not selected by default
Given Navigate to My Account page
    When Select on Register button
    And view the Privacy policy checkbox option
  