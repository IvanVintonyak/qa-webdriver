package ua.it.ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.it.ui.pages.MainPage;
import ua.it.ui.pages.User;

public class PageObjectTest extends BaseTest {
    @Test
    public void test() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.open();

        Assert.assertEquals(getWebDriver().getTitle(), mainPage.getTitle());
        MainPage.RegisterForm registerForm = mainPage.clickRegister();
        registerForm.fillRegisterForm(User.builder().buildRandomUser());


        Assert.assertTrue(mainPage.isUserLoggedIn());
    }

}
