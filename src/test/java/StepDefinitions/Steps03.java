package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Steps03 {
    NurPOMPage elements = new NurPOMPage();

    @Then("Click on the Continue button that is displayed in the success page")
    public void clickOnTheContinueButtonThatIsDisplayedInTheSuccessPage() {
        elements.clickMethod(elements.getContinue2Button());
        Assert.assertTrue(elements.getMyAccountHeader().getText().contains("My"));
    }
}
