package helper.methods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {
    private WebDriver webDriver;

    public WindowMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void switchToWindowTab(Integer position) {
        List<String> element = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(element.get(position));
        System.out.println("Window/Tab curent are URL: " + webDriver.getCurrentUrl());
    }
    public void closeWindowTab(WebDriver webDriver) {
        webDriver.close();
    }
}
