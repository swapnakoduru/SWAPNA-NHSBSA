package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Hooks;

public class CountrySelectionPage extends Hooks {
    @FindBy(how = How.XPATH, using = "//*[@id=\"radio-nire\"]")
    public WebElement Nire;
    @FindBy(how = How.ID, using = "radio-england")
    public WebElement England;
    @FindBy(how = How.ID, using = "radio-scotland")
    public WebElement Scotland;
    @FindBy(how = How.ID, using = "radio-wales")
    public WebElement Wales;

    @FindBy(how = How.ID, using = "next-button")
    public WebElement Next;


    public CountrySelectionPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectCountry(String Country) {
        switch (Country) {
            case "England":
                England.click();
                break;
            case "Scotland":
                Scotland.click();
                break;
            case "Wales":
                Wales.click();
                break;
        }

        Next.click();
    }
        public void SelectNire() {
            Nire.click();
            Next.click();
        }

    }

