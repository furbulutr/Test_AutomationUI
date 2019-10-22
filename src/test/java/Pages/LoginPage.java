package Pages;

import Contanst.LoginPageContanst;
import base.BasePage;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class LoginPage  extends BasePage implements LoginPageContanst {
    Logger LOGGER = Logger.getLogger(LoginPage.class);
     String email ="furbulutr@gmail.com";
     String parola ="deneme123";

    public void Login() throws InterruptedException {

       Thread.sleep(2000);
       Assert.assertTrue("Ana sayfada değilsiniz",isElementVisible(HomePage_logo,10)); // Ana sayfa da olup olmama durumu logo ile kontor edildi
       waitForElementAndClick(input_button);
       Thread.sleep(1000);
       waitForElementAndSendKeys(email_,email);
       Thread.sleep(1000);
       waitForElementAndSendKeys(passowrd_,parola);
       Thread.sleep(2000);
       waitForElementAndClick(login);
       Thread.sleep(2000);
       Assert.assertTrue("Login olunamadı",isElementVisible(HomePage_Name_Surname,10)); // Login olup olmama kontrol edilir
       Thread.sleep(1000);





    }



}
