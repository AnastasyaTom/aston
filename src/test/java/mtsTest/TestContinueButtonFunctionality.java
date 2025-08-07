package mtsTest;

import base.BaseSelenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class TestContinueButtonFunctionality extends BaseSelenium {

    @Test
    public void testContinueButtonFunctionality() {
        try {

            WebElement serviceType = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[@class='select_header' and contains(.,'Услуги связи')]")));
            serviceType.click();

            WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("connection-phone")));
            phoneInput.clear();
            phoneInput.sendKeys("297777777");


            WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(.,'Продолжить')]")));
            assertTrue(continueButton.isEnabled(), "Кнопка 'Продолжить' должна быть активна");
            continueButton.click();

            WebElement nextStep = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("next-step-element")));
            assertTrue(nextStep.isDisplayed(), "После нажатия кнопки должен отображаться следующий шаг");

        } catch (Exception e) {
            fail("Тест не пройден: " + e.getMessage());
        }
    }


}
