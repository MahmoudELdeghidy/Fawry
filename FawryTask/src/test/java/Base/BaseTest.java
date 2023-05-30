package Base;

import Factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setupDriver()
    {
          driver = new DriverFactory().InitializeDriver();
          driver.get("https://www.amazon.eg/-/en/ref=nav_logo");
          driver.manage().window().maximize();
    }

}
