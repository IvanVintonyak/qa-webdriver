package ua.it.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.it.ui.utils.ConfigProvider;

import java.time.Duration;
import java.util.Random;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class TestRegister extends BaseTest {


    Random ran = new Random();
    String randomString = ran.ints(48, 123)
            .filter(num -> (num < 58 || num > 64) && (num < 91 || num > 96))
            .limit(10)
            .mapToObj(c -> (char) c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
            .toString();

    @Test
    public void test() {
        WebDriver
                driver = getWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(ConfigProvider.BASE_URL);
        driver.findElement(By.cssSelector("#register > a")).click();
        wait.until((visibilityOfElementLocated(By.id("register-modal"))));
        driver.findElement(By.id("register-username-modal")).sendKeys("username" + randomString);
        driver.findElement(By.id("register-first-modal")).sendKeys("firstname" + randomString);
        driver.findElement(By.id("register-last-modal")).sendKeys("lastname" + randomString);
        driver.findElement(By.id("register-email-modal")).sendKeys("test@" + randomString + "yopmail.com");
        driver.findElement(By.id("register-password-modal")).sendKeys("password" + randomString);
        driver.findElement(By.cssSelector("#register-modal > div > div > div.modal-body > form > p > button")).click();
        driver.findElements(By.xpath("//*[@id='howdy']/a"));
        By.cssSelector("#howdy > a");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='logout']/a")).getAttribute("textContent"), "Logout");
    }


//    @AfterTest
//    public  void stop() throws Exception{
//
//        driver.quit();
//        driver = null;
//    }
//    public void stop() {
//        driver.quit();
//    }


}




