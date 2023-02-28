package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

public class TestFirst extends BaseTest{



    @BeforeMethod
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver.get("https://ananas.rs/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void filterChecking() {

        setAcceptCookies();
        closePopUp();

        HomePage hp = new HomePage(driver, wdWait);
        hp.clickPopularCategory();
        hp.clickShowAllSubCategoriesProducts();
        hp.setSortBy("Najnovije");

        WebElement priceRangeFilter = driver.findElement(By.xpath("//div[@class=\"sc-1kcrxl6-1 dGwieP\"]//label[text()=\"Min.\"]/../div/input"));
        wdWait.until(ExpectedConditions.visibilityOf(priceRangeFilter));
        priceRangeFilter.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        priceRangeFilter.sendKeys(Keys.BACK_SPACE);
        priceRangeFilter.sendKeys("1200");
        wdWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=\"sc-1vt7mai-0 sc-1kcrxl6-2 ddzlTv cGPxoX\"]")));


    }
}

