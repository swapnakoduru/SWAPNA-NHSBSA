package stepDefinitions;

import Pages.CommonMethods;
import Pages.CountrySelectionPage;
import Pages.ResultPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Hooks;

public class FirstScenarioSteps extends Hooks {
    CountrySelectionPage countrySelectionPage = new CountrySelectionPage();
    ResultPage resultPage = new ResultPage();
    @When("the user is from Nothern Ireland")
    public void the_user_is_from_Nothern_Ireland() {
        countrySelectionPage.SelectNire();
    }
    @Then("the user will not get any kind of help")
    public void the_user_will_not_get_any_kind_of_help() {
        resultPage.validateNirResult();
    }


}
