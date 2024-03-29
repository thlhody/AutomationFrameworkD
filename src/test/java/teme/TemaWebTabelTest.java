package teme;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TemaWebTabelTest {
    public WebDriver webDriver;

    @Test
    public void metodaPrincipala() {
        //deschidem un browser
        webDriver = new ChromeDriver();
        //accesam un url
        webDriver.get("https://demoqa.com");
        webDriver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        //identificam un element
        //WebElement consentField = webDriver.findElement(By.className("fc-button-label"));
        //consentField.click();
        WebElement elementsField = webDriver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsField.click();
        js.executeScript("window.scroll(0,450)","");
        WebElement webTablesField = webDriver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesField.click();

        webElementTest( "Tudor","Hody","thlhody@gmail.com","34","2500","IT");
        webElementTest("Gheorghe","Eugen","gheorghe@yahoo.com","55","4500","HR");
        modificamDate("Andrei","Vasile","andrei.v@gmail.com","21","10000","Grafica");
        stergemDate();
    }

    public void webElementTest(String firstNameValue, String lastNameValue, String emailValue, String ageValue,
                               String salaryValue, String departmentValue) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        WebElement addNewRecordButton = webDriver.findElement(By.id("addNewRecordButton"));
        js.executeScript("arguments[0].click();",addNewRecordButton);

        WebElement firstNameElement = webDriver.findElement(By.id("firstName"));
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = webDriver.findElement(By.id("lastName"));
        lastNameElement.sendKeys(lastNameValue);

        WebElement emailElement = webDriver.findElement(By.id("userEmail"));
        emailElement.sendKeys(emailValue);

        WebElement ageElement = webDriver.findElement(By.id("age"));
        ageElement.sendKeys(ageValue);

        WebElement salaryElement = webDriver.findElement(By.id("salary"));
        salaryElement.sendKeys(salaryValue);

        WebElement departmentElement = webDriver.findElement(By.id("department"));
        departmentElement.sendKeys(departmentValue);

        WebElement submitButton = webDriver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click();",submitButton);
    }
    public void modificamDate(String firstNameValue, String lastNameValue, String emailValue, String ageValue,
                              String salaryValue, String departmentValue){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        WebElement editButton = webDriver.findElement(By.id("edit-record-4"));
        js.executeScript("arguments[0].click();",editButton);

        WebElement firstNameElement = webDriver.findElement(By.id("firstName"));
        firstNameElement.clear();
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = webDriver.findElement(By.id("lastName"));
        lastNameElement.clear();
        lastNameElement.sendKeys(lastNameValue);

        WebElement emailElement = webDriver.findElement(By.id("userEmail"));
        emailElement.clear();
        emailElement.sendKeys(emailValue);

        WebElement ageElement = webDriver.findElement(By.id("age"));
        ageElement.clear();
        ageElement.sendKeys(ageValue);

        WebElement salaryElement = webDriver.findElement(By.id("salary"));
        salaryElement.clear();
        salaryElement.sendKeys(salaryValue);

        WebElement departmentElement = webDriver.findElement(By.id("department"));
        departmentElement.clear();
        departmentElement.sendKeys(departmentValue);

        WebElement submitButton = webDriver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click();",submitButton);
    }
    public void stergemDate(){

        WebElement deleteButton5 = webDriver.findElement(By.id("delete-record-5"));
        deleteButton5.click();

        WebElement deleteButton4 = webDriver.findElement(By.id("delete-record-4"));
        deleteButton4.click();
    }

}
