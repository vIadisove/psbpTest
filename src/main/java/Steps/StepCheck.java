package Steps;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StepCheck {
    private SelenideElement Message = $(By.xpath("//span[@class='error-message']"));


    public void Check(String Expected) {
        Assertions.assertEquals(Expected, Message.getText());



    }
}
