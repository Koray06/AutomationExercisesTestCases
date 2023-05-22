package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoExePage;
import utilities.ConfigReader;
import utilities.Driver;

public class testCase04 {
/*
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'Login to your account' is visible
    6. Enter correct email address and password
    7. Click 'login' button
    8. Verify that 'Logged in as username' is visible
    9. Click 'Logout' button
    10. Verify that user is navigated to login page

 */

    @Test
    public void test01(){
  //  1. Launch browser
  //  2. Navigate to url 'http://automationexercise.com'
        AutoExePage autoExePage = new AutoExePage();
        Driver.getDriver().get(ConfigReader.getProperty("autoexeUrl"));
  //  3. Verify that home page is visible successfully
        Assert.assertTrue(autoExePage.anaSayfaDogrulama.isDisplayed());
  //  4. Click on 'Signup / Login' button
        autoExePage.kaydolveGirisButonu.click();
  //  5. Verify 'Login to your account' is visible
        Assert.assertTrue(autoExePage.LoginToYourAccount.isDisplayed());
  //  6. Enter correct email address and password
        autoExePage.inputEmail.sendKeys(ConfigReader.getProperty("email"));
        autoExePage.inputpassword.sendKeys(ConfigReader.getProperty("password"));
  //  7. Click 'login' button
        autoExePage.loginButton.click();
  //  8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(autoExePage.loginKontrol.isDisplayed());
  //  9. Click 'Logout' button
        autoExePage.buttonLogout.click();
  //  10. Verify that user is navigated to login page
        Assert.assertTrue(autoExePage.kaydolveGirisButonu.isDisplayed());
        Driver.closeDriver();
}
}