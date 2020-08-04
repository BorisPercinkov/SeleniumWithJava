package CuraHealthcare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    private Driver() {}

    public static WebDriver getChromeDriver() {
        if (driver == null) {
            String basePath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", basePath + "/src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;

    }

}
