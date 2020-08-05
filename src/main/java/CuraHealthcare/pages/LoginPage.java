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

    public void username (String identifier){


    }

    public void enterCredentials(String username,String password) throws InterruptedException {
        /** Find the elements where the username & password values are stored, and store them in Strings */
        String user = driver.findElement(By.xpath("//input[@aria-describedby='demo_username_label']")).getAttribute("value");
        String pass = driver.findElement(By.xpath("//input[@aria-describedby='demo_password_label']")).getAttribute("value");

        //String Username = user.getAttribute("value");
        //String Password = pass.getAttribute("value");

        /** Then locate the text input fields for username and password */
        driver.findElement(By.id(username)).sendKeys(user);
        driver.findElement(By.id(password)).sendKeys(pass);



        //userInput.sendKeys(Username);
        //passwordInput.sendKeys(Password);
        Thread.sleep(5000);

    }



}
