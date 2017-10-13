package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends FBasePage {

    public static final String SEARCH_INPUT_CSS = "div.main-form__search-box>input";
    public static final String SEARCH_BUTTON_CSS = ".burb-icon-arrow-down";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage searchForItem(String text) {
        inputText(By.cssSelector(SEARCH_INPUT_CSS), text);
        click(By.cssSelector(SEARCH_BUTTON_CSS));
        return new SearchResultPage(driver);
    }

    public void open() {
        driver.navigate().to("https://ru.burberry.com/");
    }
    public void moveToElement(By element) {
        Actions action = new Actions(driver);

        WebElement elem = driver.findElement(element);
        action.moveToElement(elem);
        action.perform();}
}
