package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Steps24 {
    NurPOMPage elements=new NurPOMPage();
    @And("Enter new Account Fields without confirm Password box")
    public void enterNewAccountFieldsWithoutConfirmPasswordBox() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "nour");
        elements.sendKeysMethod(elements.getLastNameInput(), "akcay");
        elements.sendKeysMethod(elements.getEmailInput(), "campusc10003@techno.com");
        elements.sendKeysMethod(elements.getPhoneInput(), "1002003000");
        elements.sendKeysMethod(elements.getPasswordButton(), "Na123");
        elements.clickMethod(elements.getCheckBox());
    }

    @Then("user should see the error message under the password confirm field")
    public void userShouldSeeTheErrorMessageUnderThePasswordConfirmField() {
        Assert.assertTrue(elements.getConfirmPasswordErrorMessage().isDisplayed());
    }
}
