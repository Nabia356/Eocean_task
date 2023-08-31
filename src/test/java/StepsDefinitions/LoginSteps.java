package StepsDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.BrowserFactory;
import managers.PageObjectManager;
import utilities.BaseTest;

public class LoginSteps extends BaseTest {

    BrowserFactory browserFactory = new BrowserFactory();
    PageObjectManager pageObjectManager = new PageObjectManager(browserFactory.getDriver());

    @Given("^navigate to the website$")
    public void navigate_to_the_website() throws Throwable {
        pageObjectManager.getloginPage().launchEnvironment();
    }


    @When("^user has to login$")
    public void userHasToLogin() throws Throwable {
        pageObjectManager.getloginPage().login();

    }

    @Then("^logout user$")
    public void logoutUser() throws Throwable{
        pageObjectManager.getloginPage().logout();
    }
}
