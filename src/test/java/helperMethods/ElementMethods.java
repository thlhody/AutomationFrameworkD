package helperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class ElementMethods {
    private WebDriver webDriver;

    public ElementMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void scrollElemByPixel(Integer x, Integer y) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scroll(" + x + "," + y + ")", "");
    }

    public void clickElemForce(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", element);
    }

    public void waitVisibleELem(WebElement element) {
        //nu e bine sa parametrizam timpul de asteptare, risca sa blocheaza resurese
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void validateElementText(WebElement element, String text) {
        Assert.assertEquals(element.getText(), text);
    }

    public void printElemText(WebElement element) {
        System.out.println(element.getText());
    }

    public void fillElement(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void reFillElement(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public void selectElementText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectElementValue(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByValue(text);
    }

    public void fillPressElem(WebElement element, String text, Keys key) {
        element.sendKeys(text);
        element.sendKeys(key);
    }
}
