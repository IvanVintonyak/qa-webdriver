//package ua.it.ui;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import ua.it.ui.browser.WebDriverFactory;
//import ua.it.ui.utils.ConfigProvider;
//
//import java.time.Duration;
//
//
//public class BaseUITest {
//
//    private WebDriver driver;
//
//
//    @BeforeTest
//    public void start() {
//        driver = WebDriverFactory.getDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }
//
//    @Test
//    public void test() {
//        driver.get(ConfigProvider.BASE_URL);
//        driver.findElement(By.name("q")).sendKeys("webdriver");
//        driver.findElements(By.name("btnK")).get(0).click();
//
//        Assert.assertEquals(driver.getTitle(), "webdriver - Пошук Google");
//    }
//
//    @AfterTest
//    public void stop() {
//        driver.quit();
//    }
//}
