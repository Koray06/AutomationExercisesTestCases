package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExePage;
import utilities.ConfigReader;
import utilities.Driver;

public class testCase05 {
  /*
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'New User Signup!' is visible
    6. Enter name and already registered email address
    7. Click 'Signup' button
    8. Verify error 'Email Address already exist!' is visible

   */

    @Test
    public void test(){
        AutoExePage autoExePage = new AutoExePage();
    //    1. Launch browser
    //    2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoexeUrl"));
    //    3. Verify that home page is visible successfully
        Assert.assertTrue(autoExePage.anaSayfaDogrulama.isDisplayed());
   //     4. Click on 'Signup / Login' button
        autoExePage.kaydolveGirisButonu.click();
   //     5. Verify 'Login to your account' is visible
        Assert.assertTrue(autoExePage.LoginToYourAccount.isDisplayed());
   //     6. Enter name and already registered email address
        autoExePage.isimgirme.sendKeys(ConfigReader.getProperty("name"));
        autoExePage.emailGirme.sendKeys(ConfigReader.getProperty("email"));
   //     7. Click 'Signup' button
        autoExePage.kaydol.click();
   //     8. Verify error 'Email Address already exist!' is visible
        Assert.assertTrue(autoExePage.EmailAlreadyExist.isDisplayed());
    }
}
