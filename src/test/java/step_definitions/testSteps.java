package step_definitions;

import io.cucumber.java.en.*;
import org.junit.*;

public class testSteps {

    @Given("call the print method")
    public void call_the_print_method() {
        System.out.println("Print method is called");
    }
    @When("provide some data as argument")
    public void provide_some_data_as_argument() {
        System.out.println("Username is provided as argument");
    }
    @Then("we should see argument in console")
    public void we_should_see_argument_in_console() {
        Assert.assertEquals("console","console");
    }
}
