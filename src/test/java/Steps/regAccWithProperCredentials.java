package Steps;

import POM.HomePage;
import POM.RegisterPage;
import TestCases.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class regAccWithProperCredentials extends BaseTest {


    public HomePage home;
    public RegisterPage register;

    private void initializeRegisterPage() {
        if(register == null) {
            register = new RegisterPage(driver);
        }
    }

    // Scenario

    @When("^On register Page$")
    public void onRegisterPage() {
        home = new HomePage(driver);
        home.clickRegisterOnHomePage();
        initializeRegisterPage();
    }

    @Then("^Register form is displayed - Input All The Needed Credentials$")
    public void inputFirstName() {
        register.checkRegisterTitle();
        register.clickFormFields("customer.firstName", "Gas");
        register.clickFormFields("customer.lastName", "Pedal");
        register.clickFormFields("customer.address.street", "Mexican burrito, Nr. 3");
        register.clickFormFields("customer.address.city", "Buritto Town");
        register.clickFormFields("customer.address.state", "Mexico");
        register.clickFormFields("customer.address.zipCode", "112");
        register.clickFormFields("customer.phoneNumber", "777444333");
        register.clickFormFields("customer.ssn", "1212");
        register.clickFormFields("customer.username", "bro");
        register.clickFormFields("customer.password", "bro");
        register.clickFormFields("repeatedPassword", "bro");
    }

    @Then("^Log Out$")
    public void logOut() {
        register.clickLogOut();
    }
}
