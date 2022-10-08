package ua.it.ui.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.it.ui.utils.ConfigProvider;

import java.time.Duration;

import static ua.it.ui.utils.ConfigProvider.BROWSER;

public class WebDriverFactory {
    private static final String BROWSER = System.getProperty("browser", ConfigProvider.BROWSER);
    private static WebDriver driver;
    public static WebDriver getDriver(){
        driver = getDriver(Browser.valueOf(ConfigProvider.BROWSER.toUpperCase()));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
    private static WebDriver getDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            default:
                throw new IllegalArgumentException("Wrong browser provided, please chose another: chrome or firefox");
        }
    }

    private static WebDriver getFirefoxDriver() {
        if (driver == null) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }

    private static WebDriver getChromeDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }
}
