import com.UserOperations;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Actions;

import java.util.Map;

import static constant.Url.BERGER_HOME;
import static po.AccountProfilePage.BUTTON_EXIT_FROM_PERSONAL_AREA;
import static po.HeaderSite.BUTTON_PERSONAL_AREA;
import static po.HomePage.BUTTON_ENTER_ACCOUNT;
import static po.HomePage.CREATE_BURGER;
import static po.LoginPage.BUTTON_ENTER;
import static po.LoginPage.FORM_ENTER;
import static po.RegisterPage.FIELD_EMAIL;
import static po.RegisterPage.FIELD_PASSWORD;

public class ExitTest {
    Map user;

    @BeforeEach
    public void setup() {
        user = new UserOperations().register();
        Configuration.startMaximized = true;
        //  System.setProperty("webdriver.chrome.driver", "C:/Diplom/Diplom_3/yandexdriver-22.1.0.2510-win/yandexdriver.exe");
        Assertions.assertTrue(Actions.openURL(BERGER_HOME, CREATE_BURGER), "Страница главная не загрузилась");
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER_ACCOUNT, FIELD_EMAIL), "Страница не загрузилась");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_EMAIL, email), "Не удалось ввести email");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_PASSWORD, password), "Не удалось ввести пароль");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER, CREATE_BURGER), "Страница главная не загрузилась после авторизации");
    }

    @AfterEach
    public void deleteUser() {
        new UserOperations().delete();
    }

    @Test
    public void exitAccount() {
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_PERSONAL_AREA, BUTTON_EXIT_FROM_PERSONAL_AREA), "Страница личный кабинет не загрузилась");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_EXIT_FROM_PERSONAL_AREA, FORM_ENTER), "Выход из личного кабинета не удался");
    }
}