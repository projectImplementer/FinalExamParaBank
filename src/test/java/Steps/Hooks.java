package Steps;

import TestCases.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.RunBrowser;

public class Hooks extends BaseTest {


    @Before
    public void initializeTest() {
        driver = RunBrowser.chooseBrowser("chrome");
        System.out.println("start the browser");
        openHomePage();
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("quit the browser");
    }

}
