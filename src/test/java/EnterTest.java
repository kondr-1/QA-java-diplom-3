import com.UserOperations;
import generateTestData.OpenBrowser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import po.LoginPage;

import java.util.Map;

public class EnterTest {
    Map user;
    String email;
    String password;

    @BeforeEach
    public void setup() {
        user = new UserOperations().register();
        OpenBrowser openBrowser = new OpenBrowser();
        openBrowser.openBrowserAndPageBergerHome();
        email = (String) user.get("email");
        password = (String) user.get("password");
    }

    @AfterEach
    public void deleteUser() {
        new UserOperations().delete();
    }

    @Test
    public void enterAccount() {
        LoginPage loginPage = new LoginPage();
        Assertions.assertTrue(loginPage.openEnterAccount(), "Страница Авторизации  не открылась");
        Assertions.assertTrue(loginPage.loginUser(email, password), "Юзер не авторизовался");
    }

    @Test
    public void enterFromPersonArea() {
        LoginPage loginPage = new LoginPage();
        Assertions.assertTrue(loginPage.openLoginPagePersonArea(), "Страница Авторизации через личный кабинет не отекрылась");
        Assertions.assertTrue(loginPage.loginUser(email, password), "Юзер не авторизовался");
    }

    @Test
    public void enterFromRegistration() {
        LoginPage loginPage = new LoginPage();
        Assertions.assertTrue(loginPage.openLoginPageRegistration(), "Страница Авторизации через форму регистрации не отекрылась");
        Assertions.assertTrue(loginPage.loginUser(email, password), "Юзер не авторизовался");
    }

    @Test
    public void enterFromRestorePassword() {
        LoginPage loginPage = new LoginPage();
        Assertions.assertTrue(loginPage.openLoginPageFromRestorePassword(), "Страница Авторизации через форму восстановления пароля не отекрылась");
        Assertions.assertTrue(loginPage.loginUser(email, password), "Юзер не авторизовался");
    }
}