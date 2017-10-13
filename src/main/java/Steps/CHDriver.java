package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHDriver {
    private static WebDriver driver;

    private CHDriver() {}

    public static WebDriver getWebDriver() {
//        System.setProperty("webdriver.chrome.driver");
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}

