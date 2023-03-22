package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Steps05 {
    NurPOMPage elements=new NurPOMPage();
    @And("Click on the yes button of NewsLetter")
    public void clickOnTheYesButtonOfNewsLetter() {
        elements.clickMethod(elements.getNewsLetterYesButton());
    }

    @Then("user should see the yes button as a clicked")
    public void userShouldSeeTheYesButtonAsAClicked() {
        Assert.assertTrue(elements.getNewsLetterYesButton().isDisplayed());
    }

    @And("click on the Newsletter")
    public void clickOnTheNewsletter() {
        elements.clickMethod(elements.getNewsLetterButton());
    }
}
