package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.HashMap;


public class Dictionary {

    public HashMap<String, WebElement> getContactForm(WebDriver driver) {

        List<WebElement> elements = driver.findElements(By.xpath("//form[@id='customerForm']//table/tbody/tr/td/input"));
        HashMap<String, WebElement> registerForm = new java.util.HashMap<String, WebElement>();
        for (WebElement element : elements) {
            registerForm.put(element.getAttribute("id"), element);
        }
        return registerForm;
    }

}