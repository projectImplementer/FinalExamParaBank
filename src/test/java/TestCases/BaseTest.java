package TestCases;

import framework.RunBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    public static WebDriver driver;

    public BaseTest() {

    }
    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }


    public void openHomePage() {
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }


    @Parameters({"browserName"})
    @BeforeTest
    public void startChrome(String browserName){
        driver = RunBrowser.chooseBrowser(browserName);
    }

    @AfterTest
    public void quitChrome() {
        driver.quit();
    }
}

