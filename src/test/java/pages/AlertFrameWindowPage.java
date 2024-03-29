package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class AlertFrameWindowPage extends BasePage {

    public AlertFrameWindowPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertsField;
    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement frameField;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement broweserWindowField;

    public void navigateToAlertsPage() {
        elementMethods.clickElement(alertsField);
    }
    public void navigateToFramePage() {
        elementMethods.clickElement(frameField);
    }
    public void navigateToWindowPage(){
        elementMethods.clickElement(broweserWindowField);
    }
}
