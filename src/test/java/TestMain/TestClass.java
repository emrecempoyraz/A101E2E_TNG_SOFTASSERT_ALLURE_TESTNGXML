package TestMain;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductPage;
import PageObjects.ProductsPage;
import TestManager.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass extends BaseTest {


    SoftAssert softAssert = new SoftAssert();
    HomePage homePage ;
    ProductsPage productsPage ;
    ProductPage productPage ;
    CartPage cartPage ;


    @Description("A101E2ETEST")
    @Severity(SeverityLevel.NORMAL)
    @Test (description = "Search product on homepage")
    public void searchProduct () {
       homePage = new HomePage(driver);
       productsPage = new ProductsPage(driver);
       homePage.acceptCookies();
       homePage.searchProduct();
       softAssert.assertTrue(productsPage.isOnProductsPage(),"All products test");
    }

    @Test(priority = 2,description = "select product from list",dependsOnMethods = "searchProduct")
    public void selectProduct () throws InterruptedException {
        productsPage = new ProductsPage(driver);
        productPage = new ProductPage(driver);
        productsPage.filterBrand();
        productsPage.pickProduct();
        softAssert.assertTrue(productsPage.isOnProductsPage(),"product selection test");
    }

    @Test(priority = 3,description = "add product to cart",dependsOnMethods = "selectProduct")
    public void addProductBasket () {
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        productPage.addToCart();
        productPage.goToCart();
        softAssert.assertTrue(cartPage.isOnCartPage(),"add to cart test");
    }

    @Test(priority = 4,description = "check product price and basket price",dependsOnMethods = "addProductBasket")
    public void checkPriceMatch () {
        cartPage = new CartPage(driver);
        softAssert.assertTrue(cartPage.isPricesSame());
    }



}
