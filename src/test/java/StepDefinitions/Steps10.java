package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Steps10 {
    NurPOMPage elements=new NurPOMPage();
    @And("Enter invalid {string} address")
    public void enterInvalidAddress(String email) {
        elements.sendKeysMethod(elements.getEmailInput(),email);
    }

    @Then("user should see the error message for email")
    public void userShouldSeeTheErrorMessageForEmail() {

    }

    @And("Enter all wanted places")
    public void enterAllWantedPlaces() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "nour");
        elements.sendKeysMethod(elements.getLastNameInput(), "akcay");
        elements.sendKeysMethod(elements.getPhoneInput(), "1002003000");
        elements.sendKeysMethod(elements.getPasswordButton(), "Na123");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "Na123");
        elements.clickMethod(elements.getCheckBox());
    }
}
