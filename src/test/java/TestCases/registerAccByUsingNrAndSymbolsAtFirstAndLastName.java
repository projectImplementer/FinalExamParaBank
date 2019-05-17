package TestCases;

import POM.HomePage;
import POM.RegisterPage;
import org.testng.annotations.Test;

public class registerAccByUsingNrAndSymbolsAtFirstAndLastName extends BaseTest {

    @Test
    public void registerAccByUsingNrAndSymbolsAtFirstAndLastName() {
        openHomePage();
        HomePage home = new HomePage(driver);
        home.clickRegisterOnHomePage();
        RegisterPage registerObject = new RegisterPage(driver);
        registerObject.checkRegisterTitle();
        registerObject.clickFormFields("customer.firstName", "213213@@#");
        registerObject.clickFormFields("customer.lastName", "3244324242423423432!!#@$#@$@%");
        registerObject.clickFormFields("customer.address.street", "Star");
        registerObject.clickFormFields("customer.address.city", "Stary");
        registerObject.clickFormFields("customer.address.state", "Staros");
        registerObject.clickFormFields("customer.address.zipCode", "11");
        registerObject.clickFormFields("customer.phoneNumber", "1123");
        registerObject.clickFormFields("customer.ssn", "1");
        registerObject.clickFormFields("customer.username", "Africa");
        registerObject.clickFormFields("customer.password", "Africa");
        registerObject.clickFormFields("repeatedPassword", "Africa");
        registerObject.clickRegisterButton();
    }
}
