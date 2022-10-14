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
import ua.it.ui.model.User;
import ua.it.ui.utils.ConfigProvider;

import java.time.Duration;


public class BaseUIBuilder extends BaseTest {
    User user = User.builder()
            .setFirstName("firstName")
            .setLastName("lastName")
            . setPassword("psw")
            .build();

    @Test
    public void test() {

        getWebDriver().navigate().to(ConfigProvider.BASE_URL);
        TextField textField = new TextField( getWebDriver().findElement(By.name("q")));
        textField.setValue("webdriver");


        getWebDriver().findElements(By.name("btnK")).get(0).click();

        Assert.assertTrue(getWebDriver().getTitle().contains("webdriver"));
    }

}
