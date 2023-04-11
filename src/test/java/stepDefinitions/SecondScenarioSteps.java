package stepDefinitions;

import Pages.CommonMethods;
import Pages.CountrySelectionPage;
import Pages.DateOfBirthPage;
import Pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.Hooks;

public class SecondScenarioSteps extends Hooks {
    CountrySelectionPage countrySelectionPage = new CountrySelectionPage();
    DateOfBirthPage dateOfBirthPage = new DateOfBirthPage();
    CommonMethods commonMethods = new CommonMethods();
    ResultPage resultPage = new ResultPage();

    @Then("the user selects the {string}")
    public void theUserSelectsThe(String Country) {
        countrySelectionPage.selectCountry(Country);
    }
    @And("the user selects yes or no for GP practice in scotland or wales")
    public void theSelectsYesOrNoForGPPracticeInScotlandOrWales() {
        commonMethods.clickYes();
        commonMethods.Start();
    }
    @Given("the user is less than sixteen years of age {string} {string} {string}")
    public void the_user_is_less_than_years_of_age( String day, String month, String year) {
        dateOfBirthPage.EnterDatOfBirth(day,month,year);
        dateOfBirthPage.Submit();
    }
    @Then("the user should get free NHS help")
    public void theUserShouldGetFreeNHSHelp() {
        resultPage.validateResultChild();
    }
}
