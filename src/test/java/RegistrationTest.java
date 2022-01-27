import com.UserOperations;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Actions;

import java.util.Map;

import static constant.Url.BERGER_LOGIN;
import static po.LocatorsLogin.*;

public class RegistrationTest {
    Map user;

    @BeforeEach
    public void setup() {
        Configuration.startMaximized = true;
        // System.setProperty("webdriver.chrome.driver", "C:/Diplom/Diplom_3/yandexdriver-22.1.0.2510-win/yandexdriver.exe");
        Actions.openURL(BERGER_LOGIN, REGISTRATION_BUTTON);
    }

    @Test
    public void RegistrationPositive() {
        user = new UserOperations().register();
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        String name = (String) user.get("name");//jWMKVBcplA
        Actions.click(REGISTRATION_BUTTON);
        Actions.clickAndSetValue(FIELD_NAME, name);
        Actions.clickAndSetValue(FIELD_EMAIL, "asdf" + email);//bbhniomhdew@yandex.ru
        Actions.clickAndSetValue(FIELD_PASSWORD, password);
        Actions.clickAndShouldBe(REGISTRATION_BUTTON_OK, FORM_ENTER);
        new UserOperations().delete();
    }

    @Test
    public void RegistrationNegative() {
        Actions.click(REGISTRATION_BUTTON);
        Actions.clickAndSetValue(FIELD_NAME, "Антон");
        Actions.clickAndSetValue(FIELD_EMAIL, "asdf@asdf.com");
        Actions.clickAndSetValue(FIELD_PASSWORD, "Пушки");
        Actions.clickAndShouldBe(REGISTRATION_BUTTON_OK, REGISTRATION_ERROR_PASSWORD);
    }
}