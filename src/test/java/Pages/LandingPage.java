package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Hooks;


public class LandingPage extends Hooks {
    @FindBy(how=How.XPATH,using="//*[@id=\"next-button\"]")
    public WebElement startButton;
    public LandingPage(){
       PageFactory.initElements(driver, this);
    }
    public void Start()
    {
        startButton.submit();
    }


}
