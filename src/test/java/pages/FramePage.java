package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage{


    public FramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "sampleHeading")
    private WebElement frameElement;

    public void switchToIFrame(String text){
        elementMethods.scrollElemByPixel(0, 450);
        frameMethods.switchIFrame(text);
        elementMethods.printElemText(frameElement);
    }

    public void switchToParentFrame(){
        frameMethods.switchParent();
    }
}
