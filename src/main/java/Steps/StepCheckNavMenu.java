package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class StepCheckNavMenu {

    private SelenideElement bankOverview = $(By.xpath("//a[@id='bank-overview']"));
    private SelenideElement accIndex = $(By.xpath("//a[@id='accounts-index']"));
    private SelenideElement payments = $(By.xpath("//a[@id='payments-form']"));
    private SelenideElement cards = $(By.xpath("//a[@id='cards-overview-index']"));
    private SelenideElement deposits = $(By.xpath("//a[@id='deposits-index']"));
    private SelenideElement kredits = $(By.xpath("//a[@id='loans-index']"));
    private SelenideElement valutes = $(By.xpath("//a[@id='externaltraderoom-index']"));
    private SelenideElement insurances = $(By.xpath("//a[@id='insurance-travel']"));


    public void checkNavMenu(){

        bankOverview.should(Condition.visible).click();
        Assertions.assertEquals(bankOverview.getText(), "ОБЗОР");

        accIndex.should(Condition.visible).click();
        Assertions.assertEquals(accIndex.getText(), "СЧЕТА");

        payments.should(Condition.visible).click();
        Assertions.assertEquals(payments.getText(), "ПЛАТЕЖИ И ПЕРЕВОДЫ");

        cards.should(Condition.visible).click();
        Assertions.assertEquals(cards.getText(), "КАРТЫ");

        deposits.should(Condition.visible).click();
        Assertions.assertEquals(deposits.getText(), "ВКЛАДЫ");

        kredits.should(Condition.visible).click();
        Assertions.assertEquals(kredits.getText(), "КРЕДИТЫ");

        valutes.should(Condition.visible).click();
        Assertions.assertEquals(valutes.getText(), "ВАЛЮТА");

        insurances.should(Condition.visible).click();
        Assertions.assertEquals(insurances.getText(), "СТРАХОВАНИЕ");

    }
}
