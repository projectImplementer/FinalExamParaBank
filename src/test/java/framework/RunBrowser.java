package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RunBrowser {

    public static WebDriver driver;

    public RunBrowser() {
    }

    public static WebDriver chooseBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
            return driver;
        } else {
            return null;
        }
    }
}
