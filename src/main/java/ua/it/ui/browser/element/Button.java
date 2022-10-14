package ua.it.ui.browser.element;

import org.openqa.selenium.WebElement;

public class Button {

    private WebElement element;

    public Button(WebElement element) {
        this.element = element;
    }

    public String getValue() {
        return element.getAttribute("tagName");
    }

    public void setValue(String tagName) {
        element.click();
    }
}

