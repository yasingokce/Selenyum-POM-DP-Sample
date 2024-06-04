package tests;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;
import pages.Pages;

public class AddChartAndDelete {

    // @Test
    // void loginTests() {
    // ChromeOptions options = new ChromeOptions();
    // options.addArguments("start-maximized");
    // WebDriver driver = new ChromeDriver(options);
    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
    // driver.get("https://www.kitapyurdu.com");
    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
    // "//input[@id='search-input']")));
    // driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("insan
    // pisikolojisi", Keys.ENTER);
    // wait.until(
    // ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='product-391337']/div[3]/div/a/img")));
    // driver.findElement(By.xpath("//*[@id='product-391337']/div[3]/div/a/img")).click();

    // }

    private WebDriver driver;
    private Pages page;
    private HomePage mainpage;
    private WebDriverWait wait;

    // kitapyurduload

    @BeforeEach
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        mainpage = new HomePage(driver, wait);
        page = new Pages(driver, wait);
        driver.get("https://www.kitapyurdu.com");
    }

    // kitapyurdu logintest

    @Test
    void kitaplogintest() {
        page.visibleInpageXpath(mainpage.searchPanel);
        page.usingSearchPanelxpath(mainpage.searchPanel, mainpage.findString);
        page.visibleInpageXpath(mainpage.ipLocator);
        page.selectItemxpath(mainpage.ipLocator);
        page.visibleInpageCssSelector(mainpage.packageString);
        page.selectItemCSS(mainpage.packageString);
        page.visibleInpageCssSelector(mainpage.basket);
        page.selectItemCSS(mainpage.basket);
        page.visibleInpageCssSelector(mainpage.basketbutton);
        page.selectItemCSS(mainpage.basketbutton);
        page.visibleInpageCssSelector(mainpage.deleteItems);
        page.selectItemCSS(mainpage.deleteItems);

    }

}
