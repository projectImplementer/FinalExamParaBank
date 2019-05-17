package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Page Factory
    @FindBy(xpath = "//*[@id=\"loginPanel\"]/p[2]/a")
    WebElement registerButton;
    //


    // Methods
    public void clickRegisterOnHomePage() {
        driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
        if(registerButton.isDisplayed()) {
            registerButton.click();
            System.out.println("- register button displayed");
        } else {
            System.out.println("- register button not displayed");
        }
    }

    //
}
////div[@id='loginPanel']/p/a[contains(text(),'Register')]