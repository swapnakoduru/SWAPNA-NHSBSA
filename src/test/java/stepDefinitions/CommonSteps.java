package stepDefinitions;

import Pages.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonSteps {

    CommonMethods commonMethods = new CommonMethods();
    @Given("the user is on {string}")
    public void theUserIsOn(String pageName) {
        commonMethods.getValidatePage(pageName);

    }
    @Then("^user navigates to \"([^\"]*)\" Page$")
    public void userNavigatesToPage(String pageName) {
        commonMethods.getValidatePage(pageName);

    }

}
