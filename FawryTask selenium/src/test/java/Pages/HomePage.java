package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private  WebDriver driver;
    private WebDriverWait wait;
    public static List<String> productNames;

    public HomePage(WebDriver driver)
    {
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "nav-hamburger-menu")
    private WebElement SeeAllMenu;

    @FindBy(xpath = "//div[contains(text(),'see all')]")
    private WebElement SeeMore;

    @FindBy(xpath = "//a[@data-ref-tag=\"nav_em_1_1_1_21\"]")
    private WebElement VideoGames;

    @FindBy(xpath = "//a[contains(text(),'All Video Games')]")
    private WebElement AllVideoGamesList;

    @FindBy(xpath = "//body/div[@id='a-page']/div[1]/div[2]/div[2]/div[1]/div[1]/div[6]/ul[1]/li[1]/span[1]/a[1]/span[1]")
    private WebElement NewItems;

    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    private WebElement Dropdown;

    @FindBy(xpath = "//a[@id='s-result-sort-select_2']")
    private WebElement SelectHighToLow;

     @FindBy(id="add-to-cart-button")
     private WebElement AddToCartButton;

      @FindBy(xpath="//span[@id=\"productTitle\"]")
      private WebElement productTitle;

     @FindBy(xpath="//div[@class=\"a-button-stack\"]//span[text()=\" No Thanks \"]/preceding-sibling::input[@type=\"submit\"])[1]")
     private WebElement noThanksButton;

    @FindBy(xpath="//input[contains(@value,\"Proceed to checkout\")]")
    private WebElement itemAddedLabel;


    @FindBy(xpath="//span[@class=\"a-price-whole\"]")
    private WebElement inventoryItemsPrice;

    @FindBy(xpath="//span[text()=\"Price: High to Low\"]")
    private WebElement sortingType;




    public HomePage ClickOnAllVideoGames()
    {
        SeeAllMenu.click();
        SeeMore.click();
        VideoGames.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        AllVideoGamesList.click();
        NewItems.click();
        Dropdown.click();
        SelectHighToLow.click();
        return this;
    }

    public HomePage clickItemLessFifteen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"a-price-whole\"]")));
        productNames = new ArrayList<>();
        List<WebElement> priceElements = driver.findElements((By) inventoryItemsPrice);
        for(int i=0 ; i<priceElements.size();i++){
            priceElements = driver.findElements((By) inventoryItemsPrice);
            int price = Integer.parseInt(priceElements.get(i).getText().replace(",", ""));
            if (price < 15000) {
                WebElement temp =priceElements.get(i);
                wait.until(ExpectedConditions.visibilityOf(temp));
                temp.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated((By) productTitle));
                productNames.add(driver.findElement((By) productTitle).getText());
                wait.until(ExpectedConditions.visibilityOfElementLocated((By) AddToCartButton));
                driver.findElement((By) AddToCartButton).click();
                try{
                    new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated((By) noThanksButton));
                    driver.findElement((By) noThanksButton).click();
                }catch(Exception e){}
                wait.until(ExpectedConditions.visibilityOfElementLocated((By) itemAddedLabel));
                driver.navigate().to("https://www.amazon.eg/s?i=videogames&bbn=18022560031&rh=n%3A18022560031%2Cp_n_free_shipping_eligible%3A21909080031%2Cp_n_condition-type%3A28071525031&s=price-desc-rank&dc&language=en&ds=v1%3A37Ugb%2FcC1AU8LVGV%2BwNCMqWpl2zQMa0oCF9DOW3kGTs&qid=1685394417&rnid=28071523031&ref=sr_st_price-desc-rank");
            }
        }
        return this;
    }

    public String  isListSortedFromHighToLow(){
        WebElement element = driver.findElement((By) sortingType);
        return element.getText();
    }
}
