package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//span[@class='current-price']")
    private WebElement currentPrice ;

    @FindBy(xpath = "//em[@class='js-total-amount']")
    private WebElement totalAmount ;

    public boolean isOnCartPage () {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.a101.com.tr/baskets/basket/";
        return actualUrl.equals(expectedUrl);
    }

    public boolean isPricesSame () {
        String actualProductPrice = currentPrice.getText();
        String totalBasketPrice = totalAmount.getText();
        return actualProductPrice.equals(totalBasketPrice);
    }
}
