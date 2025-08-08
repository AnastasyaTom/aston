package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPaymentSystemsLogos extends BaseSelenium {

    @Test
    public void testPaymentSystemsLogos() {
        acceptCookiesIfPresent();
        WebElement visa = driver.findElement(By.xpath("//img[@alt='Visa']"));
        WebElement verifiedByVisa = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        WebElement masterCard = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        WebElement masterSecureCode = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        WebElement belkart = driver.findElement(By.xpath("//img[@alt='Белкарт']"));

        assertAll(
                () -> assertTrue(visa.isDisplayed(), "Логотип виза не отображается"),
                () -> assertTrue(verifiedByVisa.isDisplayed(), "Логотип верифайд виза не отображается"),
                () -> assertTrue(masterCard.isDisplayed(), "Логотип мастер карт не отображается"),
                () -> assertTrue(masterSecureCode.isDisplayed(), "Логотип мастер секьюр карт не отображается"),
                () -> assertTrue(belkart.isDisplayed(), "Логотип белкарт не отображается")
        );
    }
}
