package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Steps08 {
    NurPOMPage elements=new NurPOMPage();
    @And("Enter all the necessary fields")
    public void enterAllTheNecessaryFields() {
        elements.sendKeysMethod(elements.getFirstNameInput(), "nour");
        elements.sendKeysMethod(elements.getLastNameInput(), "akcay");
        elements.sendKeysMethod(elements.getEmailInput(), "campusc12@techno.com");
        elements.sendKeysMethod(elements.getPhoneInput(), "1002003000");
    }

    @And("Enter password {string} into  password field")
    public void enterPasswordIntoPasswordField(String password) {
        elements.sendKeysMethod(elements.getPasswordButton(),password);
    }

    @And("Enter different password {string}into password confirm field")
    public void enterDifferentPasswordIntoPasswordConfirmField(String confirm) {
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), confirm);
    }

    @Then("user should see the error message under the password box")
    public void userShouldSeeTheErrorMessageUnderThePasswordBox() {
        Assert.assertTrue(elements.getPasswordNotMatch().getText().contains("confirmation"));

    }
}
