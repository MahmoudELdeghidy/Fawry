package TestCases;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest
{

    @Test
    public void Userlogin()
    {
        driver.get("https://www.amazon.eg/-/en/ref=nav_logo");
        LoginPage login=new LoginPage(driver);
        login.login("","");//please enter a valid email and password i deleted my personal data
    }
}
