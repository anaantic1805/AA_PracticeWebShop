package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

import java.time.Duration;
import java.util.NoSuchElementException;

public class TestFirst extends BaseTest{

    WebDriver driver = new ChromeDriver();
    WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(10));

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

        HomePage hp = new HomePage(driver, wdWait);
        hp.clickPopularCategory();
        hp.clickShowAllSubCategoriesProducts();
        hp.setSortBy("Najnovije");

        WebElement priceRangeFilter = driver.findElement(By.xpath("//div[@class=\"sc-1kcrxl6-1 dGwieP\"]//label[text()=\"Min.\"]/../div/input"));
        wdWait.until(ExpectedConditions.visibilityOf(priceRangeFilter));
        priceRangeFilter.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        priceRangeFilter.sendKeys(Keys.BACK_SPACE);
        priceRangeFilter.sendKeys("1200");
        driver.findElement(By.cssSelector("[class=\"sc-1vt7mai-0 sc-1kcrxl6-2 ddzlTv cGPxoX\"]")).click();


    }
}

