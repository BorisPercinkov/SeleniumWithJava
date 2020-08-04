package CuraHealthcare;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static CuraHealthcare.Driver.getChromeDriver;
import java.util.concurrent.TimeUnit;

public class BaseClass{
    String URL = "https://katalon-demo-cura.herokuapp.com/";
    WebDriver driver = getChromeDriver();
    //WebDriverWait wait;

    @Before
    public void StartUp(){
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }

    @After
    public void Finish(){
        driver.close();
    }

    /**Some Basic 'Customised' functions which contribute to clean code in the main test class */

    public void VerifyAndClick (String identifier) throws InterruptedException {
        WebElement perform = driver.findElement(By.id(identifier));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifier)));
        perform.click();


    }


    }


