import com.UserOperations;
import generateTestData.OpenBrowser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import po.HomePage;
import po.LoginPage;

import java.util.Map;

public class PageTransitionsTest {

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
    public void transitionsPagePersonalArea() {
        HomePage homePage = new HomePage();
        Assertions.assertTrue(homePage.transitionByPersonalArea(), "Страница личного кабинета не загрузилась после авторизации");
    }

    @Test
    public void transitionsPageConstructor() {
        HomePage homePage = new HomePage();
        Assertions.assertTrue(homePage.transitionByConstructor(), "Главная страница через кнопку конструктор не загрузилась");
    }

    @Test
    public void transitionsPageLogo() {
        HomePage homePage = new HomePage();
        Assertions.assertTrue(homePage.transitionByLogo(), "Главная страница через при переходе через логотип не загрузилась");
    }
}