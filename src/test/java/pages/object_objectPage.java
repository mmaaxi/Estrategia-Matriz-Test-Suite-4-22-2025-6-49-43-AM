package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectObjectPage {

    WebDriver driver;

    public ObjectObjectPage() {
        driver = new ChromeDriver();
    }

    public void navigateToObjectPage() {
        driver.get("http://example.com/object_object");
    }

    public void performAction(int actionNumber) {
        WebElement element = driver.findElement(By.id("action" + actionNumber));
        element.click();
    }

    public boolean verifyResult(int resultNumber) {
        WebElement resultElement = driver.findElement(By.id("result" + resultNumber));
        return resultElement.isDisplayed();
    }

    public void closeBrowser() {
        driver.quit();
    }
}