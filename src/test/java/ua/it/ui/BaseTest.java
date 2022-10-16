package ua.it.ui;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ua.it.ui.browser.WebDriverFactory;

public class BaseTest {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    // protected WebDriver driver;


    @BeforeMethod
    public void beforeTestMethod() {
        WebDriver driver = WebDriverFactory.getDriver();
        setWebDriver(driver);
    }

    @AfterMethod
    public void afterMethod() {
        getWebDriver().quit();
    }

    private void setWebDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
    }

    public WebDriver getWebDriver() {
        return driverThreadLocal.get();
    }
}
