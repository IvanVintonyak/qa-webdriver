package ua.it.ui.multithreading;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import ua.it.ui.browser.WebDriverFactory;

public class BaseTest {
    private static final ThreadLocal<WebDriver> driverThreadLocal;

    static {
        driverThreadLocal = new ThreadLocal<>();
    }

    @BeforeMethod
    public void beforeMethod(){
        WebDriver driver = new WebDriverFactory().getDriver();
        setWebdriver(driver);
    }

    private WebDriver setWebdriver(WebDriver driver) {
        return driver;
    }
}
