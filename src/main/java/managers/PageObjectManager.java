package managers;

import PageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private WebDriver driver;
    private LoginPage loginPage;


    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }

    public LoginPage getloginPage(){

        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

    }

}
