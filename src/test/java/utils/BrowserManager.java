package utils;

import dataProviders.FileReaderManager;
import enums.DriverType;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;


public class BrowserManager {

    public static WebDriver driver;
    @Before
    public static WebDriver createDriver() {

        DriverType driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();

        switch (driverType) {
            case FIREFOX:
                FirefoxDriverManager.getInstance(FIREFOX).setup();
                driver = new FirefoxDriver();
                driver.manage().window().fullscreen();
                break;
            case CHROME:
                ChromeDriverManager.getInstance(CHROME).setup();
//                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();



                break;
        }

        return driver;

    }


    @After
    public void quitDriver() {

        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.close();
            try{
                driver.quit();
            }catch (Exception e){
                System.out.println("Browser closed already, " +
                        "did not need to quit after all");
                e.printStackTrace();
            }        }
    }

}
