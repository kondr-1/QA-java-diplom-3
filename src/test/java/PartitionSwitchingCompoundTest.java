import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Actions;

import static constant.Url.BERGER_HOME;
import static po.HomePage.*;

public class PartitionSwitchingCompoundTest {

    @BeforeEach
    public void setup() {
        Configuration.startMaximized = true;
        //  System.setProperty("webdriver.chrome.driver", "C:/Diplom/Diplom_3/yandexdriver-22.1.0.2510-win/yandexdriver.exe");
        Assertions.assertTrue(Actions.openURL(BERGER_HOME, CREATE_BURGER), "Не удалось открыть страницу");
    }

    @Test
    public void transitionsIngredientBurger() {
        int locationsDefaultBun = Actions.getLocationElementY(TEXT_BUN);
        int locationsDefaultSauce = Actions.getLocationElementY(TEXT_SAUCE);
        int locationsDefaultTopping = Actions.getLocationElementY(TEXT_TOPPINGS);
        Assertions.assertTrue(Actions.clickAndShouldBe(CHAPTER_SAUCE, ALLOCATED_SAUCE), "Элемент соусы не выделен");
        Assertions.assertTrue(locationsDefaultSauce != Actions.getLocationElementY(TEXT_SAUCE),"Страница до соусов не прокрутилась");
        Assertions.assertTrue(Actions.clickAndShouldBe(CHAPTER_TOPPINGS, ALLOCATED_TOPPINGS), "Элемент начинка не выделен");
        Assertions.assertTrue(locationsDefaultTopping != Actions.getLocationElementY(TEXT_TOPPINGS),"Страница до начинок не прокрутилась");
        Assertions.assertTrue(Actions.clickAndShouldBe(CHAPTER_BUN, ALLOCATED_BUN), "Элемент булки не выделен");
        Assertions.assertTrue(locationsDefaultBun != Actions.getLocationElementY(TEXT_BUN),"Страница до булок не прокрутилась");
    }
}