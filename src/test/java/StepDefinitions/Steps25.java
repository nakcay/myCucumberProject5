package StepDefinitions;

import Pages.NurPOMPage;
import UtilityPacage.BasicDriver;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class Steps25 {
    NurPOMPage elements = new NurPOMPage();

    @And("user should see the Breadcrumb, Page Heading, Page URL, Page Title of Register Account Page")
    public void userShouldSeeTheBreadcrumbPageHeadingPageURLPageTitleOfRegisterAccountPage() {
        Assert.assertTrue(elements.getBreadCrumbBox().isDisplayed());
        Assert.assertTrue(elements.getAccountHeaderOnRegisterPage().isDisplayed());
        Assert.assertEquals(BasicDriver.getDriver().getCurrentUrl(), "https://opencart.abstracta.us/index.php?route=account/register");
    Assert.assertEquals(BasicDriver.getDriver().getTitle(),"Register Account");
    }
}