package ua.it.ui.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverProviderLazy {
    private static  WebDriverProviderLazy instance;
    private  Object driver;

    private WebDriverProviderLazy () {
        driver = new Object();

    }
    public static WebDriverProviderLazy getInstance(){
        if (instance == null){
            instance = new WebDriverProviderLazy();

        }
        return instance;
    }

    public Object getDriver(){
        return driver;
    }
}
