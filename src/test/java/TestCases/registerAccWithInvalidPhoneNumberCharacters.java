package TestCases;

import POM.HomePage;
import POM.RegisterPage;
import org.testng.annotations.Test;

public class registerAccWithInvalidPhoneNumberCharacters extends BaseTest {

    @Test
    public void registerAccWithInvalidPhoneNumberCharacter() {
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
        registerObject.clickFormFields("customer.phoneNumber", "Beer Works with Burrito");
        registerObject.clickFormFields("customer.ssn", "1212");
        registerObject.clickFormFields("customer.username", "Pepito");
        registerObject.clickFormFields("customer.password", "Pepito");
        registerObject.clickFormFields("repeatedPassword", "Pepito");
        registerObject.clickRegisterButton();
    }

}
