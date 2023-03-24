package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Steps21 {
    NurPOMPage elements = new NurPOMPage();

    @And("Enter new Account Fields without privacy checkbox")
    public void enterNewAccountFieldsWithoutPrivacyCheckbox() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "nour");
        elements.sendKeysMethod(elements.getLastNameInput(), "akcay");
        elements.sendKeysMethod(elements.getEmailInput(), "campus!1@techno.com");
        elements.sendKeysMethod(elements.getPhoneInput(), "1002003000");
        elements.sendKeysMethod(elements.getPasswordButton(), "Na123");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "Na123");


    }

    @Then("user should see the warning message for privacy")
    public void userShouldSeeTheWarningMessageForPrivacy() {
        Assert.assertTrue(elements.getCheckBoxErrorMessage().getText().contains("Policy!"));
    }
}
