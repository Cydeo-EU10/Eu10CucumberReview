package step_definitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import pages.*;
import utilities.*;

public class VyTrackLoginTest {



    VyTrackLoginPage loginPage = new VyTrackLoginPage();
    DashboardPage dashboardPage = new DashboardPage();
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
    public void user_is_on_the_dashboard_page() throws InterruptedException {
        Thread.sleep(3000);
        String actual = dashboardPage.header.getText();
        String expected = "Quick Launchpad";
        Assert.assertEquals(expected,actual);
    }

    @Then("user is getting alert message")
    public void user_is_getting_alert_message() {
        String actualMsg = loginPage.msg.getText();
        String expectedMsg = "Invalid user name or password.";
        Assert.assertEquals(expectedMsg,actualMsg);
    }
}
