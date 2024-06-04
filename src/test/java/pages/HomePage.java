package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Pages {

    public final String searchPanel = "//input[@id='search-input']";
    public final String findString = "insan pisikolojisi";
    public final String ipLocator = "//*[@id='product-391337']/div[3]/div/a/img";
    public final String packageString = "#button-cart > span";
    public final String basket = "#cart-items";
    public final String basketbutton = "#js-cart";
    public final String deleteItems = ".red-icon";

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

}
