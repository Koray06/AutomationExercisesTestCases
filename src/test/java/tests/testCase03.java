package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExePage;
import utilities.ConfigReader;
import utilities.Driver;

public class testCase03 {
   /*
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'Login to your account' is visible
    6. Enter incorrect email address and password
    7. Click 'login' button
    8. Verify error 'Your email or password is incorrect!' is visible

    */

    @Test
    public void test01(){
    //    1. Launch browser
    //    2. Navigate to url 'http://automationexercise.com'
        AutoExePage autoExePage = new AutoExePage();
        Driver.getDriver().get(ConfigReader.getProperty("autoexeUrl"));
   //     3. Verify that home page is visible successfully
        Assert.assertTrue(autoExePage.anaSayfaDogrulama.isDisplayed());
   //     4. Click on 'Signup / Login' button
        autoExePage.kaydolveGirisButonu.click();
   //    5. Verify 'Login to your account' is visible
        Assert.assertTrue(autoExePage.LoginToYourAccount.isDisplayed());
   //    6. Enter incorrect email address and password
        autoExePage.inputEmail.sendKeys(ConfigReader.getProperty("Incorrectemail"));
        autoExePage.inputpassword.sendKeys(ConfigReader.getProperty("Incorrectpassword"));
   //    7. Click 'login' button
        autoExePage.loginButton.click();
   //    8. Verify error 'Your email or password is incorrect!' is visible
        Assert.assertTrue(autoExePage.passwordIsIncorrect.isDisplayed());
        Driver.closeDriver();
    }


}
