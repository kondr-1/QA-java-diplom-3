import com.UserOperations;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Actions;

import java.util.Map;

import static constant.Url.BERGER_HOME;
import static po.ForgotPasswordPage.*;
import static po.HeaderSite.BUTTON_PERSONAL_AREA;
import static po.HomePage.BUTTON_ENTER_ACCOUNT;
import static po.HomePage.CREATE_BURGER;
import static po.LoginPage.BUTTON_ENTER;
import static po.RegisterPage.*;

public class EnterTest {
    Map user;

    @BeforeEach
    public void setup() {
        user = new UserOperations().register();
        Configuration.startMaximized = true;
        //  System.setProperty("webdriver.chrome.driver", "C:/Diplom/Diplom_3/yandexdriver-22.1.0.2510-win/yandexdriver.exe");
        Assertions.assertTrue(Actions.openURL(BERGER_HOME, CREATE_BURGER), "Главная страница не загрузилась");
    }

    @AfterEach
    public void deleteUser() {
        new UserOperations().delete();
    }

    @Test
    public void enterAccount() {
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER_ACCOUNT, FIELD_EMAIL), "Старница входа в аккаунт не загрузилась");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_EMAIL, email), "Не удалось ввести email");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_PASSWORD, password), "Не удалось ввести пароль");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER, CREATE_BURGER), "Юзер не авторизовался");
    }

    @Test
    public void enterFromPersonArea() {
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_PERSONAL_AREA, FIELD_EMAIL), "Старница входа в аккаунт через личный кабинет не загрузилась");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_EMAIL, email), "Не удалось ввести email");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_PASSWORD, password), "Не удалось ввести пароль");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER, CREATE_BURGER), "Юзер не авторизовался");
    }

    @Test
    public void enterFromRegistration() {
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER_ACCOUNT, FIELD_EMAIL), "Старница входа в аккаунт не загрузилась");
        Assertions.assertTrue(Actions.clickAndShouldBe(REGISTRATION_BUTTON, FIELD_NAME), "Старница регистрации не загрузилась");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER_FROM_REGISTRATION, FIELD_EMAIL), "Старница входа в аккаунт через форму регистрации не загрузилась");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_EMAIL, email), "Не удалось ввести email");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_PASSWORD, password), "Не удалось ввести пароль");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER, CREATE_BURGER), "Юзер не авторизовался");
    }

    @Test
    public void enterFromRestorePassword() {
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER_ACCOUNT, FIELD_EMAIL), "Старница входа в аккаунт не загрузилась");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_RESTORE_PASSWORD, FIELD_EMAIL), "Старница восстановления пароля не загрузилась");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER_FROM_RESTORE_PASSWORD, FIELD_EMAIL), "Старница входа в аккаунт через форму восстановления пароля не загрузилась");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_EMAIL, email), "Не удалось ввести email");
        Assertions.assertTrue(Actions.clickAndSetValue(FIELD_PASSWORD, password), "Не удалось ввести пароль");
        Assertions.assertTrue(Actions.clickAndShouldBe(BUTTON_ENTER, CREATE_BURGER), "Юзер не авторизовался");
    }
}