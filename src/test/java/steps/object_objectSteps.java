package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.ObjectObjectPage;

public class ObjectObjectSteps {

    ObjectObjectPage objectPage = new ObjectObjectPage();

    @Given("I am on the object Object page")
    public void i_am_on_the_object_object_page() {
        objectPage.navigateToObjectPage();
    }

    @When("I perform object Object action {int}")
    public void i_perform_object_object_action(int actionNumber) {
        objectPage.performAction(actionNumber);
    }

    @Then("I should see the object Object result {int}")
    public void i_should_see_the_object_object_result(int resultNumber) {
        assertTrue(objectPage.verifyResult(resultNumber));
    }
}