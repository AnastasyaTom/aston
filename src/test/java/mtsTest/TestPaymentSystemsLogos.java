package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPaymentSystemsLogos extends BaseSelenium {

    @Test
    public void testPaymentSystemsLogos() {
        List<WebElement> paymentLogos = driver.findElements(
                By.xpath("//div[contains(@class, 'payment-systems')]//img[contains(@src, 'payment')]"));
        for (WebElement logo : paymentLogos) {
            assertTrue(logo.isDisplayed(), "Логотип платежной системы не отображается");
        }

    }
}
