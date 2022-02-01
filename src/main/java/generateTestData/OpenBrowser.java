package generateTestData;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static constant.Url.BERGER_HOME;
import static constant.Url.BERGER_LOGIN;
import static po.HomePage.createBurger;
import static po.RegisterPage.registrationButton;

public class OpenBrowser {
    public void openBrowserAndPageBergerHome() {
        Configuration.startMaximized = true;
        //  System.setProperty("webdriver.chrome.driver", "C:/Diplom/Diplom_3/yandexdriver-22.1.0.2510-win/yandexdriver.exe");
        open(BERGER_HOME);
        $(createBurger).shouldBe(Condition.visible);
    }

    public void openBrowserAndPageBergerLogin() {
        Configuration.startMaximized = true;
        //  System.setProperty("webdriver.chrome.driver", "C:/Diplom/Diplom_3/yandexdriver-22.1.0.2510-win/yandexdriver.exe");
        open(BERGER_LOGIN);
        $(registrationButton).shouldBe(Condition.visible);
    }
}