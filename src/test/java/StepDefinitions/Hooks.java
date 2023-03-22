package StepDefinitions;

import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void beforeScenario() {
        System.out.println("Scenario has started");
    }

//    @After
//    public void afterScenario() {
//        BasicDriver.quitDriver();
//        System.out.println("Scenario has ended");
//    }
}
