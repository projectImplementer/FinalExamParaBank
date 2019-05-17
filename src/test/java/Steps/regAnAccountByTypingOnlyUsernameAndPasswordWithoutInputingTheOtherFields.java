package Steps;

import POM.HomePage;
import POM.RegisterPage;
import TestCases.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class regAnAccountByTypingOnlyUsernameAndPasswordWithoutInputingTheOtherFields extends BaseTest {

    public HomePage home;
    public RegisterPage register;

    private void initializeRegisterPage() {
        if(register == null) {
            register = new RegisterPage(driver);
        }
    }

    @When("^On Register page$")
    public void onRegisterPage() {
        home = new HomePage(driver);
        home.clickRegisterOnHomePage();
        initializeRegisterPage();
    }

    @Then("^If Register form is displayed - Input All The Needed Credentials using only username, password and repeat password fields.$")
    public void ifRegisterFormIsDisplayedInputAllTheNeededCredentialsUsingOnlyUsernamePasswordAndRepeatPasswordFields() {
        register.checkRegisterTitle();
        register.clickFormFields("customer.username", "Mexico");
        register.clickFormFields("customer.password", "Mexico");
        register.clickFormFields("repeatedPassword", "Mexico");
        register.clickRegisterButton();

    }
}
