package step_definitions;

import org.junit.*;
import org.openqa.selenium.*;
import utilities.*;

public class Hooks {


    @Before
    public void init(){
        System.out.println("This is running before every step definitions");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
