package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;
    WebDriverWait wdWait;

    public BasePage(WebDriver driver, WebDriverWait wdWait, WebElement searchBox, WebElement theWishList, WebElement logInSignUpButton, WebElement basket, WebElement contactUs, WebElement menuBurger, WebElement quickMenu1) {
        this.driver = driver;
        this.wdWait = wdWait;
        this.searchBox = searchBox;
        this.theWishList = theWishList;
        this.logInSignUpButton = logInSignUpButton;
        this.basket = basket;
        this.contactUs = contactUs;
        this.menuBurger = menuBurger;
        this.quickMenu1 = quickMenu1;
    }

    @FindBy (css = "[id=\"autocomplete-10-input\"]")
    WebElement searchBox;
    @FindBy(css = "[class=\"sc-pzftdr-0 bJLUGU\"]")
    WebElement theWishList;
    @FindBy(css = "[class=\"sc-180pjr6-0 sc-1qbsdb4-7 jakpRF fkfnRn\"] [class=\"sc-clw1va-0 kMOVVY\"]")
    WebElement logInSignUpButton;
    @FindBy(css = "[class=\"sc-180pjr6-0 sc-1qbsdb4-7 jakpRF dvrBtd\"]")
    WebElement basket;
    @FindBy (css = "[class=\"sc-180pjr6-0 sc-76rvd4-8 sc-76rvd4-9 jcuqeO cMJVGg dHJCYM\"]")
    WebElement contactUs;


    @FindBy (xpath = "//button[@class=\"sc-180pjr6-0 sc-ht0kga-1 jakpRF fzTJkR\"]")
    WebElement menuBurger;
    @FindBy (xpath = "//li[@class=\"sc-ht0kga-4 cJApNu\"]/a[contains(text(), \"\")]")
    WebElement quickMenu1;

    @FindBy (xpath = "//div[@class=\"sc-3ghezf-0 cpOcUh\"]//select[@class=\"sc-c16oy5-0 gEIaoZ\"]")
    WebElement sortBy;


}