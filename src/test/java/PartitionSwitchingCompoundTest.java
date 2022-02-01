import generateTestData.OpenBrowser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import po.HomePage;

public class PartitionSwitchingCompoundTest {

    @BeforeEach
    public void setup() {
        OpenBrowser openBrowser = new OpenBrowser();
        openBrowser.openBrowserAndPageBergerHome();
    }

    @Test
    public void transitionsIngredientBurger() {
        HomePage homePage = new HomePage();
        Assertions.assertTrue(homePage.checkItemAllottedSauce(), "Элемент соусы не выделен страница не прокрутилась");
        Assertions.assertTrue(homePage.checkItemAllottedToppings(), "Элемент соусы не выделен страница не прокрутилась");
        Assertions.assertTrue(homePage.checkItemAllottedBun(), "Элемент Булки не выделен страница не прокрутилась");
    }
}