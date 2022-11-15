package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StepInputDetails {
    private SelenideElement ChoseIndex = $(By.xpath("//select[@name='payment.remitterId']"));
    private SelenideElement CI50 = $(By.xpath("//option[@value='10036']"));
    private SelenideElement dateInput = $(By.xpath("//input[@name='payment.time']"));
    private SelenideElement numberInput = $(By.xpath("//input[@name='field.P_TEL']"));
    private SelenideElement moneyInput = $(By.xpath("//input[@name='payment.amount']"));
    private SelenideElement btnForward = $(By.xpath("//button[@id='forward']"));


    public void InputDetails() {
        ChoseIndex.should(Condition.visible).click();
        CI50.should(Condition.visible).click();
        dateInput.should(Condition.visible).val("11.12.2022");
        numberInput.should(Condition.visible).val("9502495700");
        moneyInput.should(Condition.visible).val("780");
        btnForward.should(Condition.visible).click();


    }

}
