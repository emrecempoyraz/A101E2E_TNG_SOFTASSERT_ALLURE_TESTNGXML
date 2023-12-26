package TestManager;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.asserts.SoftAssert;


public class SuiteListener implements ITestListener {

        private SoftAssert softAssert = new SoftAssert();

        @Override
        public void onFinish(ITestContext context) {
            softAssert.assertAll(); // Tüm testler için assertAll() yap
        }

        // Diğer metodlar burada bulunabilir
        // ...
    }



