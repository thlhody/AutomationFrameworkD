package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage{
    public WindowPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "tabButton")
    private WebElement tabButton;
    @FindBy(id = "windowButton")
    private WebElement windowButton;

    public void interactWithTabBrowser(){
        elementMethods.clickElement(tabButton);
        windowMethods.switchToWindowTab(1);
        windowMethods.closeWindowTab(webDriver);
        windowMethods.switchToWindowTab(0);
    }
    public void interactWithWindowBrowser(){
        elementMethods.clickElement(windowButton);
        windowMethods.switchToWindowTab(1);
        windowMethods.closeWindowTab(webDriver);
        windowMethods.switchToWindowTab(0);
    }
}

