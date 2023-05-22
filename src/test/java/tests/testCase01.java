package tests;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExePage;
import utilities.ConfigReader;
import utilities.Driver;
public class testCase01 {
 /* görevler ;
    1. Tarayıcıyı başlatın
    2. 'http://automationexercise.com' URL'sine gidin
    3. Ana sayfanın başarıyla göründüğünü doğrulayın
    4. 'Kaydol / Giriş Yap' düğmesine tıklayın
    5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
    6. Adı ve e-posta adresini girin
    7. 'Kaydol' düğmesini tıklayın
    8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin göründüğünü doğrulayın
    9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
    10. 'Bültenimize kaydolun!' onay kutusunu seçin.
    11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
    12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
    13. 'Hesap Oluştur düğmesini' tıklayın
    14. 'HESAP OLUŞTURULDU!' görünür
    15. 'Devam Et' düğmesini tıklayın
    16. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
    17. 'Hesabı Sil' düğmesini tıklayın
    18. 'HESAP SİLİNDİ!' görünür ve 'Devam Et' düğmesini tıklayın*/

    @Test
    public void test01() throws InterruptedException {
        //   'http://automationexercise.com' URL'sine gidin
        AutoExePage autoExePage = new AutoExePage ();
        Driver.getDriver().get(ConfigReader.getProperty("autoexeUrl"));



        //Ana sayfanın başarıyla göründüğünü doğrulayın

        Assert.assertTrue(autoExePage.anaSayfaDogrulama.isDisplayed());

        //  'Kaydol / Giriş Yap' düğmesine tıklayın
        autoExePage.kaydolveGirisButonu.click();

        //Yeni Kullanıcı Kaydı!'nın  görünür olduğunu  doğrulayın!
        Assert.assertTrue(autoExePage.yeniKullaniciKaydiisDsiplayed.isDisplayed());



        // Adı ve e-posta adresini girin
        Faker faker = new Faker();
        autoExePage.isimgirme.sendKeys(faker.name().firstName());
        autoExePage.emailGirme.sendKeys(faker.internet().emailAddress());

        //  'Kaydol' düğmesini tıklayın
        autoExePage.kaydol.click();

        //'HESAP BİLGİLERİNİ GİRİN' ifadesinin göründüğünü doğrulayın
        Assert.assertTrue(autoExePage.uyeGirisi.isDisplayed());



        // Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi

        autoExePage.title.click();
        autoExePage.password.sendKeys(faker.internet().password());
        autoExePage.day.sendKeys("17");
        autoExePage.mount.sendKeys("7");
        autoExePage.year.sendKeys("1983"+Keys.END);
        Thread.sleep(1000);

        autoExePage.singUpForButonu.click();
        autoExePage.firstName.sendKeys(faker.name().firstName());
        autoExePage.lastName.sendKeys(faker.name().lastName());
        autoExePage.company.sendKeys(faker.company().name());
        autoExePage.adress1.sendKeys(faker.address().streetAddress());
        autoExePage.adress2.sendKeys(faker.address().city());
        autoExePage.country.sendKeys("United States");
        autoExePage.state.sendKeys(faker.address().state());
        autoExePage.city.sendKeys(faker.address().city());
        autoExePage.zipcode.sendKeys(faker.address().zipCode());
        autoExePage.mobilNumber.sendKeys(faker.phoneNumber().cellPhone());

        autoExePage.createAccountButonu.click();

        //HESAP OLUŞTURULDU!' görünür olduğunu test edin
        Assert.assertTrue( autoExePage.hesapOlusturuldu.isDisplayed());

        //'Devam Et' düğmesini tıklayın
        autoExePage.devamEt.click();
        // burada devam et butonuna bastıktan sonra bir reklam çıkıyor onu kapatmaya çalışalım
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();

        // Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın

        Assert.assertTrue(autoExePage.loginKontrol.isDisplayed());

        // 'Hesabı Sil' düğmesini tıklayın
        autoExePage.deleteAccount.click();

        // 'HESAP SİLİNDİ!' görünür olduğunu test ederek  'Devam Et' düğmesini tıklayın*/

        Assert.assertTrue(autoExePage.deleteAccountisDisplayed.isDisplayed());
        autoExePage.contineEnd.click();

    }
}
