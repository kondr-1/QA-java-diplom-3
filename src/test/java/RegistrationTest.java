import com.UserOperations;
import generateTestData.OpenBrowser;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import po.RegisterPage;

import java.util.Map;

public class RegistrationTest {
    Map user;

    @BeforeEach
    public void setup() {
        OpenBrowser openBrowser = new OpenBrowser();
        openBrowser.openBrowserAndPageBergerLogin();
    }

    @AfterAll
    static void deleteUser() {
        new UserOperations().delete();
    }

    @Test
    public void RegistrationPositive() {
        user = new UserOperations().register();
        String email = (String) user.get("email");
        String password = (String) user.get("password");
        String name = (String) user.get("name");
        RegisterPage registerPage = new RegisterPage();
        registerPage.openFormRegistration();
        Assertions.assertTrue(registerPage.registrationUser(name, "ads2f" + email, password), "Не удалось зарегистрировать нового пользователя");
    }

    @Test
    public void RegistrationNegative() {
        RegisterPage registerPage = new RegisterPage();
        registerPage.openFormRegistration();
        registerPage.registrationUser("Антон", "asdf@asdf.com", "Пушки");
        Assertions.assertTrue(registerPage.errorRegistration(), "Зарегистрировалось два одинаковых пользователя");
    }
}