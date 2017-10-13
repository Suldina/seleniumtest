package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLDocument;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import sun.plugin.dom.DOMObject;
import sun.plugin.dom.html.HTMLElement;

import static Steps.CHDriver.getWebDriver;

@FindBy(id = "navigation-bar-menu-wrapper")
public class Header extends HtmlElement {

    @Name("Search request input")
    @FindBy(xpath = "//li[@class='center-nav-bar-element'][1]")
    private Button requestInput;

    public void selectFirstMenu() {
       requestInput.click();
    }



}
