package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pages {

    WebDriver driver;
    WebDriverWait wait;

    public Pages(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void visibleInpageCssSelector(String elementId) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementId)));
    }

    public void visibleInpageXpath(String elementId) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementId)));
    }

    public void visibleInpageId(String elementId) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
    }

    public void usingSearchPanelxpath(String tusId, String uText) {
        driver.findElement(By.xpath(tusId)).sendKeys(uText, Keys.ENTER);
    }

    public void selectItemxpath(String itemPath) {
        driver.findElement(By.xpath(itemPath)).click();

    }

    public void selectItemCSS(String itemPath) {
        driver.findElement(By.cssSelector(itemPath)).click();

    }

}
