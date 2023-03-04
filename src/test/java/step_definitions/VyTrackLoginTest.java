package step_definitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import pages.*;
import utilities.*;

public class VyTrackLoginTest {

    VyTrackLoginPage loginPage = new VyTrackLoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
    }
    @When("user enters {string} and {string} as credentials")
    public void user_enters_and_as_credentials(String username, String password) {
        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.submitBtn.click();
    }
    @Then("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
