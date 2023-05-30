package TestCases;

import Base.BaseTest;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class AddToCart extends BaseTest {
    @Test
    public void AddGamesToCart()
    {
        driver.get("https://www.amazon.eg/-/en/ref=nav_logo");
        LoginPage login=new LoginPage(driver);
        login.login("","")   //please enter a valid email and password i deleted my personal data
                .ClickOnAllVideoGames()
                .clickItemLessFifteen()
                .isListSortedFromHighToLow();
    }
}
