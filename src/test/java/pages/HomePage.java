package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(className = "fc-button-label")
    private WebElement acceptCookies;
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsFrameWindowsPage;
    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formsField;
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsField;

    public void navigateToAlertsFrameWindowsPage() {
        elementMethods.scrollElemByPixel(0, 450);
//        elementMethods.clickElement(acceptCookies);
        elementMethods.clickElement(alertsFrameWindowsPage);
    }

    public void navigateToFormsPage() {
        elementMethods.scrollElemByPixel(0, 450);
        elementMethods.clickElement(formsField);
    }

    public void navigateToElementsPage() {
        elementMethods.scrollElemByPixel(0, 450);
        elementMethods.clickElement(elementsField);
    }
}
