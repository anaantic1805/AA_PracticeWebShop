package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    public  WebDriver driver = new ChromeDriver();
    public  WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public void setAcceptCookies () {
      // Thread.sleep(10000);
      // driver.findElement(By.xpath("//button[@class=\\\"sc-1rhklln-0 jDfIno\\\"]")).click();
        wdWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"sc-1rhklln-0 jDfIno\"]"))).click();

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
