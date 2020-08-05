package CuraHealthcare;

import CuraHealthcare.PageSelectors.PageSelectors;
import CuraHealthcare.pages.AppointmentPage;
import CuraHealthcare.pages.CommonClass;
import CuraHealthcare.pages.LoginPage;
import org.junit.Test;

public class TestClass extends CommonClass {
    CommonClass comFun = new CommonClass();
    LoginPage logFun = new LoginPage();
    AppointmentPage appFun = new AppointmentPage();

    @Test
    /** Test that executes on the Login Page*/
    public void LoginTest() {
        comFun.StartUp();
        comFun.VerifyAndClick(PageSelectors.MAKE_APPOINTMENT);
        logFun.enterCredentials(PageSelectors.USERNAME_FIELD, PageSelectors.PASSWORD_FIELD);
        comFun.VerifyAndClick(PageSelectors.LOGIN_BUTTON);
    }

    @Test
    /** Test that executes on the Appointment Page*/
    public void AppointmentTest() {
        appFun.SelectOrEnterValue(PageSelectors.FACILITY_DROPDOWN, appFun.appointmentValue);
        comFun.VerifyAndClick(PageSelectors.FACILITY_CHECKBOX);
        appFun.SelectRadioButton(PageSelectors.FACILITY_RADIOBTN, appFun.radioBtnValue);
        appFun.SelectOrEnterValue(PageSelectors.FACILITY_DATE, appFun.dateValue);
        appFun.SelectOrEnterValue(PageSelectors.FACILITY_COMMENT, appFun.comment);
        comFun.VerifyAndClick(PageSelectors.FACILITY_BUTTON);
        comFun.Finish();
    }
}
