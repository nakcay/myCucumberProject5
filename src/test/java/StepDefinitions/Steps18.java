package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;

public class Steps18 {
    NurPOMPage elements=new NurPOMPage();
    @And("Check the fields all mandatory fields depend on the client requirements")
    public void checkTheFieldsAllMandatoryFieldsDependOnTheClientRequirements() {
        System.out.println( elements.getFirstNameInput().getDomProperty("size"));
        System.out.println( elements.getLastNameInput().getDomProperty("size"));
        System.out.println( elements.getPasswordButton().getDomProperty("size"));
        System.out.println( elements.getConfirmPasswordButton().getDomProperty("size"));
        System.out.println( elements.getPhoneInput().getDomProperty("size"));
        System.out.println( elements.getEmailInput().getDomProperty("size"));
        System.out.println( elements.getContinueButton().getDomProperty("size"));
    }
}
