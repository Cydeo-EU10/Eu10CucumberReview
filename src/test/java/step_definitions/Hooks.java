package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.*;
import org.openqa.selenium.*;
import utilities.*;

public class Hooks {


    @Before(value = "@smoke")
    public void init(){
        System.out.println("This is running before every step definitions");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
