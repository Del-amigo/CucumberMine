package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I want to print to console$")
    public void iWantToPrintToConsole() {
        System.out.println("I want to print to console");
    }

    @Then("^I get text in console$")
    public void iGetTextInConsole() {
        System.out.println("I get text in Console");
    }

    @When("^I print to console$")
    public void iPrintToConsole() {
        System.out.println("I print to console");
    }
}
