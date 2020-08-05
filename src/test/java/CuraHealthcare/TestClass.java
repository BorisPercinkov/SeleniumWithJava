package CuraHealthcare;

import CuraHealthcare.PageSelectors.Login;


import CuraHealthcare.pages.LoginPage;
import org.junit.Test;

public class TestClass extends BaseClass {
BaseClass base = new BaseClass();
LoginPage login = new LoginPage();

    @Test
    public void Test() throws InterruptedException {
        base.VerifyAndClick(Login.LOGIN_PAGE);
        login.enterCredentials(Login.USERNAME_FIELD,Login.PASSWORD_FIELD);


    }




}


