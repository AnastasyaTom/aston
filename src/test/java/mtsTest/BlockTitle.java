package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlockTitle extends BaseSelenium {

    @Test
    public void blockTitle() {
        try {
            WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//h2[contains(., 'пополнение без комиссии')]")));
            Assertions.assertEquals("Онлайн пополнение без комиссии", blockTitle.getText());
        } catch (TimeoutException e) {
            throw new NoSuchElementException("❌ Блок 'Онлайн пополнение без комиссии' не найден. Возможно, страница изменилась.");
        }
    }

}




