package step_definitions;

import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;
import pages.*;

import java.util.*;

public class DashboardTest {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("user should see menu options")
    public void user_should_see_menu_options(List<String> expectedOptions) throws InterruptedException {
        Thread.sleep(3000);
        List<String> actualOptions = new ArrayList<>();
        for (WebElement menu : dashboardPage.options) {
            actualOptions.add(menu.getText());
        }
        Assert.assertEquals(expectedOptions,actualOptions);

    }

}
