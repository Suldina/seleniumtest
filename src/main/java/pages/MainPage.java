package pages;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    public static final String SEARCH_INPUT_CSS = "div.main-form__search-box>input";
    public static final String SEARCH_BUTTON_CSS = ".burb-icon-arrow-down";

    public void searchForItem(String text) {
        $(By.cssSelector(SEARCH_INPUT_CSS)).setValue(text);
        $(By.cssSelector(SEARCH_BUTTON_CSS)).click();
    }

    public void openPage() {
        open("https://ru.burberry.com/");
    }

    public MenPage selectNavigationItemByText(String itemName) {
        $(By.linkText(itemName)).shouldHave(Condition.exactText("text")).hover();
        return new MenPage();
    }
}
