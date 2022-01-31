import com.UserOperations;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Actions;

import java.util.Map;

import static constant.Url.BERGER_LOGIN;
import static po.LoginPage.FORM_ENTER;
import static po.RegisterPage.*;

public class RegistrationTest {
    Map user;

    @BeforeEach
    public void setup() {
        Configuration.startMaximized = true;
        // System.setProperty("webdriver.chrome.driver", "C:/Diplom/Diplom_3/yandexdriver-22.1.0.2510-win/yandexdriver.exe");
        Assertions.assertTrue(Actions.openURL(BERGER_LOGIN, REGISTRATION_BUTTON), "Не удалось открыть страницу");
    }

    @Test
    public void RegistrationPositive() {
        user = new UserOperations().register();
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        String name = (String) user.get("name");
        Assertions.assertTrue(Actions.click(REGISTRATION_BUTTON), "Не удалось нажать на элемент");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_NAME, name), "Не удалось ввести имя");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_EMAIL, "asdf" + email), "Не удалось ввести email");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_PASSWORD, password), "Не удалось ввести пароль");
        Assertions.assertTrue(Actions.clickAndShouldBe(REGISTRATION_BUTTON_OK, FORM_ENTER), "Юзер не зарегистрирован");
        new UserOperations().delete();
    }

    @Test
    public void RegistrationNegative() {
        Assertions.assertTrue(Actions.click(REGISTRATION_BUTTON), "Не удалось нажать на элемент");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_NAME, "Антон"), "Не удалось ввести имя");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_EMAIL, "asdf@asdf.com"), "Не удалось ввести email");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_PASSWORD, "Пушки"), "Не удалось ввести пароль");
        Assertions.assertTrue(Actions.clickAndShouldBe(REGISTRATION_BUTTON_OK, REGISTRATION_ERROR_PASSWORD), "Зарегистрировалось два одинаковых пользователя");
    }
}