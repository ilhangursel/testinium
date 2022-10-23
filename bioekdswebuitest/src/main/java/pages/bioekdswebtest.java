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
    By servisayarları = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/ul/ul/li[2]/a/span");
    By cihazlar = By.xpath("//*[@id=\"__BVID__238\"]/li[2]/a/span");
    By cihazlarekle = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div[3]/div[1]/div/div[2]/div/button/span");
    By cihazlarhex = By.xpath("//*[@id=\"cihaz-seri-no-hex\"]");
    By cihazlarekbilgi = By.xpath("//*[@id=\"ekBilgi\"]");
    By cihazlareklebuton = By.xpath("//*[@id=\"add-new-cihaz-sidebar\"]/div/span/form/div/button[1]");
    By cihaziptal = By.xpath("//*[@id=\"add-new-cihaz-sidebar\"]/div/span/form/div/button[2]");

    By cihazlarsil = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[3]/div/input");
    By seccihazsil = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr/td[1]/a/div/span");
    By seccihazsildüzenle = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/a");
    By seccihazsildüzenlesil = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div[2]/div/div/span/form/div/button[3]");
    By seccihazsildüzenlesilemin = By.xpath("/html/body/div[5]/div/div[3]/button[1]");

    By cihazgüncelle = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[3]/div/input");
    By aracihazgüncelle = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[3]/div/input");
    By seccihazgüncelle = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr/td[2]/a/div");
    By seccihazdüzenle = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/a");
    By seccihazdüzenleyaz = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div[2]/div/div/span/form/span[2]/div/div/input");
    By seccihazdüzenlegüncellebuton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div[2]/div/div/span/form/div/button[1]");





    By politika = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[2]/ul/li[3]/a/span");
    By politikaekle = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div[3]/div[1]/div/div[2]/div/a/span");
    By politikaetiket = By.xpath("//*[@id=\"etiket\"]");
    By politikaacıkla = By.xpath("//*[@id=\"aciklama\"]");
    By politikasensörtipi = By.xpath("//*[@id=\"__BVID__423\"]");
    By politikakaydetbuton = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[1]");

    By politikagüncelle = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[2]/ul/li[3]/a/span");
    By politikagüncellesayfa = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[3]/div/div[2]/ul/li[3]/button");
    By politikagüncellesayfaetiket = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[2]/div/input");
    By politikagüncellesayfaetiketsec = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr/td[2]/a/div/span");
    By politikagüncellesayfaetiketsecyaz = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[1]/div[3]/div/div/input");
    By politikagüncellesayfaetiketsecbuton = By.xpath(" /html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[1]");




    By politikasilbuton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[4]");
    By politikasilbutoneminmisin = By.xpath(" /html/body/div[6]/div/div[3]/button[1]");



    By vatandasgüncelle = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr[10]/td[2]/div/div/span");
    By vatandasgüncelleyaz = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[1]/div[3]/div/div/input");
    By vatandasgüncellebuton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[1]");




    By vatandassilservisayarlarım = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[2]/a/span");
    By vatandassilvatandaş = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[2]/ul/li[4]/a/span");
    By vatandassilvatandaşseç = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr[10]/td[2]/div/div/span");
    By vatandassilvatandaşbuton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[4]");
    By vatandassilvatandaşeminmisin = By.xpath("/html/body/div[6]/div/div[3]/button[1]");


    By servisayarlarım = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/ul/ul/li[2]/a/span");
    By vatandaslar = By.xpath("//*[@id=\"__BVID__238\"]/li[4]/a/span");

    By vatandaslarekle = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div[3]/div[1]/div/div[2]/div/a/span");
    By vatandaslartckimlikno = By.xpath("//*[@id=\"tckn\"]");
    By vatandaslaracıklamaalanı = By.xpath("//*[@id=\"aciklama\"]");
    By vatandaslareklebuton = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div/div/form/div/div[3]/button[1]");


    By arayüzkullanıcıgüncelle = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[3]/ul/li[1]/a/span");
    By arayüzkullanıcıgüncellesec = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr[9]/td[1]/a/div/span");
    By arayüzkullanıcıgüncelleyaz = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/span[3]/div/div/input");
    By arayüzkullanıcıgüncelleşifre = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[2]/div/span/input");
    By arayüzkullanıcıgüncelleşifretekrar = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[3]/div/span/input");
    By arayüzkullanıcıgüncellebutton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[4]/button[1]");




    By arayüzkullanıcısil = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[4]/button[2]");
    By arayüzkullanıcısileminmisin = By.xpath("/html/body/div[6]/div/div[3]/button[1]");





    By kullanıcıayari = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/ul/ul/li[3]/a/span");
    By arayüzkullanıcısi = By.xpath("//*[@id=\"__BVID__254\"]/li[1]/a/span\n");
    By arayüzkullanıcısiekleme = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div[3]/div[1]/div/div[2]/div/button/span\n");
    By arayüzkullanıcısikullaniciadi = By.xpath(" //*[@id=\"kullanici-adi\"]");
    By arayüzkullanıcısiadi = By.xpath("//*[@id=\"ad\"]");
    By arayüzkullanıcısisoyadi = By.xpath("//*[@id=\"soyad\"]");
    By arayüzkullanıcısisifre = By.xpath("//*[@id=\"password\"]");
    By arayüzkullanıcısisifretekrar = By.xpath("//*[@id=\"c-password\"]");
    By arayüzkullanıcısieklebuton = By.xpath("//*[@id=\"add-new-kullanici-sidebar\"]/div/span/form/div[3]/button[1]");




    By Serviskullanıcısıgüncelle = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[3]/ul/li[2]/a/span");
    By Serviskullanıcısıgüncellesec = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[3]/div[2]/table/tbody/tr[6]/td[2]/a/div/span");
    By Serviskullanıcısıgüncelleyaz = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/span[2]/div/div/input");
    By Serviskullanıcısıgüncellebuton = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[2]/button[1]");


    By Serviskullanıcısısil = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div/span/form/div[2]/button[2]");
    By Serviskullanıcısısileminmisin = By.xpath("/html/body/div[6]/div/div[3]/button[1]");



    By serviskullanıcısınısec = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[3]/ul/li[2]/a/span");
    By serviskullanıcısı = By.xpath("//*[@id=\"__BVID__254\"]/li[2]/a/span");
    By serviskullanıcısıyeni = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[3]/div/div/div[3]/div[1]/div/div[2]/div/button/span");
    By serviskullanıcısıkullanıcıadi = By.xpath("//*[@id=\"kullanici-adi\"]");
    By serviskullanıcısıaciklama = By.xpath("//*[@id=\"aciklama\"]");
    By serviskullanıcısıeklemebutonu = By.xpath("//*[@id=\"add-new-kullanici-sidebar\"]/div/span/form/div/button[1]");

    By islemkayitlari = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[4]/a/span");
    By KDS = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[4]/ul/li[1]/a/span");
    By Politika = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[4]/ul/li[2]/a/span");
    By Rol = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[4]/ul/li[3]/a/span");
    By Arayüzişlemleri = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/ul/li[4]/ul/li[4]/a/span");


    By KDSkdb = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[1]/div/input");
    By serino = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[4]/div/input");
    By kimlikno = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[5]/div/input");
    By rol = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[5]/div/input");
    By bilgi = By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div/div[6]/div/input");



 //    Wait bekleme = new Wait();


    public bioekdswebtest(WebDriver driver) {

        super(driver);
    }

    /*public void search(String yazdırma1,String yazdırma2) {
        click(submitButtonLocatorGuven);
        click(submitButtonLocatorGuven1);

        type(submitButtonLocatoryazdirma1 , yazdırma1);
        type(submitButtonLocatoryazdirma2, yazdırma2);
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


    public void loginbaslangıc() {
        Wait.waitting();
        click(singn);
        Wait.waitting();
        click(servisayarları);
        Wait.waitting();
        click(cihazlar);
        Wait.waitting();
    }

    public void cihazekleme(String cihazserino, String acıklama) {
        click(cihazlarekle);
        Wait.waitting();
        type(cihazlarhex, cihazserino);
        Wait.waitting();
        type(cihazlarekbilgi, acıklama);
        Wait.waitting();
        click(cihazlareklebuton);
        Wait.waitting();
 //       click(cihaziptal);
   //     Wait.waitting();
    }

    public void politikaekleme(String politikaetiketi, String politikaacıklama) {

        Wait.waitting();
        click(politika);
        Wait.waitting();
        click(politikaekle);
        Wait.waitting();
        type(politikaetiket, politikaetiketi);
        Wait.waitting();
        type(politikaacıkla, politikaacıklama);
   /*     Wait.waitting();
        click(politikasensörtipi);
        Wait.waitting();   */
        click(politikakaydetbuton);
        Wait.waitting();
    }


    public void vatandasekleme(String tckimlikno, String vatandasacıklama) {

        Wait.waitting();
        click(vatandaslar);
        Wait.waitting();
        click(vatandaslarekle);
        Wait.waitting();
        type(vatandaslartckimlikno, tckimlikno);
        Wait.waitting();
        type(vatandaslaracıklamaalanı, vatandasacıklama);
        Wait.waitting();
        click(vatandaslareklebuton);

    }

    public void arayüzkullanıcıeklemek(String kullanıcıadi, String adi, String soyadi, String şifre, String şifretekrar) {
        Wait.waitting();
        click(arayüzkullanıcısi);
        Wait.waitting();
        click(arayüzkullanıcısiekleme);
        Wait.waitting();
        type(arayüzkullanıcısikullaniciadi, kullanıcıadi);
        type(arayüzkullanıcısiadi, adi);
        type(arayüzkullanıcısisoyadi, soyadi);
        type(arayüzkullanıcısisifre, şifre);
        type(arayüzkullanıcısisifretekrar, şifretekrar);
        Wait.waitting();
        click(arayüzkullanıcısieklebuton);
        Wait.waitting();

    }
    public void islemkyt(String chazno,String kdb,String tc, String rolıd,String ekbilgi) {
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
        type(rol,rolıd);
        Wait.waitting();
        click(Arayüzişlemleri);
        Wait.waitting();
        type(bilgi,ekbilgi);

    }

    public void cihazsil(String cihazseri){
        Wait.waitting();
        type(cihazlarsil,cihazseri);
        Wait.waitting();
        click(seccihazsil);
        Wait.waitting();
        click(seccihazsildüzenle);
        Wait.waitting();
        click(seccihazsildüzenlesil);
        Wait.waitting();
        click(seccihazsildüzenlesil);
        Wait.waitting();
        click(seccihazsildüzenlesilemin);
        Wait.waitting();


    }
    public void cihazcihazgüncelle(String cihazseri, String text){
        Wait.waitting();
        click(cihazgüncelle);
        Wait.waitting();
        type(aracihazgüncelle, cihazseri);
        Wait.waitting();
        click(seccihazgüncelle);
        Wait.waitting();
        click(seccihazdüzenle);
        Wait.waitting();
        type(seccihazdüzenleyaz, text);
        Wait.waitting();
        click(seccihazdüzenlegüncellebuton);

    }
     public void politikagüncelle(String etiket){

        Wait.waitting();
        click(politikagüncelle);
         Wait.waitting();
         click(politikagüncellesayfa);
         Wait.waitting();
        type(politikagüncellesayfaetiket, etiket);
         Wait.waitting();
        click(politikagüncellesayfaetiketsec);
         Wait.waitting();
         type(politikagüncellesayfaetiketsecyaz, etiket);
         Wait.waitting();
         click(politikagüncellesayfaetiketsecbuton);
     }
     public void politakasil(String etiketilhan){
         Wait.waitting();
        click(politikagüncelle);
         Wait.waitting();
         click(politikagüncellesayfa);
         Wait.waitting();
         type(politikagüncellesayfaetiket, etiketilhan);
         Wait.waitting();
         click(politikagüncellesayfaetiketsec);
         Wait.waitting();
         click(politikasilbuton);
         Wait.waitting();
         click(politikasilbutoneminmisin);
         Wait.waitting();
     }
     public void vatandaşgüncelle(String vatandasilhan){

         Wait.waitting();
         click(vatandaslar);
         Wait.waitting();
         click(vatandasgüncelle);
         Wait.waitting();
         type(vatandasgüncelleyaz, vatandasilhan);
         Wait.waitting();
          click(vatandasgüncellebuton);
     }
      public void vatandaşsil(){

          Wait.waitting();
          click(vatandassilservisayarlarım);
          Wait.waitting();
          click(vatandassilvatandaş);
          Wait.waitting();
          click(vatandassilvatandaşseç);
          Wait.waitting();
          click(vatandassilvatandaşbuton);
          Wait.waitting();
          click(vatandassilvatandaşeminmisin);
          Wait.waitting();

    }
    public void serviskullanısıgüncelle(String açıkla){
        Wait.waitting();
        click(Serviskullanıcısıgüncelle);
        Wait.waitting();
        click(Serviskullanıcısıgüncellesec);
        Wait.waitting();
        type(Serviskullanıcısıgüncelleyaz, açıkla);
        Wait.waitting();
        click(Serviskullanıcısıgüncellebuton);
        Wait.waitting();

    }
    public void serviskullanıcısısil(){
        Wait.waitting();
        click(Serviskullanıcısıgüncelle);
        Wait.waitting();
        click(Serviskullanıcısıgüncellesec);
        Wait.waitting();
        click(Serviskullanıcısısil);
        Wait.waitting();
        click(Serviskullanıcısısileminmisin);
        Wait.waitting();

    }
    public void serviskullanıcısıekle(String kullanıcıadi,String adi) {
        Wait.waitting();
        click(serviskullanıcısınısec);
        Wait.waitting();
        click(serviskullanıcısı);
        Wait.waitting();
        click(serviskullanıcısı);
        Wait.waitting();
        click(serviskullanıcısıyeni);
        Wait.waitting();
        type(serviskullanıcısıkullanıcıadi, kullanıcıadi);
        type(serviskullanıcısıaciklama, adi);
        Wait.waitting();
        click(serviskullanıcısıeklemebutonu);
        Wait.waitting();
    }
    public void arayüzkullanıcıgüncelle(String soyadi, String sifre){
        Wait.waitting();
        click(kullanıcıayari);
        Wait.waitting();
        click(arayüzkullanıcıgüncelle);
        Wait.waitting();
        click(arayüzkullanıcıgüncellesec);
        Wait.waitting();
        type(arayüzkullanıcıgüncelleyaz, soyadi);
        Wait.waitting();
         type(arayüzkullanıcıgüncelleşifre,sifre);
         type(arayüzkullanıcıgüncelleşifretekrar,sifre);
        Wait.waitting();
        click(arayüzkullanıcıgüncellebutton);

    }
    public void arayüzkullanıcısil(){
        Wait.waitting();
        click(arayüzkullanıcıgüncelle);
        Wait.waitting();
        click(arayüzkullanıcıgüncellesec);
        Wait.waitting();
        click(arayüzkullanıcısil);
        Wait.waitting();
        click(arayüzkullanıcısileminmisin);
        Wait.waitting();

    }

}
