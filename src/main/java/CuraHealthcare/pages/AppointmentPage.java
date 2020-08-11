package CuraHealthcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static CuraHealthcare.Driver.getChromeDriver;

public class AppointmentPage {
    /**
     * declare data that needs to be populated to the Appointment page
     */
    public String appointmentValue = "Seoul CURA Healthcare Center";
    public String radioBtnValue = "Medicaid";
    public String dateValue = "10/08/2020";
    public String comment = "This field is automatically populated";

    private WebDriver driver = getChromeDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 15);






    public void SelectOrEnterValue(String identifier, String value) {
        driver.findElement(By.id(identifier)).sendKeys(value);
    }

    public void SelectDropdownValue (String identifier,String value){
        WebElement dropDownElement = driver.findElement(By.id(identifier));
        Select dropDown = new Select(dropDownElement);
        dropDown.selectByValue(value);

    }

    public void SelectRadioButton(String identifier, String value) {


        List<WebElement> radioBtn = driver.findElements(By.name(identifier));
        for (int i = 0; i < radioBtn.size(); i++) {
            WebElement local = radioBtn.get(i);
            String val = local.getAttribute("value");
            if (value.equals(val)) {
                local.click();
            }
        }
    }
}
