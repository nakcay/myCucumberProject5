Feature:
#  1. Click on 'My Account' Drop menu
#  2. Click on 'Register' option
  Scenario: Validate the Breadcrumb, Page Heading, Page URL, Page Title of 'Register Account' Page
    Given Navigate to My Account page
    When Select on Register button
   And user should see the Breadcrumb, Page Heading, Page URL, Page Title of Register Account Page