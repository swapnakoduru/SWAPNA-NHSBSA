package stepDefinitions;

import Pages.CommonMethods;
import Pages.ResultPage;
import Pages.UniversalCreditPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utils.Hooks;

public class ThirdScenarioSteps extends Hooks {
    CommonMethods commonMethods = new CommonMethods();
    UniversalCreditPage universalCreditPage = new UniversalCreditPage();
    ResultPage resultPage = new ResultPage();
    @Then("the user selects yes for Do you live with a partner")
    public void the_user_selects_yes_for_Do_you_live_with_a_partner() {
        commonMethods.clickYes();
        commonMethods.Start();
    }
    @And("the user selects no for Do you live with a partner")
    public void theUserSelectsNoForDoYouLiveWithAPartner() {
        commonMethods.clickNo();
        commonMethods.Start();

    }
    @Then("the user selects yes for Do you or your partner claim any benefits or tax credits")
    public void the_user_selects_yes_for_Do_you_or_your_partner_claim_any_benefits_or_tax_credits() {
        commonMethods.clickYes();
        commonMethods.Start();
    }
    @And("the user selects no for Do you claim any benefits or tax credits")
    public void theUserSelectsNoForDoYouClaimAnyBenefitsOrTaxCredits() {
        commonMethods.clickNo();
        commonMethods.Start();
    }
    @Then("the user selects yes we receive universal credit payments for Universal Credit Page")
    public void the_user_selects_yes_we_receive_universal_credit_payments_for_Universal_Credit_Page() {
        universalCreditPage.reciievesUniversalCredit();
        commonMethods.Start();
    }
    @Then("the user selects yes for joint Universal Credit Page")
    public void the_user_selects_yes_for_joint_Universal_Credit_Page() {
        commonMethods.clickYes();
        commonMethods.Start();
    }
    @And("the user selects yes for take home pay Page")
    public void theUserSelectsYesForTakeHomePayPage() {
        commonMethods.clickYes();
        commonMethods.Start();
    }
    @Then("the user will get free NHS help")
    public void theUserWillGetFreeNHSHelp() {
        resultPage.validateResultAdult();
    }
}
