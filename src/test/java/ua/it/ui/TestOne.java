package ua.it.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.it.ui.browser.WebDriverFactory;
import ua.it.ui.utils.ConfigProvider;

import java.time.Duration;
import java.util.Random;


public class TestOne {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void start() {
        driver = WebDriverFactory.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void test() {
        Random random = new Random();
        driver.get(ConfigProvider.BASE_URL);
        driver.findElement(By.cssSelector("#register > a")).click();
        driver.findElement(By.id("register-username-modal")).sendKeys("Test" +random);
        driver.findElement(By.id("register-first-modal")).sendKeys("First" + random.nextInt());
        driver.findElement(By.id("register-last-modal")).sendKeys("Test" + random.nextInt());
        driver.findElement(By.id("register-email-modal")).sendKeys("test@" + random.nextInt());
        driver.findElement(By.id("register-password-modal")).sendKeys("qwerty" + random.nextInt());
        driver.findElement(By.cssSelector("#register-modal > div > div > div.modal-body > form > p > button")).click();

        driver.findElements(By.xpath("//*[@id=\"howdy\"]/a")); By.cssSelector("#howdy > a");

    }

    @AfterTest
    public void stop() {
        driver.quit();
    }

}




