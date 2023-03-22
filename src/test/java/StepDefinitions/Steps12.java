package StepDefinitions;

import Pages.NurPOMPage;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Steps12 {
    NurPOMPage elements=new NurPOMPage();

    @And("Enter new Account Fields buttons using action")
    public void enterNewAccountFieldsButtonsUsingAction() {
        Actions actions=new Actions(BasicDriver.getDriver());
        elements.sendKeysMethod(elements.getFirstNameInput(),"nour"+ Keys.TAB+"ak"+Keys.TAB+"techno00001@gmail.ca"+Keys.TAB+"1002003333"+Keys.TAB+"12345"+Keys.TAB+"12345"+Keys.TAB+Keys.TAB+Keys.TAB+Keys.SPACE+Keys.TAB+Keys.ENTER);


    }

    @Then("user should see the account  success page")
    public void userShouldSeeTheAccountSuccessPage() {
        Assert.assertTrue(elements.getAccountSuccess().isDisplayed());
    }
}
