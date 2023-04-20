package Pages;

import base.PageUrls;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Hooks;


public class CommonMethods extends Hooks {
    @FindBy(how= How.ID,using="next-button")
    public WebElement Next;
    @FindBy(how= How.ID,using="radio-yes")
    public WebElement YesButton;

    @FindBy(how= How.ID,using="radio-no")
    public WebElement NoButton;

    @FindBy(how = How.ID, using = "nhsuk-cookie-banner__link_accept_analytics")
    public static WebElement cookies;
    public CommonMethods() {
        PageFactory.initElements(driver, this);
    }

    public static void getValidatePage(String pageName) {
        driver.get(PageUrls.getPageUrl(pageName));
        Assert.assertEquals(PageUrls.getPageUrl(pageName),driver.getCurrentUrl().replaceAll("#",""));

        try {
            cookies.click();}
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickYes(){
        YesButton.click();
    }

    public void clickNo(){
        NoButton.click();
    }


    public void Start()
    {
        Next.submit();

    }

}
