package Steps;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.MenPage;
import pages.SearchResultPage;

import java.util.List;

import static java.lang.Thread.sleep;


public class Steps {
    String productId="a[data-product-id='39004581']";

    String itemToSearch = "Kensington";
//
    private WebDriver driver = CHDriver.getWebDriver();
//////    ChromeDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
////    public void click (String css){
////        driver.findElement(By.cssSelector(css)).click();
////    }
////    public void setValue (String css, String value) {
////        driver.findElement(By.cssSelector(css)).sendKeys(value);
////    }
////    public void getValue (String css){
////        driver.findElement(By.cssSelector(css)).getText();
////    }
////
////    public void findElementByCss (String css){
//////        driver.findElement(By.cssSelector(css));
////        WebElement dynamicElement = (new WebDriverWait(driver, 5))
////                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
////
////    }
//////    public void findListOfElements(String css) {
//////        List<WebElement> dynamicElements = (new WebDriverWait(driver, 5))
//////                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
//////    }
//
//
//
//    @Before
//    public void preset(String[] args) {
//        driver.navigate().to("https://ru.burberry.com/");
//
////        driver.get();
//
//    }
//    @After
//    public void close() {
//
//        driver.quit();
//    }
    @Test
    public void shouldCheckPDPforItem() throws InterruptedException {
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        String searchResult = ".products";
//        String searchCSS = ".main-form__search-box";
//        String btnAddTobag = ".ga-add-to-bag";
//        String btnSearch =".ga-sslu-store-button";
//        String imageCSS ="product-image-asset-content.asset-container.cell-asset-bg.js-asset-container.js-product-cursor-container";
//        findElementByCss(searchCSS);
//        WebElement element = driver.findElement(By.cssSelector(searchcss))
//        findElement.sendKeys(fieldToSearch);
//        dynamicElement.sendKeys(Keys.ENTER);
//        String fieldToSearch = "Kensington";
//        setValue(searchCSS, fieldToSearch);
//        setValue(searchCSS, "Keys.Enter");
//        findElementByCss(searchResult);
//        findElementByCss(productId);
//
//        findElementByCss(btnAddTobag);
//        findElementByCss(imageCSS);
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.click(By.linkText("Мужчины"));
//        MenPage menPage = new mainPage.;
        sleep(3000);
        mainPage.moveToElement(By.id("navigation-bar-link-cat1350556"));
        sleep(3000);
        mainPage.click(By.cssSelector("a[data-category-id='cat3650040']"));
        sleep(1000);
        mainPage.moveToElement(By.cssSelector("div[id='wai-material']"));
        sleep(1500);
        mainPage.click(By.cssSelector(".facet-checkbox-label "));
        mainPage.click(By.linkText("Показать результаты"));


//        SearchResultPage searchResultPage = mainPage.searchForItem(itemToSearch);
     //   assertThat(searchResultPage.getSearchResultsCount().toLowerCase(), is("37"));
//        searchResultPage.header.selectFirstMenu();
     //   searchResultPage.selectFirstProduct();
        driver.quit();
    }



}
