import com.UserOperations;
import generateTestData.OpenBrowser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import po.HomePage;
import po.LoginPage;

import java.util.Map;

public class ExitTest {
    Map user;

    @BeforeEach
    public void setup() {
        user = new UserOperations().register();
        String email = (String) user.get("email");
        String password = (String) user.get("password");

        OpenBrowser openBrowser = new OpenBrowser();
        openBrowser.openBrowserAndPageBergerHome();
        LoginPage loginPage = new LoginPage();
        loginPage.openEnterAccount();
        Assertions.assertTrue(loginPage.loginUser(email, password), "Юзер не авторизовался");
    }

    @AfterEach
    public void deleteUser() {
        new UserOperations().delete();
    }

    @Test
    public void exitAccount() {
        HomePage homePage = new HomePage();
        Assertions.assertTrue(homePage.exitPersonalArea(), "Выход из личного кабинета не удался");
    }
}