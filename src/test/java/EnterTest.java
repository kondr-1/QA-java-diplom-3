import com.UserOperations;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Actions;

import java.util.Map;

import static constant.Url.BERGER_HOME;
import static po.LocatorsLogin.*;

public class EnterTest {
    Map user;

    @BeforeEach
    public void setup() {
        user = new UserOperations().register();
        Configuration.startMaximized = true;
        //  System.setProperty("webdriver.chrome.driver", "C:/Diplom/Diplom_3/yandexdriver-22.1.0.2510-win/yandexdriver.exe");
        Actions.openURL(BERGER_HOME, CREATE_BURGER);
    }

    @AfterEach
    public void deleteUser() {
        new UserOperations().delete();
    }

    @Test
    public void enterAccount() {
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        Actions.clickAndShouldBe(BUTTON_ENTER_ACCOUNT, FIELD_EMAIL);
        Actions.clickAndSetValue(FIELD_EMAIL, email);
        Actions.clickAndSetValue(FIELD_PASSWORD, password);
        Actions.clickAndShouldBe(BUTTON_ENTER, CREATE_BURGER);
    }

    @Test
    public void enterFromPersonArea() {
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        Actions.clickAndShouldBe(BUTTON_PERSONAL_AREA, FIELD_EMAIL);
        Actions.clickAndSetValue(FIELD_EMAIL, email);
        Actions.clickAndSetValue(FIELD_PASSWORD, password);
        Actions.clickAndShouldBe(BUTTON_ENTER, CREATE_BURGER);
    }

    @Test
    public void enterFromRegistration() {
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        Actions.clickAndShouldBe(BUTTON_ENTER_ACCOUNT, FIELD_EMAIL);
        Actions.clickAndShouldBe(REGISTRATION_BUTTON, FIELD_NAME);
        Actions.clickAndShouldBe(BUTTON_ENTER_FROM_REGISTRATION, FIELD_EMAIL);
        Actions.clickAndSetValue(FIELD_EMAIL, email);
        Actions.clickAndSetValue(FIELD_PASSWORD, password);
        Actions.clickAndShouldBe(BUTTON_ENTER, CREATE_BURGER);
    }

    @Test
    public void enterFromRestorePassword() {
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        Actions.clickAndShouldBe(BUTTON_ENTER_ACCOUNT, FIELD_EMAIL);
        Actions.clickAndShouldBe(BUTTON_RESTORE_PASSWORD, FIELD_EMAIL);
        Actions.clickAndShouldBe(BUTTON_ENTER_FROM_RESTORE_PASSWORD, FIELD_EMAIL);
        Actions.clickAndSetValue(FIELD_EMAIL, email);
        Actions.clickAndSetValue(FIELD_PASSWORD, password);
        Actions.clickAndShouldBe(BUTTON_ENTER, CREATE_BURGER);
    }
}