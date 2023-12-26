package TestManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverSetup {

    public static WebDriver driver ;

    public static WebDriver initDriver () {
        driver = new ChromeDriver(DriverOptions.getOptions());
        driver.get(IDriver.BASE_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(IDriver.PAGE_WAIT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IDriver.IMP_WAIT));
        return getDriver () ;
    }

    public static WebDriver getDriver () {
        return driver ;
    }
}
