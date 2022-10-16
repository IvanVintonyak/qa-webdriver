package ua.it.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.it.ui.utils.ConfigProvider;
import ua.it.ui.utils.WaitUtils;

public class MainPage extends Page {

    public static final String TITLE = "WeaveSocks";
    private final By registerLink = By.xpath("//*[@id='register']/a");
    private final By logoutLink = By.id("logout");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isUserLoggedIn() {
        return driver.findElements(logoutLink).size() > 0;
    }

    @Override
    public void open() {
        driver.get(ConfigProvider.BASE_URL);
        ensureOpen();
    }

    @Override
    public void ensureOpen() {
        WaitUtils.waitUntilElementIsVisible(driver, registerLink);
    }

    @Override
    public String getTitle() {
        return TITLE;
    }

    public RegisterForm clickRegister() {
        driver.findElement(registerLink).click();
        return new RegisterForm();
    }

    public class RegisterForm {
        private By userName = By.id("register-username-modal");
        private By firstName = By.id("register-first-modal");
        private By lastName = By.id("register-last-modal");
        private By email = By.id("register-email-modal");
        private By password = By.id("register-password-modal");
        private By registerButton = By.cssSelector("#register-modal > div > div > div.modal-body > form > p > button");

        public void fillRegisterForm(User user) {
            driver.findElement(userName).sendKeys(user.getUserName());
            driver.findElement(firstName).sendKeys(user.getFirstName());
            driver.findElement(lastName).sendKeys(user.getLastName());
            driver.findElement(email).sendKeys(user.getEmail());
            driver.findElement(password).sendKeys(user.getPassword());
            driver.findElement(registerButton).click();
            WaitUtils.waitElementToDisappear(driver, registerButton);
        }

        ;
    }

}
