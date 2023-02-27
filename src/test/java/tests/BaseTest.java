package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    public void setAcceptCookies (){
        WebElement acceptCookies = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"sc-1rhklln-0 jDfIno\"]")));
        acceptCookies.click();
    }

    public void closePopUp (){
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1000)");
            driver.findElement(By.cssSelector("[class=\"sc-254p7e-4 dHaYKH\"] [class=\"MuiSvgIcon-root\"]")).click();
        }catch (Exception e){
            System.out.println("Popup element is not found.");
            throw (e);
        }
    }

}
