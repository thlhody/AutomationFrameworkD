package helperMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethods {
    private WebDriver webDriver;

    public AlertMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void acceptAlert() {
        waitForAlert();
        Alert clickAlert = webDriver.switchTo().alert();
        clickAlert.accept();
    }

    public void dismissAlert() {
        waitForAlert();
        Alert clickAlert = webDriver.switchTo().alert();
        clickAlert.dismiss();
    }

    public void waitForAlert() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void fieldAlert(String text) {
        Alert clickPromtAlertButton = webDriver.switchTo().alert();
        clickPromtAlertButton.sendKeys(text);
        clickPromtAlertButton.accept();
    }
}
