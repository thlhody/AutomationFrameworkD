package sharedData.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.Map;

public class EdgeService implements BrowserService {

    private WebDriver webDriver;

    @Override
    public void openBrowser(Map<String, String> testData) {
        //aceasta metoda are ca scop sa deschida un chrome cu configurarile noastr;
        EdgeOptions options = (EdgeOptions) getBrowserOptions(testData);
        webDriver = new EdgeDriver(options);
        webDriver.get(testData.get("url"));
        webDriver.manage().window().maximize();

    }

    @Override
    public Object getBrowserOptions(Map<String, String> testData) {
        // configuram optiunile pentru browserul nostru
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments(testData.get("gpu"));
        edgeOptions.addArguments(testData.get("infobars"));
        edgeOptions.addArguments(testData.get("extensions"));
        edgeOptions.addArguments(testData.get("sandbox"));
        if (!testData.get("headless").isEmpty()) {
            edgeOptions.addArguments(testData.get("headless"));
        }
        return edgeOptions;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
