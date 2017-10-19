package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends FBasePage {

    public static final String PRODUCT_ITEM_CSS = ".product-card.js-product-card";
    public static final String SEARCH_RESULTS_COUNT_CSS = ".search-meta_results-number.type-h4.js-shelf-section";


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void selectFirstProduct() {
        List<WebElement> items = driver.findElements(By.cssSelector(PRODUCT_ITEM_CSS));
        items.get(0).click();
    }

    public String getSearchResultsCount() {
        return driver.findElement(By.cssSelector(SEARCH_RESULTS_COUNT_CSS)).getText().trim();
    }


}
