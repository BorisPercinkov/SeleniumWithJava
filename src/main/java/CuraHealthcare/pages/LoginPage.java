package CuraHealthcare.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static CuraHealthcare.Driver.getChromeDriver;

public class LoginPage {

    private WebDriver driver = getChromeDriver();
    private WebDriverWait wait;

    public void enterCredentials(String identifier,String value) throws InterruptedException {
        WebElement perform = driver.findElement(By.id(identifier));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifier)));
        perform.sendKeys(value);
        Thread.sleep(5000);



    }



}
