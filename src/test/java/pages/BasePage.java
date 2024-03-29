package pages;

import helper.methods.AlertMethods;
import helper.methods.ElementMethods;
import helper.methods.FrameMethods;
import helper.methods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver webDriver;
    public ElementMethods elementMethods;
    public AlertMethods alertMethods;
    public FrameMethods frameMethods;
    public WindowMethods windowMethods;
    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        elementMethods = new ElementMethods(webDriver);
        alertMethods = new AlertMethods(webDriver);
        frameMethods = new FrameMethods(webDriver);
        windowMethods = new WindowMethods(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}