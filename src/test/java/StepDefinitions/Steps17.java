package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;

public class Steps17 {
    NurPOMPage elements=new NurPOMPage();
    @And("Enter the fields without password")
    public void enterTheFieldsWithoutPassword() {
            elements.sendKeysMethod(elements.getFirstNameInput(), "nour");
            elements.sendKeysMethod(elements.getLastNameInput(), "akcay");
            elements.sendKeysMethod(elements.getEmailInput(), "campusc100003@techno.com");
            elements.sendKeysMethod(elements.getPhoneInput(), "1002003000");
            elements.clickMethod(elements.getCheckBox());
    }

    @And("Check entering simple {string}")
    public void checkEnteringSimple(String password) {
        elements.sendKeysMethod(elements.getPasswordButton(),password);
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), password);

    }
}
