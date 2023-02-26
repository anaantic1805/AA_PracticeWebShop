package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends CommonMethods{

   public HomePage(WebDriver driver, WebDriverWait wdWait) {
       this.driver = driver;
       this.wdWait = wdWait;
       PageFactory.initElements(driver, this);
   }


    @FindBy (css = "[class=\"sc-1mdw0md-0 sc-dxr9f4-0 cChESJ dma-dLd\"] > [class=\"sc-180pjr6-0 hKBpmR\"]")
    WebElement showAllCategories;

    @FindBy (xpath = "//div[@class=\"sc-1mdw0md-0 euCKKz\"]/div//a[contains(text(), \"Parfemi\")]")
    WebElement itemFromPopularCategory;

    @FindBy (xpath = "//div[@class=\"sc-1f6z3vw-0 haTYpo\"]/div[3]//a[contains(@href, \"zenski-parfemi\")]")
    WebElement showAllSubCategoriesProducts;

    @FindBy (xpath = "//div[@class=\"sc-3ghezf-0 cpOcUh\"]//select[@class=\"sc-c16oy5-0 gEIaoZ\"]")
    WebElement sortBy;


    public void clickShowAllSubCategoriesProducts(){
          clickElement(showAllSubCategoriesProducts);
    }

   public void clickPopularCategory () {
       clickElement(itemFromPopularCategory);
   }

   public void setSortBy (String text){
        selectElement(sortBy, text);
   }


}
