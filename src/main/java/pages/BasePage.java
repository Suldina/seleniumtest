package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import static Steps.CHDriver.getWebDriver;

abstract class FBasePage {
    WebDriver driver;

    public FBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }


    public void moveToElement(By element) {
        Actions action = new Actions(driver);

        WebElement elem = driver.findElement(element);
        action.moveToElement(elem);
        action.perform();
    }

    public void open(String url) {
        driver.get(url);
    }

    public void click(By element) {
        driver.findElement(element).click();
    }

    protected void inputText(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

}
