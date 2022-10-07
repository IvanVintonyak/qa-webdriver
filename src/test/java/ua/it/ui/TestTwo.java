package ua.it.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import ua.it.ui.browser.WebDriverFactory;
import ua.it.ui.utils.ConfigProvider;

import java.util.Random;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class TestTwo {
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
        driver.findElement(By.id("register-username-modal")).sendKeys("1" + random.nextInt(5));
        driver.findElement(By.id("register-first-modal")).sendKeys("First" + random.nextInt(5));
        driver.findElement(By.id("register-last-modal")).sendKeys("Test" + random.nextInt(5));
        driver.findElement(By.id("register-email-modal")).sendKeys("test" + random.nextInt(5) + "@yomail.com");
        driver.findElement(By.id("register-password-modal")).sendKeys("1" + random.nextInt(5));
        driver.findElement(By.xpath("//*[@id=\"register-modal\"]/div/div/div[2]/form/p/button")).click();
        wait.until(titleIs("WeaveSocks"));
        driver.findElement(By.cssSelector("#logout")).click();
        driver.findElement(By.cssSelector("#login > a")).click();
        driver.findElement(By.id("username-modal")).sendKeys("1" + random.nextInt(1));
        driver.findElement(By.id("password-modal")).sendKeys("1" + random.nextInt(1));
        driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/form/p/button")).click();
        driver.findElement(By.xpath("//*[@id=\"howdy\"]/a"));


    }

    @AfterTest
    public void stop() {
        driver.quit();
    }

}




