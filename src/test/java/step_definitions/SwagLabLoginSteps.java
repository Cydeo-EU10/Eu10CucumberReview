package step_definitions;

import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;
import pages.*;
import utilities.*;

public class SwagLabLoginSteps {

    LabLoginPage login = new LabLoginPage();
    ShoppingPage sp = new ShoppingPage();

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
        String expected = "Swag Labs";
        String actual = sp.title.getText();
        Assert.assertEquals(expected,actual);
    }

    @When("user login with invalid credentials")
    public void user_login_with_invalid_credentials() {
        login.usernameInput.sendKeys("invalid user name");
        login.passwordInput.sendKeys("invalid password");
        login.loginBtn.click();
    }
    @Then("user gets error messages")
    public void user_gets_error_messages() {
        String expected = "Epic sadface: Username and password do not match any user in this service";
        String  actual = login.errorMsg.getText();
        Assert.assertEquals("This is error message validation",expected, actual);
    }

}
