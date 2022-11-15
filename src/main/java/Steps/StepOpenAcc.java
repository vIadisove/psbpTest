package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StepOpenAcc {

    private SelenideElement buttonAccIndex = $(By.xpath("//a[@id='accounts-index']"));
    private SelenideElement buttonOpenAcc = $(By.xpath("//a[@class='btn btn-primary']"));



    public void openAcc() {
        buttonAccIndex.should(Condition.visible).click();

        buttonOpenAcc.should(Condition.visible).click();

    }
}
