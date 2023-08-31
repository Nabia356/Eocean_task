package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseTest;
import utilities.DefaultConfiguration;

public class LoginPage extends BaseTest {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//input[@id='username']")
    private WebElement login_email;

    @FindBy(xpath="//input[@id='password']")
    private WebElement login_password;
    @FindBy(xpath="//button[contains(text(),'LOGIN')]")
    private WebElement login_button;

    @FindBy(xpath="")
    private WebElement nav_to_account;

    @FindBy(xpath="")
    private WebElement logout;

    public void  launchEnvironment() {
        driver.get(DefaultConfiguration.getProperty("uiEnvironment"));
        driver.manage().window().maximize();

    }

    public void login(){

        sendText(login_email, DefaultConfiguration.getProperty("uiEmail"),"email");
        sendText(login_password,DefaultConfiguration.getProperty("password"),"password");
        clickElement(login_button,"login");
    }
    public void logout(){
       clickElement(nav_to_account,"click on my account");
       clickElement(logout,"logout");

    }
}
