package ua.it.ui;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.it.ui.browser.element.TextField;
import ua.it.ui.model.User;
import ua.it.ui.utils.ConfigProvider;


public class BaseUIBuilder extends BaseTest {
    User user = User.builder()
            .setFirstName("firstName")
            .setLastName("lastName")
            . setEmail("email@yopmail.com")
            .setUserName("userName")
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
