package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;

public class Steps19 {
    NurPOMPage elements =new NurPOMPage();
    @And("Enter new Account details with some spaces on the leading and tailing part")
    public void enterNewAccountDetailsWithSomeSpacesOnTheLeadingAndTailingPart() {
        elements.sendKeysMethod(elements.getFirstNameInput(), " nour ");
        elements.sendKeysMethod(elements.getLastNameInput(), " akcay ");
        elements.sendKeysMethod(elements.getEmailInput(), " campusc09@techno.com ");
        elements.sendKeysMethod(elements.getPhoneInput(), " 1002003000 ");
        elements.sendKeysMethod(elements.getPasswordButton(), " Na123 ");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), " Na123 ");
        elements.clickMethod(elements.getCheckBox());
    }
}
