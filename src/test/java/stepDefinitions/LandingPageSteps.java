package stepDefinitions;

import Pages.LandingPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import utils.Hooks;


public class LandingPageSteps extends Hooks {
  LandingPage landingPage;
  @Before
  public void setUp() throws InterruptedException {
    landingPage = new LandingPage();
  }
  @After
  public void closeBrowser(){
    System.out.println("/////////////////////////");
    System.out.println("close the browser");
  }

  @When("the user clicks on start button")
  public void the_user_clicks_on_start_button() {
    landingPage.Start();
  }


}


