package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "alertButton")
    private WebElement alertButtonOne;
    @FindBy(id = "timerAlertButton")
    private WebElement timerAlertButton;
    @FindBy(id = "confirmButton")
    private WebElement confirmAlertButton;
    @FindBy(id = "promtButton")
    private WebElement promtAlertButton;
    @FindBy(id = "confirmResult")
    private WebElement confirmButtonResult;
    @FindBy(id = "promptResult")
    private WebElement promtAlertResult;

    public void alertAccept() {
        elementMethods.clickElement(alertButtonOne);
        alertMethods.acceptAlert();
    }

    public void timerAlert() {
        elementMethods.clickElement(timerAlertButton);
        alertMethods.acceptAlert();
    }

    public void alertDismiss() {
        elementMethods.clickElement(confirmAlertButton);
        alertMethods.dismissAlert();
    }

    public void alertFillAndValidate(String text) {
        elementMethods.clickElement(promtAlertButton);
        alertMethods.fieldAlert(text);
        elementMethods.validateElementText(promtAlertResult, "You entered " + text);
    }

    public void alertAcceptAndValidate() {
        elementMethods.clickElement(confirmAlertButton);
        alertMethods.acceptAlert();
        elementMethods.validateElementText(confirmButtonResult, "You selected Ok");
    }

    public void alertDismissAndValidate() {
        elementMethods.clickElement(confirmAlertButton);
        alertMethods.dismissAlert();
        elementMethods.validateElementText(confirmButtonResult, "You selected Cancel");
    }


}
