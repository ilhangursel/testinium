package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bioekdswebtest extends BasePage {

    By searchBoxLocator = By.xpath("//*[@id=\"login-username\"]");
    By searchBoxLocatorSifre = By.xpath("//*[@id=\"login-password\"]");

    By submitButtonLocator = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/span/form/button");

    By submitButtonLocatorGuven = By.xpath("/html/body/header/div/div/div[2]/div/div/div/input");
    By submitButtonLocatorGuven1 = By.xpath("/html/body/header/div/div/div[2]/div/svg");

    By submitButtonLocatorGuven2 = By.className("card-body");
    By submitButtonLocatorGuven3 = By.xpath("//*[@id=\"vueapp\"]/div[2]/div/ul/li[2]/a");
    By submitButtonLocatorGuven4 = By.xpath("//*[@id=\"vueapp\"]/div[2]/div/div[1]/div[1]/button\n");
    By singn = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/ul/ul/li[1]/a/span");
    By servisayarlar─▒ = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/ul/ul/li[2]/a/span");
    By cihazlar = By.xpath("//*[@id=\"__BVID__238\"]/li[2]/a/span");
    By cihazlarekle = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div[3]/div[1]/div/div[2]/div/button/span");
    By cihazlarhex = By.xpath("//*[@id=\"cihaz-seri-no-hex\"]");
    By cihazlarekbilgi = By.xpath("//*[@id=\"ekBilgi\"]");
    By cihazlareklebuton = By.xpath("//*[@id=\"add-new-cihaz-sidebar\"]/div/span/form/div/button[1]");
    By cihaziptal = By.xpath("//*[@id=\"add-new-cihaz-sidebar\"]/div/span/form/div/button[2]");

    By cihazlarsil = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[3]/div/input");
    By seccihazsil = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr/td[1]/a/div/span");
    By seccihazsild├╝zenle = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/a");
    By seccihazsild├╝zenlesil = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div[2]/div/div/span/form/div/button[3]");
    By seccihazsild├╝zenlesilemin = By.xpath("/html/body/div[5]/div/div[3]/button[1]");

    By cihazg├╝ncelle = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[3]/div/input");
    By aracihazg├╝ncelle = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[3]/div/input");
    By seccihazg├╝ncelle = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr/td[2]/a/div");
    By seccihazd├╝zenle = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/a");
    By seccihazd├╝zenleyaz = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div[2]/div/div/span/form/span[2]/div/div/input");
    By seccihazd├╝zenleg├╝ncellebuton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div[2]/div/div/span/form/div/button[1]");





    By politika = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[2]/ul/li[3]/a/span");
    By politikaekle = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div[3]/div[1]/div/div[2]/div/a/span");
    By politikaetiket = By.xpath("//*[@id=\"etiket\"]");
    By politikaac─▒kla = By.xpath("//*[@id=\"aciklama\"]");
    By politikasens├Ârtipi = By.xpath("//*[@id=\"__BVID__423\"]");
    By politikakaydetbuton = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[1]");

    By politikag├╝ncelle = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[2]/ul/li[3]/a/span");
    By politikag├╝ncellesayfa = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[3]/div/div[2]/ul/li[3]/button");
    By politikag├╝ncellesayfaetiket = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[2]/div/input");
    By politikag├╝ncellesayfaetiketsec = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr/td[2]/a/div/span");
    By politikag├╝ncellesayfaetiketsecyaz = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[1]/div[3]/div/div/input");
    By politikag├╝ncellesayfaetiketsecbuton = By.xpath(" /html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[1]");




    By politikasilbuton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[4]");
    By politikasilbutoneminmisin = By.xpath(" /html/body/div[6]/div/div[3]/button[1]");



    By vatandasg├╝ncelle = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr[10]/td[2]/div/div/span");
    By vatandasg├╝ncelleyaz = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[1]/div[3]/div/div/input");
    By vatandasg├╝ncellebuton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[1]");




    By vatandassilservisayarlar─▒m = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[2]/a/span");
    By vatandassilvatanda┼č = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[2]/ul/li[4]/a/span");
    By vatandassilvatanda┼čse├ž = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr[10]/td[2]/div/div/span");
    By vatandassilvatanda┼čbuton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[4]");
    By vatandassilvatanda┼čeminmisin = By.xpath("/html/body/div[6]/div/div[3]/button[1]");


    By servisayarlar─▒m = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/ul/ul/li[2]/a/span");
    By vatandaslar = By.xpath("//*[@id=\"__BVID__238\"]/li[4]/a/span");

    By vatandaslarekle = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div[3]/div[1]/div/div[2]/div/a/span");
    By vatandaslartckimlikno = By.xpath("//*[@id=\"tckn\"]");
    By vatandaslarac─▒klamaalan─▒ = By.xpath("//*[@id=\"aciklama\"]");
    By vatandaslareklebuton = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[1]");


    By aray├╝zkullan─▒c─▒g├╝ncelle = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[3]/ul/li[1]/a/span");
    By aray├╝zkullan─▒c─▒g├╝ncellesec = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr[9]/td[1]/a/div/span");
    By aray├╝zkullan─▒c─▒g├╝ncelleyaz = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/span[3]/div/div/input");
    By aray├╝zkullan─▒c─▒g├╝ncelle┼čifre = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[2]/div/span/input");
    By aray├╝zkullan─▒c─▒g├╝ncelle┼čifretekrar = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[3]/div/span/input");
    By aray├╝zkullan─▒c─▒g├╝ncellebutton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[4]/button[1]");




    By aray├╝zkullan─▒c─▒sil = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[4]/button[2]");
    By aray├╝zkullan─▒c─▒sileminmisin = By.xpath("/html/body/div[6]/div/div[3]/button[1]");





    By kullan─▒c─▒ayari = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/ul/ul/li[3]/a/span");
    By aray├╝zkullan─▒c─▒si = By.xpath("//*[@id=\"__BVID__254\"]/li[1]/a/span\n");
    By aray├╝zkullan─▒c─▒siekleme = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div[3]/div[1]/div/div[2]/div/button/span\n");
    By aray├╝zkullan─▒c─▒sikullaniciadi = By.xpath(" //*[@id=\"kullanici-adi\"]");
    By aray├╝zkullan─▒c─▒siadi = By.xpath("//*[@id=\"ad\"]");
    By aray├╝zkullan─▒c─▒sisoyadi = By.xpath("//*[@id=\"soyad\"]");
    By aray├╝zkullan─▒c─▒sisifre = By.xpath("//*[@id=\"password\"]");
    By aray├╝zkullan─▒c─▒sisifretekrar = By.xpath("//*[@id=\"c-password\"]");
    By aray├╝zkullan─▒c─▒sieklebuton = By.xpath("//*[@id=\"add-new-kullanici-sidebar\"]/div/span/form/div[3]/button[1]");




    By Serviskullan─▒c─▒s─▒g├╝ncelle = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[3]/ul/li[2]/a/span");
    By Serviskullan─▒c─▒s─▒g├╝ncellesec = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr[6]/td[2]/a/div/span");
    By Serviskullan─▒c─▒s─▒g├╝ncelleyaz = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/span[2]/div/div/input");
    By Serviskullan─▒c─▒s─▒g├╝ncellebuton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[2]/button[1]");


    By Serviskullan─▒c─▒s─▒sil = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[2]/button[2]");
    By Serviskullan─▒c─▒s─▒sileminmisin = By.xpath("/html/body/div[6]/div/div[3]/button[1]");



    By serviskullan─▒c─▒s─▒n─▒sec = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[3]/ul/li[2]/a/span");
    By serviskullan─▒c─▒s─▒ = By.xpath("//*[@id=\"__BVID__254\"]/li[2]/a/span");
    By serviskullan─▒c─▒s─▒yeni = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div[3]/div[1]/div/div[2]/div/button/span");
    By serviskullan─▒c─▒s─▒kullan─▒c─▒adi = By.xpath("//*[@id=\"kullanici-adi\"]");
    By serviskullan─▒c─▒s─▒aciklama = By.xpath("//*[@id=\"aciklama\"]");
    By serviskullan─▒c─▒s─▒eklemebutonu = By.xpath("//*[@id=\"add-new-kullanici-sidebar\"]/div/span/form/div/button[1]");

    By islemkayitlari = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[4]/a/span");
    By KDS = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[4]/ul/li[1]/a/span");
    By Politika = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[4]/ul/li[2]/a/span");
    By Rol = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[4]/ul/li[3]/a/span");
    By Aray├╝zi┼člemleri = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[4]/ul/li[4]/a/span");


    By KDSkdb = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[1]/div/input");
    By serino = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[4]/div/input");
    By kimlikno = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[5]/div/input");
    By rol = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[5]/div/input");
    By bilgi = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[6]/div/input");



 //    Wait bekleme = new Wait();


    public bioekdswebtest(WebDriver driver) {

        super(driver);
    }

    /*public void search(String yazd─▒rma1,String yazd─▒rma2) {
        click(submitButtonLocatorGuven);
        click(submitButtonLocatorGuven1);

        type(submitButtonLocatoryazdirma1 , yazd─▒rma1);
        type(submitButtonLocatoryazdirma2, yazd─▒rma2);
        click(submitButtonLocatortikla);
*/


    public void login(String userName, String password) {
        type(searchBoxLocator, userName);
        type(searchBoxLocatorSifre, password);
        Wait.waitting();
        click(submitButtonLocator);
        Wait.waitting();
    }


    public void startLoginPage(String sort) {
        type(submitButtonLocatorGuven, sort);


    }

    public void deleteText() {
        Wait.waitting();

        find(submitButtonLocatorGuven).clear();
        Wait.waitting();
    }


    public void loginbaslang─▒c() {
        Wait.waitting();
        click(singn);
        Wait.waitting();
        click(servisayarlar─▒);
        Wait.waitting();
        click(cihazlar);
        Wait.waitting();
    }

    public void cihazekleme(String cihazserino, String ac─▒klama) {
        click(cihazlarekle);
        Wait.waitting();
        type(cihazlarhex, cihazserino);
        Wait.waitting();
        type(cihazlarekbilgi, ac─▒klama);
        Wait.waitting();
        click(cihazlareklebuton);
        Wait.waitting();
 //       click(cihaziptal);
   //     Wait.waitting();
    }

    public void politikaekleme(String politikaetiketi, String politikaac─▒klama) {

        Wait.waitting();
        click(politika);
        Wait.waitting();
        click(politikaekle);
        Wait.waitting();
        type(politikaetiket, politikaetiketi);
        Wait.waitting();
        type(politikaac─▒kla, politikaac─▒klama);
   /*     Wait.waitting();
        click(politikasens├Ârtipi);
        Wait.waitting();   */
        click(politikakaydetbuton);
        Wait.waitting();
    }


    public void vatandasekleme(String tckimlikno, String vatandasac─▒klama) {

        Wait.waitting();
        click(vatandaslar);
        Wait.waitting();
        click(vatandaslarekle);
        Wait.waitting();
        type(vatandaslartckimlikno, tckimlikno);
        Wait.waitting();
        type(vatandaslarac─▒klamaalan─▒, vatandasac─▒klama);
        Wait.waitting();
        click(vatandaslareklebuton);

    }

    public void aray├╝zkullan─▒c─▒eklemek(String kullan─▒c─▒adi, String adi, String soyadi, String ┼čifre, String ┼čifretekrar) {
        Wait.waitting();
        click(aray├╝zkullan─▒c─▒si);
        Wait.waitting();
        click(aray├╝zkullan─▒c─▒siekleme);
        Wait.waitting();
        type(aray├╝zkullan─▒c─▒sikullaniciadi, kullan─▒c─▒adi);
        type(aray├╝zkullan─▒c─▒siadi, adi);
        type(aray├╝zkullan─▒c─▒sisoyadi, soyadi);
        type(aray├╝zkullan─▒c─▒sisifre, ┼čifre);
        type(aray├╝zkullan─▒c─▒sisifretekrar, ┼čifretekrar);
        Wait.waitting();
        click(aray├╝zkullan─▒c─▒sieklebuton);
        Wait.waitting();

    }
    public void islemkyt(String chazno,String kdb,String tc, String rol─▒d,String ekbilgi) {
        Wait.waitting();
        click(islemkayitlari);
        Wait.waitting();
        click(KDS);
        Wait.waitting();
        type(KDSkdb,kdb);
        Wait.waitting();
        type(serino,chazno);
        Wait.waitting();
        click(Politika);
        Wait.waitting();
        type(kimlikno, tc);
        Wait.waitting();
        click(Rol);
        Wait.waitting();
        type(rol,rol─▒d);
        Wait.waitting();
        click(Aray├╝zi┼člemleri);
        Wait.waitting();
        type(bilgi,ekbilgi);

    }

    public void cihazsil(String cihazseri){
        Wait.waitting();
        type(cihazlarsil,cihazseri);
        Wait.waitting();
        click(seccihazsil);
        Wait.waitting();
        click(seccihazsild├╝zenle);
        Wait.waitting();
        click(seccihazsild├╝zenlesil);
        Wait.waitting();
        click(seccihazsild├╝zenlesil);
        Wait.waitting();
        click(seccihazsild├╝zenlesilemin);
        Wait.waitting();


    }
    public void cihazcihazg├╝ncelle(String cihazseri, String text){
        Wait.waitting();
        click(cihazg├╝ncelle);
        Wait.waitting();
        type(aracihazg├╝ncelle, cihazseri);
        Wait.waitting();
        click(seccihazg├╝ncelle);
        Wait.waitting();
        click(seccihazd├╝zenle);
        Wait.waitting();
        type(seccihazd├╝zenleyaz, text);
        Wait.waitting();
        click(seccihazd├╝zenleg├╝ncellebuton);

    }
     public void politikag├╝ncelle(String etiket){

        Wait.waitting();
        click(politikag├╝ncelle);
         Wait.waitting();
         click(politikag├╝ncellesayfa);
         Wait.waitting();
        type(politikag├╝ncellesayfaetiket, etiket);
         Wait.waitting();
        click(politikag├╝ncellesayfaetiketsec);
         Wait.waitting();
         type(politikag├╝ncellesayfaetiketsecyaz, etiket);
         Wait.waitting();
         click(politikag├╝ncellesayfaetiketsecbuton);
     }
     public void politakasil(String etiketilhan){
         Wait.waitting();
        click(politikag├╝ncelle);
         Wait.waitting();
         click(politikag├╝ncellesayfa);
         Wait.waitting();
         type(politikag├╝ncellesayfaetiket, etiketilhan);
         Wait.waitting();
         click(politikag├╝ncellesayfaetiketsec);
         Wait.waitting();
         click(politikasilbuton);
         Wait.waitting();
         click(politikasilbutoneminmisin);
         Wait.waitting();
     }
     public void vatanda┼čg├╝ncelle(String vatandasilhan){

         Wait.waitting();
         click(vatandaslar);
         Wait.waitting();
         click(vatandasg├╝ncelle);
         Wait.waitting();
         type(vatandasg├╝ncelleyaz, vatandasilhan);
         Wait.waitting();
          click(vatandasg├╝ncellebuton);
     }
      public void vatanda┼čsil(){

          Wait.waitting();
          click(vatandassilservisayarlar─▒m);
          Wait.waitting();
          click(vatandassilvatanda┼č);
          Wait.waitting();
          click(vatandassilvatanda┼čse├ž);
          Wait.waitting();
          click(vatandassilvatanda┼čbuton);
          Wait.waitting();
          click(vatandassilvatanda┼čeminmisin);
          Wait.waitting();

    }
    public void serviskullan─▒s─▒g├╝ncelle(String a├ž─▒kla){
        Wait.waitting();
        click(Serviskullan─▒c─▒s─▒g├╝ncelle);
        Wait.waitting();
        click(Serviskullan─▒c─▒s─▒g├╝ncellesec);
        Wait.waitting();
        type(Serviskullan─▒c─▒s─▒g├╝ncelleyaz, a├ž─▒kla);
        Wait.waitting();
        click(Serviskullan─▒c─▒s─▒g├╝ncellebuton);
        Wait.waitting();

    }
    public void serviskullan─▒c─▒s─▒sil(){
        Wait.waitting();
        click(Serviskullan─▒c─▒s─▒g├╝ncelle);
        Wait.waitting();
        click(Serviskullan─▒c─▒s─▒g├╝ncellesec);
        Wait.waitting();
        click(Serviskullan─▒c─▒s─▒sil);
        Wait.waitting();
        click(Serviskullan─▒c─▒s─▒sileminmisin);
        Wait.waitting();

    }
    public void serviskullan─▒c─▒s─▒ekle(String kullan─▒c─▒adi,String adi) {
        Wait.waitting();
        click(serviskullan─▒c─▒s─▒n─▒sec);
        Wait.waitting();
        click(serviskullan─▒c─▒s─▒);
        Wait.waitting();
        click(serviskullan─▒c─▒s─▒);
        Wait.waitting();
        click(serviskullan─▒c─▒s─▒yeni);
        Wait.waitting();
        type(serviskullan─▒c─▒s─▒kullan─▒c─▒adi, kullan─▒c─▒adi);
        type(serviskullan─▒c─▒s─▒aciklama, adi);
        Wait.waitting();
        click(serviskullan─▒c─▒s─▒eklemebutonu);
        Wait.waitting();
    }
    public void aray├╝zkullan─▒c─▒g├╝ncelle(String soyadi, String sifre){
        Wait.waitting();
        click(kullan─▒c─▒ayari);
        Wait.waitting();
        click(aray├╝zkullan─▒c─▒g├╝ncelle);
        Wait.waitting();
        click(aray├╝zkullan─▒c─▒g├╝ncellesec);
        Wait.waitting();
        type(aray├╝zkullan─▒c─▒g├╝ncelleyaz, soyadi);
        Wait.waitting();
         type(aray├╝zkullan─▒c─▒g├╝ncelle┼čifre,sifre);
         type(aray├╝zkullan─▒c─▒g├╝ncelle┼čifretekrar,sifre);
        Wait.waitting();
        click(aray├╝zkullan─▒c─▒g├╝ncellebutton);

    }
    public void aray├╝zkullan─▒c─▒sil(){
        Wait.waitting();
        click(aray├╝zkullan─▒c─▒g├╝ncelle);
        Wait.waitting();
        click(aray├╝zkullan─▒c─▒g├╝ncellesec);
        Wait.waitting();
        click(aray├╝zkullan─▒c─▒sil);
        Wait.waitting();
        click(aray├╝zkullan─▒c─▒sileminmisin);
        Wait.waitting();

    }

}
