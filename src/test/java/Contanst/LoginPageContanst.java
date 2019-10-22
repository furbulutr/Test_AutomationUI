package Contanst;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface LoginPageContanst {
    public ElementInfo HomePage_logo = new ElementInfo("Ana Sayfada değilsiniz",By.xpath("//*[@id=\"header\"]/div/h1/a/img"));
    public ElementInfo input_button = new ElementInfo("Giriş yap buttonu bulunamadı", By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]"));
    public ElementInfo email_ = new ElementInfo("Mail bilgisi girilmedi", By.xpath("//*[@id=\"email\"]"));
    public ElementInfo passowrd_ = new ElementInfo("Parola girilmedi", By.xpath("//*[@id=\"password\"]"));
    public ElementInfo login = new ElementInfo("Giriş yap button tıklanmadı",By.id("loginButton"));
    public ElementInfo HomePage_Name_Surname = new ElementInfo("Ana Sayfada değilsiniz",By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[1]/a[2]"));



}
