import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Actions;

import static constant.Url.BERGER_HOME;
import static po.LocatorsLogin.*;

public class PartitionSwitchingCompoundTest {

    @BeforeEach
    public void setup() {
        Configuration.startMaximized = true;
        //  System.setProperty("webdriver.chrome.driver", "C:/Diplom/Diplom_3/yandexdriver-22.1.0.2510-win/yandexdriver.exe");
        Actions.openURL(BERGER_HOME, CREATE_BURGER);

    }

    @Test
    public void transitionsIngredientBurger() {
        int locationsDefaultBun = Actions.getLocationElementY(TEXT_BUN);
        int locationsDefaultSauce = Actions.getLocationElementY(TEXT_SAUCE);
        int locationsDefaultTopping = Actions.getLocationElementY(TEXT_TOPPINGS);
        Actions.clickAndShouldBe(CHAPTER_SAUCE, ALLOCATED_SAUCE);
        Assertions.assertTrue(locationsDefaultSauce != Actions.getLocationElementY(TEXT_SAUCE));
        Actions.clickAndShouldBe(CHAPTER_TOPPINGS, ALLOCATED_TOPPINGS);
        Assertions.assertTrue(locationsDefaultTopping != Actions.getLocationElementY(TEXT_TOPPINGS));
        Actions.clickAndShouldBe(CHAPTER_BUN, ALLOCATED_BUN);
        Assertions.assertTrue(locationsDefaultBun != Actions.getLocationElementY(TEXT_BUN));
    }
}