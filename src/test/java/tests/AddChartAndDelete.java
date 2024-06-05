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
    void bookAddAndDeleteTest() {
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
      @AfterEach
    void closeChromeDriver(){
        driver.close();
    }

}
