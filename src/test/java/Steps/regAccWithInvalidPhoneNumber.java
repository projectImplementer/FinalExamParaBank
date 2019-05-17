package Steps;

import POM.HomePage;
import POM.RegisterPage;
import TestCases.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class regAccWithInvalidPhoneNumber extends BaseTest {


    public HomePage home;
    public RegisterPage register;

    private void initializeRegisterPage() {
        if(register == null) {
            register = new RegisterPage(driver);
        }
    }

    @When("^On Register Page$")
    public void onRegisterPage() {
        home = new HomePage(driver);
        home.clickRegisterOnHomePage();
        initializeRegisterPage();
    }

    @Then("^If Register form is displayed - Input All The Needed Credentials including the invalid phone number$")
    public void ifRegisterFormIsDisplayedInputAllTheNeededCredentialsIncludingTheInvalidPhoneNumber() {
        register.checkRegisterTitle();
        register.clickFormFields("customer.firstName", "Gas");
        register.clickFormFields("customer.lastName", "Pedal");
        register.clickFormFields("customer.address.street", "Mexican burrito, Nr. 3");
        register.clickFormFields("customer.address.city", "Buritto Town");
        register.clickFormFields("customer.address.state", "Mexico");
        register.clickFormFields("customer.address.zipCode", "112");
        register.clickFormFields("customer.phoneNumber", "Beer Works with Burrito");
        register.clickFormFields("customer.ssn", "1212");
        register.clickFormFields("customer.username", "Pepito");
        register.clickFormFields("customer.password", "Pepito");
        register.clickFormFields("repeatedPassword", "Pepito");
        register.clickRegisterButton();
    }


}
