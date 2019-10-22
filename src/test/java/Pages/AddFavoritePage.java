package Pages;

import Contanst.AddFavoriteContanst;
import base.BasePage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddFavoritePage extends BasePage implements AddFavoriteContanst {
    String searchh = "bilgisayar";

    public static String ilk_gözükenFiyat;
    public static String sepetteki_fiyat;
   public void FavoritePage() throws InterruptedException {

       waitForElementAndSendKeys(search,searchh);
       Thread.sleep(1000);
       waitForElementAndClick(search_icon);
       Thread.sleep(2000);
       scrollToElementWithJs(PAGE_2);
       waitForElementAndClick(PAGE_2);
       Thread.sleep(1000);
       Assert.assertTrue("2.sayfada değilsiniz ",waitForElementAndGetAttribute(page_2_control,"class").equals("active "));
       //Assert.assertTrue("2. sayfada değilsiniz",isElementVisible(page_2_control,10)); // 2.sayfa kontrol yapıldı.
       scrollToElementWithJs(ürün_tıkla);
       waitForElementAndClick(ürün_tıkla); // rasgele ürün sec
       Thread.sleep(1000);
       WebElement element =driver.findElement(By.xpath("//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[2]/div/div[1]/div/ins"));
       ilk_gözükenFiyat= get_text_from_parent_by_postion(driver,element,1).trim(); // İlk fiyat bilgisini aldık
       String ilkGözükenFiyat = ilk_gözükenFiyat+" TL";
       System.out.println("İlk fiyat bilgisi = "+ilk_gözükenFiyat +" TL");
       waitForElementAndClick(sepete_ekle);
       Thread.sleep(4000);
       waitForElementAndClick(sepete_git);
       Thread.sleep(4000);
       WebElement elementt =driver.findElement(By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[2]/div/span"));
       sepetteki_fiyat= get_text_from_parent_by_postion(driver,elementt,1).trim(); //sepetteki fiyat bilgisini aldık
       System.out.println("Sepetteki fiyat = " + sepetteki_fiyat);
       Assert.assertEquals("fiyatları eşit değildir",ilkGözükenFiyat,sepetteki_fiyat);
       Thread.sleep(1000);
       waitForElementAndClick(artırma_icon);
       Thread.sleep(2000);

       Assert.assertTrue("Arttırma işleminde hata oluştu.",waitForElementAndGetAttribute(arttırılmıs_input,"value").equals("2"));

       //div[@class='spinnerField ']/input
      // int yenifiyatInt= Integer.parseInt(sepetteki_fiyat)*2;

    //  Assert.assertEquals("Fiyat artmamıştır",sepetteki_fiyat sepetteki_fiyat); //KONTROL YAPILICAK

       waitForElementAndClick(delete_icon);
       Thread.sleep(3000);
       Assert.assertTrue("Ürün silinemedi",isElementVisible(sepet_boş_yazısı,10)); // Sepettin boş olduğu kontorlu yapıldı.
       Thread.sleep(2000);

   }
}
