package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver)
        {
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }
    @FindBy(id = "nav-hamburger-menu")
    private WebElement BurgerMenu;

    @FindBy(linkText = "Sign in")
    private WebElement SignUpInBurgerMenu;

    @FindBy(css = "input[type=\"email\"]")
    private WebElement PhoneNumber;

    @FindBy(id = "continue")
    private WebElement ContinueButton;

    @FindBy(id = "ap_password")
    private WebElement Password;

    @FindBy(css = "input[id=\"signInSubmit\"]")
    private WebElement SignUpButton;


    public HomePage login(String email, String pass)
    {
        BurgerMenu.click();
        SignUpInBurgerMenu.click();
        PhoneNumber.sendKeys(email);
        ContinueButton.click();
        Password.sendKeys(pass);
        SignUpButton.click();
        return new HomePage(driver);
    }

}
