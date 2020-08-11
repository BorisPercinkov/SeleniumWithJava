package CuraHealthcare.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static CuraHealthcare.Driver.getChromeDriver;

public class LoginPage {

    private WebDriver chrome = getChromeDriver();



    public void enterLoginCredentials(String username, String password) {
        /** Find the elements where the username & password values are stored, and store them in Strings */
        String user = chrome.findElement(By.xpath("//input[@aria-describedby='demo_username_label']")).getAttribute("value");
        String pass = chrome.findElement(By.xpath("//input[@aria-describedby='demo_password_label']")).getAttribute("value");

/** Then locate the text input fields for username and password */
        chrome.findElement(By.id(username)).sendKeys(user);
        chrome.findElement(By.id(password)).sendKeys(pass);

    }
}