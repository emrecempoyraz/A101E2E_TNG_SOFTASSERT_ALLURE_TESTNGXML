package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[@for='attributes_integration_brand3250']")
    private WebElement brandFilter ;

    @FindBy(xpath = "(//img[@class=' ls-is-cached lazyloaded'])[1]")
    private WebElement productLink ;



    public boolean isOnProductsPage () {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.a101.com.tr/elektronik/kahve-makinesi-elektrikli-cezve/?personaclick_search_query=kahve%20makinesi&personaclick_input_query=kahve%20makinesi" ;
        return actualUrl.equals(expectedUrl);
    }

    public void filterBrand () {
        helper.scrollDown(driver,400);
        helper.clickElement(brandFilter);
    }

    public void pickProduct () throws InterruptedException {
        Thread.sleep(5000);
        helper.clickElement(productLink);
    }
}
