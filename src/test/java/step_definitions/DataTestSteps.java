package step_definitions;

import io.cucumber.java.en.*;
import io.cucumber.java.et.*;
import org.junit.*;
import org.openqa.selenium.*;
import pages.*;
import utilities.*;

public class DataTestSteps {

    ShoppingPage sp = new ShoppingPage();
    String actualPrice;

    @When("user provide {string}")
    public void user_provide(String name) {
        WebElement price = Driver.getDriver().findElement(By.xpath("(//div[.='" + name + "']/../../../div)[2]/div"));
        actualPrice = (String)((JavascriptExecutor) Driver.getDriver()).executeScript("return arguments[0].childNodes[1].textContent;",price);
    }
    @Then("the price should equal to {string}")
    public void the_price_should_equal_to(String expectedPrice) {
        Assert.assertEquals(expectedPrice,actualPrice);
    }
}
