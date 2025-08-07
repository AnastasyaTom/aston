package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDetailsLink extends BaseSelenium {

    @Test
    public void testDetailsLink() {
        WebElement detailsLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(text(), 'Подробнее о сервисе')]")));
        detailsLink.click();
        assertTrue(driver.getCurrentUrl().contains("mts.by"),
                "Ссылка 'Подробнее о сервисе' не ведет на ожидаемую страницу");
    }
}
