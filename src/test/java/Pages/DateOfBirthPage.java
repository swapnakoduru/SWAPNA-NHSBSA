package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Hooks;

public class DateOfBirthPage extends Hooks {
    @FindBy(how= How.ID,using="dob-day")
    public WebElement Day;

    @FindBy(how= How.ID,using="dob-month")
    public WebElement Month;

    @FindBy(how= How.ID,using="dob-year")
    public WebElement Year;

    @FindBy(how= How.ID,using="next-button")
    public WebElement Next;

    public DateOfBirthPage(){
        PageFactory.initElements(driver, this);
    }
    public void EnterDatOfBirth(String day, String month, String year ){
        Day.sendKeys(day);
        Month.sendKeys(month);
        Year.sendKeys(year);
    }
    public void Submit(){ Next.submit();}
}
