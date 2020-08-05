package CuraHealthcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static CuraHealthcare.Driver.getChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonClass {
    String URL = "https://katalon-demo-cura.herokuapp.com/";
    WebDriver driver = getChromeDriver();

    /** Having some issues setting up @Before and @After annotations so I'm just calling this methods on the begining and at the end */
    public void StartUp() {
        driver.get(URL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void Finish() {
        driver.close();
    }

    /** Usedon both of the pages so intentionally placed here in the CommonClass */
    public void VerifyAndClick(String identifier) {
        WebElement perform = driver.findElement(By.id(identifier));
        perform.click();
    }
}


