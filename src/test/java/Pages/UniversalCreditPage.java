package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Hooks;

public class UniversalCreditPage extends Hooks {
    @FindBy(how= How.ID,using="yes-universal")
    public WebElement YesUniversalCredit;
    public UniversalCreditPage(){

        PageFactory.initElements(driver, this);
    }
    public void reciievesUniversalCredit(){

        YesUniversalCredit.click();
    }



}
