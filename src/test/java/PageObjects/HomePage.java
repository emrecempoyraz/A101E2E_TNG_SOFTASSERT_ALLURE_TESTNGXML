package PageObjects;

import TestManager.IDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement acceptCookie ;

    @FindBy(xpath = "(//form//input[@name='search_text'])[1]")
    private WebElement searchForm ;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement submitButton ;

    public void acceptCookies () {
        helper.clickElement(acceptCookie);
    }

    public void searchProduct () {
        helper.clickElement(searchForm);
        helper.sendKeysTo(searchForm, IDriver.PRODUCT);
        helper.clickElement(submitButton);
    }



}
