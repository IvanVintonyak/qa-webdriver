package ua.it.ui.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import ua.it.ui.utils.ConfigProvider;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;


public class WebDriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        driver = getDriver(Browser.valueOf(ConfigProvider.BROWSER.toUpperCase()));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigProvider.IMPLICITLY_WAIT));
        return driver;
    }

    private static WebDriver getDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
//            case SELENOID_CHROME:
//                return getSelenoidDriver();
            default:
                throw new IllegalArgumentException("Wrong browser provided, please chose another: chrome or firefox");
        }
    }

//    private static WebDriver getSelenoidDriver() {
//        if (driver == null) {
//            DesiredCapabilities browser = new DesiredCapabilities();
//            browser.setBrowserName("chrome");
//            browser.setVersion("");
//            browser.setCapability("enableVNC", true);
//
//            try {
//                RemoteWebDriver remoteWebDriver = new RemoteWebDriver(
//                        URI.create(ConfigProvider.SELENOID_HUB).toURL(), browser
//                );
//                remoteWebDriver.manage().window().setSize(new Dimension(1280, 1240));
//                remoteWebDriver.setFileDetector(new LocalFileDetector());
//                driver = remoteWebDriver;
//
//            } catch (MalformedURLException e) {
//                throw new RuntimeException(e);
//            }
//
//        }

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
