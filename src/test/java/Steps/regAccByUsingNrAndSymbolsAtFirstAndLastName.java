package Steps;

import POM.HomePage;
import POM.RegisterPage;
import TestCases.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class regAccByUsingNrAndSymbolsAtFirstAndLastName extends BaseTest {

    public HomePage home;
    public RegisterPage register;

    private void initializeRegisterPage() {
        if(register == null) {
            register = new RegisterPage(driver);
        }
    }


    @When("on RegisterPage")
    public void onRegisterPage() {
        home = new HomePage(driver);
        home.clickRegisterOnHomePage();
        initializeRegisterPage();
    }


    @Then("If Register form is displayed - Input All The Needed Credentials using symbols and numbers at first and last name")
    public void ifRegisterFormIsDisplayedInputAllTheNeededCredentialsUsingSymbolsAndNumbersAtFirstAndLastName() {
        register.checkRegisterTitle();
        register.clickFormFields("customer.firstName", "213213@@#");
        register.clickFormFields("customer.lastName", "3244324242423423432!!#@$#@$@%");
        register.clickFormFields("customer.address.street", "Star");
        register.clickFormFields("customer.address.city", "Stary");
        register.clickFormFields("customer.address.state", "Staros");
        register.clickFormFields("customer.address.zipCode", "11");
        register.clickFormFields("customer.phoneNumber", "1123");
        register.clickFormFields("customer.ssn", "1");
        register.clickFormFields("customer.username", "Africa");
        register.clickFormFields("customer.password", "Africa");
        register.clickFormFields("repeatedPassword", "Africa");
        register.clickRegisterButton();
    }
}
