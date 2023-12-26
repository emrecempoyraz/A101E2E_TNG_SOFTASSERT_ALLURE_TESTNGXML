package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    private WebElement addToCartButton;

    @FindBy(xpath = "(//a[@title='Sepet'])[1]")
    private WebElement viewBasket;



    public boolean isProductSelected () {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.a101.com.tr/elektronik/delonghi-eletta-cappuccino-ecam44-660-b-tam-otomatik-kahve-makinesi/";
        return actualUrl.equals(expectedUrl);
    }

    public void addToCart () {
        helper.clickElement(addToCartButton);
    }

    public void goToCart () {
        helper.clickElement(viewBasket);
    }
}
