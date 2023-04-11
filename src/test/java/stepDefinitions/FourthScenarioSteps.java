package stepDefinitions;

import Pages.CommonMethods;
import Pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utils.Hooks;

public class FourthScenarioSteps extends Hooks {
    ResultPage resultPage = new ResultPage();
    CommonMethods commonMethods = new CommonMethods();
    @And("the user selects yes or no for Are you pregnant")
    public void theUserSelectsYesOrNoForAreYouPregnant() {
        commonMethods.clickYes();
        commonMethods.Start();
    }
    @And("the user selects yes or no for Do you have an injury  by serving in armed forces")
    public void theUserSelectsYesOrNoForDoYouHaveAnInjuryByServingInArmedForces() {
        commonMethods.clickYes();
        commonMethods.Start();
    }
    @And("the user selects yes  for Do you have diabetes")
    public void theUserSelectsYesForDoYouHaveDiabetes() {
        commonMethods.clickYes();
        commonMethods.Start();
    }

    @And("the user selects yes for Do you need to take medication")
    public void theUserSelectsYesForDoYouNeedToTakeMedication() {
        commonMethods.clickYes();
        commonMethods.Start();
    }
    @And("the user selects yes for Do you live permanently in a care home?")
    public void theUserSelectsYesForDoYouLivePermanentlyInACareHome() {
        commonMethods.clickYes();
        commonMethods.Start();
    }
    @And("the user selects yes for Do you get help from local council")
    public void theUserSelectsYesForDoYouGetHelpFromLocalCouncil() {
        commonMethods.clickYes();
        commonMethods.Start();
    }
    @Then("user can apply for help with NHS costs")
    public void userCanApplyForHelpWithNHSCosts() {
        resultPage.validateResultSinglePerson();
    }
}
