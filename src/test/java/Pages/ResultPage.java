package Pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigManager;
import utils.Hooks;

public class ResultPage extends Hooks {
ConfigManager configManager = new ConfigManager();

    public ResultPage(){
        PageFactory.initElements(driver, this);
    }

    public void validateNirResult()
    {
        configManager.waitForTheTitle("You cannot");
        Assert.assertEquals(driver.getTitle(), "You cannot use this service because you live in Northern Ireland - Check what help you could get to pay for NHS costs - NHSBSA");
    }
    public void validateResultAdult()
    {
        configManager.waitForTheTitle("Because");
        Assert.assertEquals(driver.getTitle(),
                "Because you or your partner get qualifying universal credit you get help paying NHS costs - " +
                        "Check what help you could get to pay for NHS costs - NHSBSA");

    }
    public void validateResultChild()
    {
        configManager.waitForTheTitle("Because");
        Assert.assertEquals(driver.getTitle(), "Because you're under 16 you get help paying NHS costs - Check what help you could get to pay for NHS costs - NHSBSA");
    }
    public void validateResultSinglePerson()
    {
        configManager.waitForTheTitle("Because");
       Assert.assertEquals(driver.getTitle(), "Because you get help from your local council to pay for your care home - Check what help you could get to pay for NHS costs - NHSBSA");
    }


}

