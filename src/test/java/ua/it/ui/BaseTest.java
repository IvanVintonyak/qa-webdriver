package ua.it.ui;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ua.it.ui.browser.WebDriverFactory;

public class BaseTest {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();


    @BeforeMethod
    public void beforeTestMethod() {
        WebDriver driver = new WebDriverFactory().getDriver();
        setWebDriver(driver);
    }

    @AfterMethod
    public void afterMethod() {
        getWebDriver().quit();
    }

    public WebDriver getWebDriver() {
        return driverThreadLocal.get();
    }

    private void setWebDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
    }
}
