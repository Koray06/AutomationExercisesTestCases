package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class AutoExePage {
    public  AutoExePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//img[@src=\"/static/images/home/logo.png\"]")
    public WebElement anaSayfaDogrulama;
    @FindBy(xpath = "//a[@href=\"/login\"]")
    public WebElement kaydolveGirisButonu;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement yeniKullaniciKaydiisDsiplayed;

    @FindBy(xpath = "//input[@data-qa=\"signup-name\"]")
    public WebElement isimgirme;

    @FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
    public WebElement emailGirme;

    @FindBy(xpath = "//button[@data-qa=\"signup-button\"]")
    public WebElement kaydol;

    @FindBy(xpath = "//*[text()= 'Enter Account Information']")
    public WebElement uyeGirisi;

    @FindBy(xpath = "//input[@value=\"Mr\"]")
    public WebElement title;

    @FindBy(xpath = "//input[@data-qa=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//select[@data-qa=\"days\"]")
    public WebElement day;
    @FindBy(xpath = "//select[@data-qa=\"months\"]")
    public WebElement mount;

    @FindBy(xpath = "//select[@data-qa=\"years\"]")
    public WebElement year;
    //label[@for="newsletter"]
    @FindBy(xpath = "//label[@for=\"newsletter\"]")
    public WebElement singUpForButonu;
    @FindBy(xpath = "//input[@data-qa=\"first_name\"]")
    public WebElement firstName;
    @FindBy(xpath = "//input[@data-qa=\"last_name\"]")
    public WebElement lastName;
    @FindBy(xpath = "//input[@data-qa=\"company\"]")
    public WebElement company;
    @FindBy(xpath = "//input[@data-qa=\"address\"]")
    public WebElement adress1;
    @FindBy(xpath = "//input[@data-qa=\"address2\"]")
    public WebElement adress2;
    @FindBy(xpath = "//select[@data-qa=\"country\"]")
    public WebElement country;
    @FindBy(xpath = "//input[@data-qa=\"state\"]")
    public WebElement state;
    @FindBy(xpath = "//input[@data-qa=\"city\"]")
    public WebElement city;
    @FindBy(xpath = "//input[@data-qa=\"zipcode\"]")
    public WebElement zipcode;
    @FindBy(xpath = "//input[@id=\"mobile_number\"]")
    public WebElement mobilNumber;
    @FindBy(xpath = "//button[@data-qa=\"create-account\"]")
    public WebElement createAccountButonu;
    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement hesapOlusturuldu;
    @FindBy(xpath = "//a[@data-qa=\"continue-button\"]")
    public WebElement devamEt;
    @FindBy(xpath = "//span[@class=\"ns-lj22b-e-16\"]")
    public WebElement reklamKapat;

    @FindBy(xpath = "//div[@class='grippy-host']")
    public WebElement reklamKapat01;
    //
    @FindBy(xpath = "//path[@stroke='#FAFAFA']")
    public WebElement reklamKapat02;

    @FindBy(xpath = "//*[text()= ' Logged in as ' ]")
    public WebElement loginKontrol;
    @FindBy(xpath = "//a[@href=\"/delete_account\"]")
    public WebElement deleteAccount;
    @FindBy(xpath = "//b[text()='Account Deleted!']")
    public WebElement deleteAccountisDisplayed;
    @FindBy(xpath = "//a[@data-qa=\"continue-button\"]")
    public WebElement contineEnd;
    //login to your account
    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement LoginToYourAccount;
    // emailbox
    @FindBy(xpath = "//input[@data-qa=\"login-email\"]")
    public WebElement inputEmail;
    // password
    @FindBy(xpath = "//input[@data-qa=\"login-password\"]")
    public WebElement inputpassword;
    // login button
    @FindBy(xpath = "//button[@data-qa=\"login-button\"]")
    public WebElement loginButton;
    //Your email or password is incorrect!
    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement passwordIsIncorrect;
    @FindBy(xpath = "//a[@href=\"/logout\"]")
    public WebElement buttonLogout;
}
