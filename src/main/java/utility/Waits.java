package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
    private WebDriverWait wait;

    public Waits(WebDriver driver) {
        wait = new WebDriverWait(driver, 10);
    }


    public void waitElement(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));

    }
}
