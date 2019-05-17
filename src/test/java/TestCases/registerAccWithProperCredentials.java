package TestCases;

import POM.HomePage;
import POM.RegisterPage;
import org.testng.annotations.Test;

public class registerAccWithProperCredentials extends BaseTest {

    //public HomePage.java home;
    public RegisterPage registerPage;

    private void initializeRegisterPage() {
        if(registerPage == null) {
            registerPage = new RegisterPage(driver);
        }
    }

    @Test
    public void registerAccWithProperCredentials() {
        openHomePage();
        HomePage home = new HomePage(driver);
        home.clickRegisterOnHomePage();
        RegisterPage registerObject = new RegisterPage(driver);
        registerObject.checkRegisterTitle();
        registerObject.clickFormFields("customer.firstName", "Gas");
        registerObject.clickFormFields("customer.lastName", "Pedal");
        registerObject.clickFormFields("customer.address.street", "Mexican burrito, Nr. 3");
        registerObject.clickFormFields("customer.address.city", "Buritto Town");
        registerObject.clickFormFields("customer.address.state", "Mexico");
        registerObject.clickFormFields("customer.address.zipCode", "112");
        registerObject.clickFormFields("customer.phoneNumber", "777444333");
        registerObject.clickFormFields("customer.ssn", "1212");
        registerObject.clickFormFields("customer.username", "bro");
        registerObject.clickFormFields("customer.password", "bro");
        registerObject.clickFormFields("repeatedPassword", "bro");
        registerObject.clickRegisterButton();
        registerObject.clickLogOut();
    }
}