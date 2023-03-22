package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Steps06 {
    NurPOMPage elements=new NurPOMPage();
    @And("Click on the no button of NewsLetter")
    public void clickOnTheNoButtonOfNewsLetter() {
        elements.clickMethod(elements.getNewsLetterNoButton());
    }

    @Then("user should see no button on newsletter is displayed")
    public void userShouldSeeNoButtonOnNewsletterIsDisplayed() {
    }
}
