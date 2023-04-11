package utils;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static final WebDriver driver = BrowserManager.createDriver();

}
