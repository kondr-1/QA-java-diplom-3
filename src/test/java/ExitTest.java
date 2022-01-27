import com.UserOperations;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Actions;

import java.util.Map;

import static constant.Url.BERGER_HOME;
import static po.LocatorsLogin.*;

public class ExitTest {
    Map user;

    @BeforeEach
    public void setup() {
        user = new UserOperations().register();
        Configuration.startMaximized = true;
        //  System.setProperty("webdriver.chrome.driver", "C:/Diplom/Diplom_3/yandexdriver-22.1.0.2510-win/yandexdriver.exe");
        Actions.openURL(BERGER_HOME, CREATE_BURGER);
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        Actions.clickAndShouldBe(BUTTON_ENTER_ACCOUNT, FIELD_EMAIL);
        Actions.clickAndSetValue(FIELD_EMAIL, email);
        Actions.clickAndSetValue(FIELD_PASSWORD, password);
        Actions.clickAndShouldBe(BUTTON_ENTER, CREATE_BURGER);
    }

    @AfterEach
    public void deleteUser() {
        new UserOperations().delete();
    }

    @Test
    public void exitAccount() {
        Actions.clickAndShouldBe(BUTTON_PERSONAL_AREA, BUTTON_EXIT_FROM_PERSONAL_AREA);
        Actions.clickAndShouldBe(BUTTON_EXIT_FROM_PERSONAL_AREA, FORM_ENTER);
    }
}