package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Steps13 {
    NurPOMPage elements = new NurPOMPage();

    @And("View the fields")
    public void viewTheFields() {
        System.out.println(elements.getFirstNameInput().getDomProperty("placeholder"));
        System.out.println(elements.getLastNameInput().getDomProperty("placeholder"));
        System.out.println(elements.getEmailInput().getDomProperty("placeholder"));
        System.out.println(elements.getPhoneInput().getDomProperty("placeholder"));
        System.out.println(elements.getPasswordButton().getDomProperty("placeholder"));
        System.out.println(elements.getConfirmPasswordButton().getDomProperty("placeholder"));
    }

    @Then("user should see the name of placeholders are displayed")
    public void userShouldSeeTheNameOfPlaceholdersAreDisplayed() {
        Assert.assertEquals(elements.getFirstNameInput().getDomProperty("placeholder"), "First Name");
        Assert.assertEquals(elements.getLastNameInput().getDomProperty("placeholder"), "Last Name");
        Assert.assertEquals(elements.getEmailInput().getDomProperty("placeholder"), "E-Mail");
        Assert.assertEquals(elements.getPhoneInput().getDomProperty("placeholder"), "Telephone");
        Assert.assertEquals(elements.getPasswordButton().getDomProperty("placeholder"), "Password");
        Assert.assertEquals(elements.getConfirmPasswordButton().getDomProperty("placeholder"), "Password Confirm");



    }
}