package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class Steps20 {
    NurPOMPage elements = new NurPOMPage();

    @And("view the Privacy policy checkbox option")
    public void viewThePrivacyPolicyCheckboxOption() {
        Assert.assertFalse(elements.getCheckBox().isSelected());
    }
}
