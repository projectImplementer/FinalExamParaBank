package POM;

import TestCases.BaseTest;
import framework.Dictionary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Parameters;

import java.util.HashMap;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    // Page Factory
    @FindBy(xpath = "//div[@id='rightPanel']/h1[@class='title']")
    WebElement checkTitle;
    @FindBy(xpath = "//*[@id=\"customerForm\"]")
    WebElement checkFormLayout;
    @FindBy(xpath = "//*[@id=\"customer.firstName\"]")
    WebElement firstName;
    @FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
    WebElement registerButton;
    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[8]/a")
    WebElement logOut;
    //

    // Methods
    public void checkRegisterTitle() {
        if (checkTitle.isDisplayed()) {
            System.out.println("- title is displayed");
        } else {
            System.out.println(" - title is not displayed");
        }
    }

    public void clickFormFields(String name, String input) {
        if (checkFormLayout.isDisplayed()) {
            //firstName.click();
            Dictionary dict = new Dictionary();
            HashMap<String, WebElement> form = dict.getContactForm(driver);
            for (String element : form.keySet()) {
                if (element.contains(name)) {
                    System.out.println("Form item: " + name + " found");
                    form.get(name).sendKeys(input);
                    break;
                } else {
                    System.out.println("The desired form item " + name + " cannot be found in this list");
                }
            }
        }
    }

    public void clickRegisterButton() {
        if(registerButton.isDisplayed()) {
            System.out.println("- register button is displayed");
            registerButton.click();
        } else {
            System.out.println("- register button is not displayed");
        }
    }

    public void clickLogOut() {
        if(logOut.isDisplayed()) {
            System.out.println("- log out button is displayed");
            logOut.click();
        } else {
            System.out.println("- log out button is not displayed");
        }
    }
    //
}
