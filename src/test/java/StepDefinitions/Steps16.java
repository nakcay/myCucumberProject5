package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Steps16 {
    NurPOMPage elements=new NurPOMPage();
    @And("Enter new Account Fields with some spaces")
    public void enterNewAccountFieldsWithSomeSpaces() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "no   ur");
        elements.sendKeysMethod(elements.getLastNameInput(), "akc   ay");
        elements.sendKeysMethod(elements.getEmailInput(), "campusss c123@techno.com");
        elements.sendKeysMethod(elements.getPhoneInput(), "100200    3000");
        elements.sendKeysMethod(elements.getPasswordButton(), "Na12  3");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "Na12  3");
        elements.clickMethod(elements.getCheckBox());
    }

    @Then("user should see the error message under the all fields")
    public void userShouldSeeTheErrorMessageUnderTheAllFields() {
// I just got the error from email box but locating of the message is not possible.
    }
}
