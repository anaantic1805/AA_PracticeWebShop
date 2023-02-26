package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

    WebDriver driver;
    WebDriverWait wdWait;

    public void clickElement(WebElement element)   {
        wdWait.until(ExpectedConditions.elementToBeClickable(element));
        wdWait.until(ExpectedConditions.visibilityOf(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        try {
            element.click();
        } catch (StaleElementReferenceException e) {
            element.click();
        }
    }

    public void selectElement(WebElement element, String text){
        wdWait.until(ExpectedConditions.visibilityOf(element));
        Select select  = new Select(element);
        select.selectByVisibleText(text);
    }


}
