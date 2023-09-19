package runner;
import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import pages.Deposit;
import pages.Withdraw;
import pages.homepage;
import utils.base64;
import utils.Screenshot;
import utils.Base;
import utils.EventHandler;
import utils.Reporter;
// import utils.Screenshot;
public class Testcase2 extends Base {

    java.util.logging.Logger log =  LoggerHandler.getLogger();
    base64 screenshotHandler = new base64();
    ExtentReports reporter = Reporter.generateExtentReport();;
    homepage Homepage = new homepage();
    Deposit deposit = new Deposit();

    
     @Test(priority = 2)
    public void TC_002() throws IOException {
        try {
            ExtentTest test = reporter.createTest("Register Test", "Execution for Register Function");
            driver.get(prop.getProperty("url"));
            Homepage.Valid_Login_TC(driver);
            deposit.Deposit_Amount(driver);
            test.log(Status.PASS, "Register Test");
        } 
        catch (Exception ex) {
            ex.printStackTrace();
            Screenshot.getScreenShot(driver, "Register_test");
            ExtentTest test = reporter.createTest("Register Test");
            String base64Screenshot = screenshotHandler.captureScreenshotAsBase64(driver);
            test.log(Status.FAIL, "Unable to Perform Register Test", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
           
        }
    }

    
    

@BeforeMethod
public void beforeMethod() throws MalformedURLException {
    openBrowser();

}

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        reporter.flush();
        log.info("Browser closed");
        LoggerHandler.closeHandler();
    }
}

