package ua.it.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.it.ui.browser.WebDriverFactory;
import ua.it.ui.browser.element.TextField;
import ua.it.ui.utils.ConfigProvider;

import java.time.Duration;


public class BaseUITest extends BaseTest {

    private WebDriver driver;


    @BeforeTest
    public void start() {
        driver = WebDriverFactory.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void test() {
//        driver.get(ConfigProvider.BASE_URL);
//        driver.findElement(By.name("q")).sendKeys("webdriver");
//        driver.findElements(By.name("btnK")).get(0).click();
        getWebDriver().navigate().to(ConfigProvider.BASE_URL);
//        getWebDriver().findElement(By.name("q")).sendKeys("webdriver");
        TextField textField = new TextField( getWebDriver().findElement(By.name("q")));
        textField.setValue("webdriver");


        getWebDriver().findElements(By.name("btnK")).get(0).click();

        Assert.assertTrue(getWebDriver().getTitle().contains("webdriver"));
    }

    @AfterTest
    public void stop() {
        driver.quit();
    }
}
