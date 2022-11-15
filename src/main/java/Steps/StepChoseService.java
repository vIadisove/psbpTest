package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StepChoseService {

    private SelenideElement btnPayments = $(By.xpath("//a[@id='payments-form']"));
    private SelenideElement btnPaymentsServices = $(By.xpath("//a[@class='payment-menu-icon vendor-payments']"));
    private SelenideElement btnInternet = $(By.xpath("//div[@title='Интернет, ТВ, телефония']"));
    private SelenideElement btnPoNumber = $(By.xpath("//a[@class='name ']"));



    public void ChoseService() {
        btnPayments.should(Condition.visible).click();
        btnPaymentsServices.should(Condition.visible).click();
        btnInternet.should(Condition.visible).click();
        btnPoNumber.should(Condition.visible).click();







    }
}
