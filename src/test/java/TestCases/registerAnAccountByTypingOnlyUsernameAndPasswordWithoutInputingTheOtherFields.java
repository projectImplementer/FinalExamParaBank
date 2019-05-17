package TestCases;

import POM.HomePage;
import POM.RegisterPage;
import org.testng.annotations.Test;

public class registerAnAccountByTypingOnlyUsernameAndPasswordWithoutInputingTheOtherFields extends BaseTest {

    @Test
    public void registerAnAccountByTypingOnlyUsernameAndPasswordWithoutInputingTheOtherFields() {
        openHomePage();
        HomePage home = new HomePage(driver);
        home.clickRegisterOnHomePage();
        RegisterPage registerObject = new RegisterPage(driver);
        registerObject.checkRegisterTitle();
        registerObject.clickFormFields("customer.username", "Mexico");
        registerObject.clickFormFields("customer.password", "Mexico");
        registerObject.clickFormFields("repeatedPassword", "Mexico");
        registerObject.clickRegisterButton();
    }
}
