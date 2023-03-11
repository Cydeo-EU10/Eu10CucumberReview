package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

import java.util.*;

public class ShoppingPage {

    public ShoppingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "div.app_logo")
    public WebElement title;

    @FindBy(xpath = "//span[@class='title']")
    public WebElement subTitle;

    @FindBy(css = "div.inventory_item")
    public List<WebElement> items;
}
