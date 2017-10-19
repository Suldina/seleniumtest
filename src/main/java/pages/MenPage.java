package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MenPage {

    public static final String PRODUCT_ITEM_CSS = ".product-card.js-product-card";
    public static final String SEARCH_RESULTS_COUNT_CSS = ".search-meta_results-number.type-h4.js-shelf-section";


    public MenPage() {
    }

    public void selectFirstProduct() {
        List<SelenideElement> items = $$(By.cssSelector(PRODUCT_ITEM_CSS));
        items.get(0).click();
    }

    public void selectFirstProductSelenide() {
        List<SelenideElement> items = $$(By.cssSelector(PRODUCT_ITEM_CSS));
        items.get(0).shouldBe(Condition.enabled).click();
        items.get(1).shouldHave(Condition.exactText("blabla"));
    }

    public String getSearchResultsCount() {
        return $(By.cssSelector(SEARCH_RESULTS_COUNT_CSS)).getText().trim();
    }



}
