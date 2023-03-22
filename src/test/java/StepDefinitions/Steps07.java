package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Steps07 {
    NurPOMPage elements=new NurPOMPage();
    @And("Click on My account dop menu")
    public void clickOnMyAccountDopMenu() {
        elements.clickMethod(elements.getMyAccountButton());
    }

    @And("click on login option")
    public void clickOnLoginOption() {
        elements.clickMethod(elements.getLoginButtonUnderDropdown());

    }

    @And("Click on the Continue button inside of new customer box")
    public void clickOnTheContinueButtonInsideOfNewCustomerBox() {
        elements.clickMethod(elements.getContinueButtonInNewCustomerBox());
    }

    @Then("click on Register button on the column")
    public void clickOnRegisterButtonOnTheColumn() {
        elements.clickMethod(elements.getRegisterOnTheColumn());
    }

    @Then("user should see the register account page")
    public void userShouldSeeTheRegisterAccountPage() {
        Assert.assertTrue(elements.getRegisterAccountPage().isDisplayed());
    }
}
