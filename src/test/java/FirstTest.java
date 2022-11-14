import Steps.StepAutoriz;
import Steps.StepCheckNavMenu;
import Steps.StepConfirm;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest extends Config {

    @Test
    public void test1() {

        StepAutoriz sa = new StepAutoriz();
        sa.stepAutoriz("demo", "demo");

        StepConfirm stepConfirm = new StepConfirm();
        stepConfirm.confirm("0000");

        StepCheckNavMenu stepCheckNavMenu = new StepCheckNavMenu();
        stepCheckNavMenu.checkNavMenu();

    }

}
