package ua.it.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.it.ui.browser.element.TextField;
import ua.it.ui.utils.ConfigProvider;


public class BaseUITest extends BaseTest {


    @Test(enabled = true)
    public void test() {
        WebDriver
                driver = getWebDriver();
        driver.get(ConfigProvider.BASE_URL);
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElements(By.name("btnK")).get(0).click();
        getWebDriver().navigate().to(ConfigProvider.BASE_URL);
        getWebDriver().findElement(By.name("q")).sendKeys("webdriver");
        TextField textField = new TextField(getWebDriver().findElement(By.name("q")));
        textField.setValue("webdriver");


        getWebDriver().findElements(By.name("btnK")).get(0).click();

        Assert.assertTrue(getWebDriver().getTitle().contains("webdriver"));
    }

}
