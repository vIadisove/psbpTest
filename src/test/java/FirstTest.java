import Steps.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import javax.xml.soap.Text;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest extends Config {


    @Test
    public void test1() {

        StepAutoriz sa = new StepAutoriz();
        sa.stepAutoriz("demo", "demo");

        StepConfirm stepConfirm = new StepConfirm();
        stepConfirm.confirm("0000");

        StepChoseService stepChoseService = new StepChoseService();
        stepChoseService.ChoseService();

        StepInputDetails stepInputDetails = new StepInputDetails();
        stepInputDetails.InputDetails();

        StepCheck stepCheck = new StepCheck();
        stepCheck.Check("В демо-версии переводы не разрешены");

    }

}
