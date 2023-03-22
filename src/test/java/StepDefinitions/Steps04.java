package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Steps04 {
    NurPOMPage elements=new NurPOMPage();
    @And("Do not enter any fields")
    public void doNotEnterAnyFields() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "");
        elements.sendKeysMethod(elements.getLastNameInput(), "");
        elements.sendKeysMethod(elements.getEmailInput(), "");
        elements.sendKeysMethod(elements.getPhoneInput(), "");
        elements.sendKeysMethod(elements.getPasswordButton(), "");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "");

    }
    @Then("user should see the warning messages")
    public void userShouldSeeTheWarningMessages() {
        Assert.assertTrue(elements.getFirstNameErrorMessage().isDisplayed());
        Assert.assertTrue(elements.getLastNameErrorMessage().isDisplayed());
        Assert.assertTrue(elements.getPhoneNumErrorMessage().isDisplayed());
        Assert.assertTrue(elements.getEmailErrorMessage().isDisplayed());
        Assert.assertTrue(elements.getPasswordErrorMessage().isDisplayed());

    }
}
