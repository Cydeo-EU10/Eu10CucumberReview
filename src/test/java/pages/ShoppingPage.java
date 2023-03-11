package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class ShoppingPage {

    public ShoppingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "div.app_logo")
    public WebElement title;
}
