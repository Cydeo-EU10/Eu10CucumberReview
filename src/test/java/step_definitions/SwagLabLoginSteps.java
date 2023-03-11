package step_definitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import pages.*;
import utilities.*;

public class SwagLabLoginSteps {

    LabLoginPage login = new LabLoginPage();

    @Given("user goes to the login page")
    public void user_goes_to_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("swaglab.url"));
    }
    @When("user login with validate credentials")
    public void user_login_with_validate_credentials() {
        login.usernameInput.sendKeys(ConfigurationReader.getProperty("swaglab.username"));
        login.passwordInput.sendKeys(ConfigurationReader.getProperty("swaglab.password"));
        login.loginBtn.click();
    }
    @Then("user is on the dashboard")
    public void user_is_on_the_dashboard() {

    }
}
