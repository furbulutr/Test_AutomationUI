package Contanst;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface AddFavoriteContanst {

    public ElementInfo search = new ElementInfo("bilgisayar yazılmadı", By.id("searchData"));
    public ElementInfo search_icon = new ElementInfo("Ana Sayfada değilsiniz", By.xpath("  //*[@id=\"header\"]/div/div/div[2]/div[1]/a/span"));
    public ElementInfo PAGE_2 = new ElementInfo("2. sayfaya geçilemedi", By.cssSelector("#contentListing > div > div > div.productArea > div.pagination > a:nth-child(2)"));
    public ElementInfo page_2_control = new ElementInfo("2. sayfada bilgisayar ile ürün bulunamadı", By.xpath("//div[@class='pagination']/a[text()='2']"));
    public ElementInfo ürün_tıkla = new ElementInfo("ürüne tıklanmadı", By.xpath("//*[@id=\"contentListing\"]/div/div/div[2]/div[2]/ul/li[1]/a/h4"));
    public ElementInfo sepete_ekle = new ElementInfo("bilgisayar yazılmadı", By.xpath("//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[3]/a[2]"));
    public ElementInfo sepete_git = new ElementInfo("bilgisayar yazılmadı", By.xpath(" //*[@id=\"header\"]/div/div/div[2]/div[2]/div[4]/a/i\n"));
    public ElementInfo sepet_fiyat = new ElementInfo("Search alanına tıklanamadı.", By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[2]/div/span"));
    public ElementInfo artırma_icon = new ElementInfo("artırma işlemi gercekleşmedi", By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[1]/div/span[1]"));
    public ElementInfo delete_icon = new ElementInfo("Delete işlemi gercekleşmedi", By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[1]/div[3]/div[2]/span[1]"));
    public ElementInfo sepet_boş_yazısı = new ElementInfo("bilgisayar yazılmadı", By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/div[1]/h2"));
    public ElementInfo arttırılmıs_input = new ElementInfo("bilgisayar yazılmadı", By.xpath("//div[@class='spinnerField ']/input"));







}
