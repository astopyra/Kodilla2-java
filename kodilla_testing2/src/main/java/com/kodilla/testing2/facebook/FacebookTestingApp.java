package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class FacebookTestingApp {

    public static final String ACCEPT_BUTTON = "//div[@class=\"_9xo5\"]/button[2]";
    public static final String UTWORZ_NOWE_KONTO = "//div[@class=\"_6ltg\"]/a";
    public static final String day = "//span[@class=\"_5k_4\"]/span/select[1]";
    public static final String month = "//span[@class=\"_5k_4\"]/span/select[2]";
    public static final String year = "//span[@class=\"_5k_4\"]/span/select[3]";


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while(!driver.findElement(By.xpath(ACCEPT_BUTTON)).isDisplayed());
        driver.findElement(By.xpath(ACCEPT_BUTTON)).click();

        WebElement createAccount = driver.findElement(By.xpath(UTWORZ_NOWE_KONTO));
        createAccount.click();

        sleep(1000);

        WebElement setDay = driver.findElement(By.xpath(day));
        Select selectDay = new Select(setDay);
        selectDay.selectByIndex(6);

        WebElement setMonth = driver.findElement(By.xpath(month));
        Select selectMonth = new Select(setMonth);
        selectMonth.selectByIndex(11);

        WebElement setYear = driver.findElement(By.xpath(year));
        Select selectYear = new Select(setYear);
        selectYear.selectByIndex(30);
    }
}
