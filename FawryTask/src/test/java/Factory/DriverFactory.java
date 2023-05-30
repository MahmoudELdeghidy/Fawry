package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    public WebDriver InitializeDriver()
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        return driver;
    }

}
