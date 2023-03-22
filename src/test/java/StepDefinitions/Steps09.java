package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Steps09 {
    NurPOMPage elements=new NurPOMPage();
    @And("Enter new Account Fields with given data")
    public void enterNewAccountFieldsWithGivenData() {

        elements.sendKeysMethod(elements.getFirstNameInput(), "Pavan");
        elements.sendKeysMethod(elements.getLastNameInput(), "B");
        elements.sendKeysMethod(elements.getEmailInput(), "pavanoltraining@gmail.com");
        elements.sendKeysMethod(elements.getPhoneInput(), "814240XXXX");
        elements.sendKeysMethod(elements.getPasswordButton(), "12345");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "12345");
        elements.clickMethod(elements.getCheckBox());

    }

    @Then("user should see the error email message top of the page")
    public void userShouldSeeTheErrorEmailMessageTopOfThePage() {
        Assert.assertTrue(elements.getUsedEmailErrorMessage().isDisplayed());
    }
}
