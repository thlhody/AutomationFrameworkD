package sharedData.browser;

import org.openqa.selenium.WebDriver;
import propertyUtility.PropertyUtility;

import java.util.Map;

public class BrowserFactory {

    public WebDriver getBrowserInstance() {
        PropertyUtility pU = new PropertyUtility("AtfData");
        Map<String, String> browserData = pU.getAllData();
        String cIcD = System.getProperty("cIcD");
        String browser = System.getProperty("browser");
        if (Boolean.parseBoolean(cIcD)) {
            browserData.put("headless", "--headless=new");
        } else {
            browser = browserData.get("browser");
        }
        System.out.println("!!!!!!!!");
        System.out.println(browser);
        //dupa ce am aflat pe ce enviroment trebuie sa rulez deschid browserul dorit
        switch (browser) {
            case "chrome":
                ChromeService chromeS = new ChromeService();
                chromeS.openBrowser(browserData);
                return chromeS.getWebDriver();
            case "edge":
                EdgeService edgeS = new EdgeService();
                edgeS.openBrowser(browserData);
                return edgeS.getWebDriver();
        }
        return null;
    }
}
