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

        //StepCheckNavMenu stepCheckNavMenu = new StepCheckNavMenu();
        //stepCheckNavMenu.checkNavMenu();

        //StepTestCase stepTestCase = new StepTestCase();
        //stepTestCase.TestCase();

        StepOpenAcc stepOpenAcc = new StepOpenAcc();
        stepOpenAcc.openAcc();

        StepOpenAISettings stepOpenAISettings = new StepOpenAISettings();
        stepOpenAISettings.openAISettings();

        sleep(4000);

    }

}
