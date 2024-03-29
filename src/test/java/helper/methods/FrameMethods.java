package helper.methods;

import org.openqa.selenium.WebDriver;

public class FrameMethods {

    private WebDriver webDriver;

    public FrameMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void switchIFrame(String text) {
        webDriver.switchTo().frame(text);
    }

    public void switchParent() {
        webDriver.switchTo().parentFrame();
    }
}
