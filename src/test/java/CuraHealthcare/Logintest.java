package CuraHealthcare;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Logintest {

WebDriver driver;
WebDriverWait wait;
String URL = "https://katalon-demo-cura.herokuapp.com/";
String basePath = System.getProperty("user.dir");


    @Before
    public void StartUp(){
        System.setProperty("webdriver.chrome.driver",basePath+"/src/test/resources/drivers/chromedriver.exe");
        System.out.println(basePath);

        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        wait = new WebDriverWait(driver,5);

    }

    @Test
    public void Test(){

        System.out.println("Executed!");
    }

}
