package teme;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import sharedData.SharedData;

public class TemaWebTabelTest extends SharedData {

    public void metodaPrincipala() {

        HomePage homePage = new HomePage(getWebDriver());
        ElementsPage elementsPage = new ElementsPage(getWebDriver());
        homePage.navigateToElementsPage();
        elementsPage.navigateToWebTablePage();

        //identificam un element
        //WebElement consentField = webDriver.findElement(By.className("fc-button-label"));
        //consentField.click();

        webElementTest("Tudor", "Hody", "thlhody@gmail.com", "34", "2500", "IT");
        webElementTest("Gheorghe", "Eugen", "gheorghe@yahoo.com", "55", "4500", "HR");
        modificamDate("Andrei", "Vasile", "andrei.v@gmail.com", "21", "10000", "Grafica");
        stergemDate();
    }

    public void webElementTest(String firstNameValue, String lastNameValue, String emailValue, String ageValue,
                               String salaryValue, String departmentValue) {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();

        WebElement addNewRecordButton = getWebDriver().findElement(By.id("addNewRecordButton"));
        js.executeScript("arguments[0].click();", addNewRecordButton);

        WebElement firstNameElement = getWebDriver().findElement(By.id("firstName"));
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = getWebDriver().findElement(By.id("lastName"));
        lastNameElement.sendKeys(lastNameValue);

        WebElement emailElement = getWebDriver().findElement(By.id("userEmail"));
        emailElement.sendKeys(emailValue);

        WebElement ageElement = getWebDriver().findElement(By.id("age"));
        ageElement.sendKeys(ageValue);

        WebElement salaryElement = getWebDriver().findElement(By.id("salary"));
        salaryElement.sendKeys(salaryValue);

        WebElement departmentElement = getWebDriver().findElement(By.id("department"));
        departmentElement.sendKeys(departmentValue);

        WebElement submitButton = getWebDriver().findElement(By.id("submit"));
        js.executeScript("arguments[0].click();", submitButton);
    }

    public void modificamDate(String firstNameValue, String lastNameValue, String emailValue, String ageValue,
                              String salaryValue, String departmentValue) {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();

        WebElement editButton = getWebDriver().findElement(By.id("edit-record-4"));
        js.executeScript("arguments[0].click();", editButton);

        WebElement firstNameElement = getWebDriver().findElement(By.id("firstName"));
        firstNameElement.clear();
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = getWebDriver().findElement(By.id("lastName"));
        lastNameElement.clear();
        lastNameElement.sendKeys(lastNameValue);

        WebElement emailElement = getWebDriver().findElement(By.id("userEmail"));
        emailElement.clear();
        emailElement.sendKeys(emailValue);

        WebElement ageElement = getWebDriver().findElement(By.id("age"));
        ageElement.clear();
        ageElement.sendKeys(ageValue);

        WebElement salaryElement = getWebDriver().findElement(By.id("salary"));
        salaryElement.clear();
        salaryElement.sendKeys(salaryValue);

        WebElement departmentElement = getWebDriver().findElement(By.id("department"));
        departmentElement.clear();
        departmentElement.sendKeys(departmentValue);

        WebElement submitButton = getWebDriver().findElement(By.id("submit"));
        js.executeScript("arguments[0].click();", submitButton);
    }

    public void stergemDate() {

        WebElement deleteButton5 = getWebDriver().findElement(By.id("delete-record-5"));
        deleteButton5.click();

        WebElement deleteButton4 = getWebDriver().findElement(By.id("delete-record-4"));
        deleteButton4.click();
    }
}
