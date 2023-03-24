package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Steps22 {
    NurPOMPage elements = new NurPOMPage();

    @And("Enter password and confirmation password")
    public void enterPasswordAndConfirmationPassword() {
        elements.sendKeysMethod(elements.getPasswordButton(), "Na123");
        elements.sendKeysMethod(elements.getConfirmPasswordButton(), "Na123");
    }

    @Then("user should see the hidden signs in password and confirm password button")
    public void userShouldSeeTheHiddenSignsInPasswordAndConfirmPasswordButton() {
        Assert.assertEquals(elements.getPasswordButton().getAttribute("value"),".....");
        Assert.assertEquals(elements.getConfirmPasswordButton().getAttribute("value"),".....");

    }
}
