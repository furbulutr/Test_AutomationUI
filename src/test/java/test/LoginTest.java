package test;

import Pages.AddFavoritePage;
import Pages.LoginPage;
import base.BaseTest;
import org.junit.Test;

public class LoginTest  extends BaseTest {


    AddFavoritePage addFavoritePage;
    LoginPage loginPage;
    @Test
    public void LoginTest() throws InterruptedException{

        loginPage = new LoginPage();
        addFavoritePage = new AddFavoritePage();


        loginPage.Login();
        addFavoritePage.FavoritePage();





    }




}
