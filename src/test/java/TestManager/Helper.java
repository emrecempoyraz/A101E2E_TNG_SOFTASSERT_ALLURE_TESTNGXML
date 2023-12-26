package TestManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {

    private WebDriver driver ;



    public Helper (WebDriver driver) {
        this.driver = driver ;
    }

    public void clickElement (WebElement element) {
        if (element.isDisplayed())
            element.click();
    }

    public void sendKeysTo (WebElement element , String text) {
        if (element.isDisplayed())
            element.click();
        element.clear();
        element.sendKeys(text);
    }

    public void scrollDown (WebDriver driver, int pixel) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + pixel + ")");
    }
}
