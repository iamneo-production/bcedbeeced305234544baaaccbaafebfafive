// package runner;
// import java.io.IOException;
// import java.net.MalformedURLException;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.Test;
// import utils.LoggerHandler;
// import com.aventstack.extentreports.ExtentReports;
// import com.aventstack.extentreports.ExtentTest;
// import com.aventstack.extentreports.MediaEntityBuilder;
// import com.aventstack.extentreports.Status;

// import pages.Deposit;
// import pages.Withdraw;
// import pages.homepage;
// import utils.base64;
// import utils.Screenshot;
// import utils.Base;
// import utils.EventHandler;
// import utils.Reporter;
// // import utils.Screenshot;
// public class Testcase3 extends Base {

//     java.util.logging.Logger log =  LoggerHandler.getLogger();
//     base64 screenshotHandler = new base64();
//     ExtentReports reporter = Reporter.generateExtentReport();;
//     homepage Homepage = new homepage();
//     Withdraw withdraw = new Withdraw(); 
    
    


//     @Test(priority = 3)
//     public void TC_003() throws IOException {
//         try {
//             ExtentTest test = reporter.createTest("WithdrawTest ", "Execution for WithdrawTest");
//             driver.get(prop.getProperty("url"));
//             Homepage.Valid_Login_TC(driver);
//             withdraw.WithdrawTest(driver);

//             String base64Screenshot = screenshotHandler.captureScreenshotAsBase64(driver);
//             test.log(Status.PASS, "WithdrawTest", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());

//         }catch (Exception ex) {
//             ex.printStackTrace();
//             Screenshot.getScreenShot(driver, "Withdraw test fail");
//             ExtentTest test = reporter.createTest("WithdrawTest fail");
//             String base64Screenshot = screenshotHandler.captureScreenshotAsBase64(driver);
//             test.log(Status.FAIL, "Unable to Perform WithdrawTest fail", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
           
//         }
//     }
    
    

// @BeforeMethod
// public void beforeMethod() throws MalformedURLException {
//     openBrowser();

// }

//     @AfterMethod
//     public void afterMethod() {
//         driver.quit();
//         reporter.flush();
//         log.info("Browser closed");
//         LoggerHandler.closeHandler();
//     }
// }

