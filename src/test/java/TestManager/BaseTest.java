package TestManager;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public static WebDriver driver ;

    @BeforeTest
    public void setUp () {
        driver = DriverSetup.initDriver();
    }

    @AfterTest
    public void tearDown () {
        if (driver != null) {
            driver.close();
        }
    }
}
