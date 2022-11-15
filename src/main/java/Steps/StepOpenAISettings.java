package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StepOpenAISettings {

    private SelenideElement buttonChoseValute = $(By.xpath("//select[@id='currencySelect']"));
    private SelenideElement usd = $(By.xpath("//option[@value='USD']"));
    private SelenideElement buttonChoseOfice = $(By.xpath("//select[@id='account-branch']"));
    private SelenideElement saintPt = $(By.xpath("//option[@value='077']"));
    private SelenideElement chekAgreemant = $(By.xpath("//label[@class='checkbox']"));
    private SelenideElement buttonSubmit = $(By.xpath("//button[@id='submit']"));

    public void openAISettings() {
        buttonChoseValute.should(Condition.visible).click();

        usd.should(Condition.visible).click();

        buttonChoseOfice.should(Condition.visible).click();

        saintPt.should(Condition.visible).click();

        chekAgreemant.should(Condition.visible).click();

        buttonSubmit.should(Condition.visible).click();





    }
}
